package org.extract.similarities.solution.withtrait

object Application {
  def main(args: Array[String]): Unit = {

    val input = "MeSsAgE-to-DeCoDe"
    // val input = "1"

    val decoded1 = One(input)
    val decoded2 = Two(input)

    println(decoded1)
    println(decoded2)
  }
}
