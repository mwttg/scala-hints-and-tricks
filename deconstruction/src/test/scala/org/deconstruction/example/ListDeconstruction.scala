package org.deconstruction.example
import org.scalatest.{Matchers, WordSpec}

class ListDeconstruction extends WordSpec with Matchers {
  "decompose a list" should {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    "extract the first two entries" in {
      val first :: second :: Nil = list

      first shouldBe 1
      second shouldBe 2
    }

    "the same without Destructuring" in {
      val first  = list.head
      val second = list(1)

      first shouldBe 1
      second shouldBe 2
    }

    "extract the first three entries" in {
      val first :: second :: third :: Nil = list

      first shouldBe 1
      second shouldBe 2
      third shouldBe 3
    }
  }
}
