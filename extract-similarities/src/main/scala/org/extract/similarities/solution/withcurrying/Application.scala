package org.extract.similarities.solution.withcurrying

object Application {
  def main(args: Array[String]): Unit = {

    // val input    = "MeSsAgE-to-DeCoDe"
    val input = "1"

    val decoded1 = decoder1(input)
    val decoded2 = decoder2(input)

    println(decoded1)
    println(decoded2)
  }

  private def decoder1 = Decode(DecodeOneFunc())(_)

  private def decoder2 = Decode(DecodeTwoFunc())(_)
}
