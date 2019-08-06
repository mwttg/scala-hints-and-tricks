package org.extract.similarities.solution.withtrait

trait Decoder {
  def apply(input: String): String = {
    if (input.length < 5) throw new RuntimeException("ÄhhhtschePätsch")

    val decoded = decode(input)
    step2(decoded)
  }

  def decode(input: String): String

  private def step2(input: String) =
    input + "-adding-step2"
}
