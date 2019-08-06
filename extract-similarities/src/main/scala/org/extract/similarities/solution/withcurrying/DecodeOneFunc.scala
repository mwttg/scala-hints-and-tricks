package org.extract.similarities.solution.withcurrying

object DecodeOneFunc {
  def apply(): String => String = x => x.toUpperCase
}
