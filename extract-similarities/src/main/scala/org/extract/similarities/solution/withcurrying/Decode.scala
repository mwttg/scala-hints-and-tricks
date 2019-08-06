package org.extract.similarities.solution.withcurrying

object Decode {
  def apply(decFunc: String => String)(input: String): String = {
    if (input.length < 5) throw new RuntimeException("ÄhhhtschePätsch")

    val decoded = decFunc(input)
    step2(decoded)
  }

  private def step2(input: String) = input + "-adding-step2"
}
