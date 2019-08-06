package org.extract.similarities.solution.withcurrying

//object DecodeOneFunc {
//  def apply(): String => String = x => x.toUpperCase
//}

object DecoderFunctions {
  def decode1(input: String): String = input.toUpperCase

  def decode2(input: String): String = input.toLowerCase()

}
