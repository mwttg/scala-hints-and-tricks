package org.the.problem

import java.io.{ BufferedWriter, File, FileWriter }

import scala.io.Source
import scala.util.{ Failure, Success, Try }

final case class KeyValue(key: String, value: Int)

object BusinessProcess {

  def execute(source: String, target: String): Unit = {
    val keyValues = Try(Source.fromResource(source).getLines().toList) match {
      case Failure(exception) =>
        None
      case Success(content) =>
        val markerLines = content.filter(line => line.startsWith("#marker#"))
        val allPairs    = markerLines.flatMap(line => line.split("#marker#")).filter(_.nonEmpty)
        allPairs.map(line => {
          val pair  = line.split("-")
          val key   = pair(0)
          val value = pair(1).toInt
          KeyValue(key, value)
        }) match {
          case Nil => None
          case x => Some(x)
        }
    }

    val transformed = keyValues match {
      case None =>
        None
      case Some(keyValues) =>
        val result = keyValues.map(keyValue => {
          val fromDatabase = fetchFromDatabase()
          val result       = keyValue.value + fromDatabase
          s"Key=${keyValue.key} Value=$result"
        })
        Some(result)
    }

    transformed match {
      case None => println("error")
      case Some(items) =>
        val targetContent = items.foldLeft("") { (accumulator, line) =>
          accumulator + line + "\n"
        }
        val file = new File(target)
        val bw   = new BufferedWriter(new FileWriter(file))
        bw.write(targetContent)
        bw.close()
    }
  }

  def fetchFromDatabase(): Int = {
    println("fetch from database")
    25
  }
}
