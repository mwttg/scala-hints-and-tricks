package org.presentation.part1
import org.scalatest.{ Matchers, WordSpec }

class Deconstruction extends WordSpec with Matchers {
  "Destructuring/Deconstruction" must {

    "destructure a list" should {
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
    }

    "destructure a case class" should {
      final case class Person(name: String, age: Int, note: String)
      val person = Person("Otto", 23, "funny")

      "extract some parameters" in {
        //   Type  variable-names   _ means don't extract this field
        val Person(_, a, n) = person

        a shouldBe 23
        n shouldBe "funny"
      }
      "the same without Destructuring" in {
        val a = person.age
        val n = person.note

        a shouldBe 23
        n shouldBe "funny"
      }
    }
  }
}
