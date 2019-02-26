package org.currying.example

import org.scalatest.{Matchers, WordSpec}

class SimpleCurrying extends WordSpec with Matchers {
  "Currying" must {
    "be crazy" should {
      "should return a result" in {
        // lets define a simple function
        def f(x: Int)(y: Int)(z: Int) = x + y + z

        // lets define another function depending on f
        def g(y: Int)(z: Int) = f(2)(y)(z)

        f(2)(4)(6) shouldBe g(4)(6)

        //lets define a third function
        def h(z: Int) = g(4)(z)

        h(6) shouldBe g(4)(6)
        h(6) shouldBe f(2)(4)(6)
      }
    }
  }
}
