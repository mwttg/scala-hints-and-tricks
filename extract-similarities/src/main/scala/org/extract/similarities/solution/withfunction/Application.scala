package org.extract.similarities.solution.withfunction

object Application {
  def main(args: Array[String]): Unit = {

    val input = "MeSsAgE-to-DeCoDe"
    // val input = "1"

    // give in the function = DecoderFunctions.decode1 its not calling the function(calling is: DecoderFunctions.decode1())
    val decoded1 = Decode(DecoderFunctions.decode1, input)
    val decoded2 = Decode(DecoderFunctions.decode2, input)

    println(decoded1)
    println(decoded2)
  }
}
