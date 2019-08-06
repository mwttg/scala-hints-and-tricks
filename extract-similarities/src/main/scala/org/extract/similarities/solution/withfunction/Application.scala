package org.extract.similarities.solution.withfunction

object Application {
  def main(args: Array[String]): Unit = {

    val input = "MeSsAgE-to-DeCoDe"
    // val input = "1"

    val decoded1 = Decode(DecodeOneFunc(), input)
    val decoded2 = Decode(DecodeTwoFunc(), input)

    println(decoded1)
    println(decoded2)
  }
}
