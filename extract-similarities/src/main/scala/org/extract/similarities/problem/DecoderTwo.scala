package org.extract.similarities.problem

object DecoderTwo {
  def apply(input: String): String = {
    if (input.length < 5) throw new RuntimeException("ÄhhhtschePätsch")

    val decoded = input.toLowerCase
    step2(decoded)
  }

  private def step2(input: String) =
    input + "-adding-step2"
}
