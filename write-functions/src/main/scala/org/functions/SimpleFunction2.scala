package org.functions

object SimpleFunction2 extends ((Int, Int) => Int) { // same as: extends Function2[Int, Int, Int]
  // here the object is the function (not a namespace)
  override def apply(x: Int, y: Int): Int = x + y
}
