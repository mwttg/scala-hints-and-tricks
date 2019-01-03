package org.presentation.part2
import org.scalatest.{ Matchers, WordSpec }

class Currying extends WordSpec with Matchers {
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
      // https://dzone.com/articles/understanding-currying-scala
      "more practical example" in {
        // create an example
        // f = service 1) get Items from database
        //             2) filter Items from Database
        //             3) add date to filtered Items
        //
        // g = filter Items and add date [for Entity 1]
        // h = filter Items and add date [for Entity 2]
        //
        // i = add date to prefix filtered items for Entity1  i(x) = g(filterPrefix)(Entity1)
        // j = add date to suffix filtered items for Entity2  j(x) = g(filterSuffix)(Entity2)
      }
    }
  }
}
