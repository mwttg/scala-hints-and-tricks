package org.extract.similarities.problem

object DecoderOne {
  def apply(input: String): String = {
    if (input.length < 5) throw new RuntimeException("ÄhhhtschePätsch")

    val decoded = input.toUpperCase
    step2(decoded)
  }

  private def step2(input: String) =
    input + "-adding-step2"
}
