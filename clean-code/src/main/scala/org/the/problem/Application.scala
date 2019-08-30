package org.the.problem

object Application {
  def main(args: Array[String]): Unit = {
    val source = "source-file.txt"
    val target = "target-file.txt"
    BusinessProcess.execute(source, target)
  }
}
