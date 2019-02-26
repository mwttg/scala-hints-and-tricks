package org.deconstruction.example

import org.scalatest.{Matchers, WordSpec}

class CaseClassDeconstruction extends WordSpec with Matchers {
  "decompose a case class" should {
    final case class Person(name: String, age: Int, note: String)
    val person = Person("Otto", 23, "funny")

    "extract some parameters" in {
      //    Type(variable-names)   _ means don't extract this field
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
