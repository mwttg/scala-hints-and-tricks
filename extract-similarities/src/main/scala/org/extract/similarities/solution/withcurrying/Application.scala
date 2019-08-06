package org.extract.similarities.solution.withcurrying

object Application {
  def main(args: Array[String]): Unit = {

    val input = "MeSsAgE-to-DeCoDe"
    // val input = "1"

    val decoded1 = decoder1(input)
    val decoded2 = decoder2(input)

    println(decoded1)
    println(decoded2)
  }

  // If giving in method names without `()` the function (code) is given in (not the result (by calling the function)
  private val decoder1: String => String = Decode(DecoderFunctions.decode1)
  private val decoder2: String => String = Decode(DecoderFunctions.decode2)

  // works also:
  // private def decoder2(input: String) = Decode(DecodeTwoFunc())(input) // This is not currying
  // private def decoder2 = Decode(DecoderFunctions.decode2)(_) // currying with def, but what means (_)   ;)
}
