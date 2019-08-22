package org.functions

object Application {
  def main(args: Array[String]): Unit = {
    val result1 = SimpleFunction1.add(2, 3)
    val result2 = SimpleFunction2(2, 3)

    println(result1)
    println(result2)

    val input   = List(1, 2, 3, 4)
    val result3 = input.map(OtherFunction.incBy5)
    println(result3)
  }
}
