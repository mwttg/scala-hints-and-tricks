package org.presentation.part3
import org.scalatest.{ Matchers, WordSpec }

class Varargs extends WordSpec with Matchers {
  "Varargs" should {
    "be used like" in {
      method("Hello", "World!", "It's", "me", "Mario!")
    }
    "what happen if you want to use a List?" in {
      val input = Array("Hello", "World!", "It's", "me", "Mario!")
      // method(input)
      // This creates a compile error, but see method2
    }
    "but we want to do it anyway!" in {
      val input = Array("Hello", "World!", "It's", "me", "Mario!")
      method(input: _*) // this gives the compiler the hint not to use the Array as parameter instead every item from the array is used as parameter
    }
  }

  private def method(input: String*): Unit = input.foreach(println)
}
