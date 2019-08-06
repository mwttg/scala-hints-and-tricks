package org.extract.similarities.problem

object Application {
  def main(args: Array[String]): Unit = {

    val input    = "MeSsAgE-to-DeCoDe"
    val decoded1 = DecoderOne(input)
    val decoded2 = DecoderTwo(input)

    println(decoded1)
    println(decoded2)
  }
}
