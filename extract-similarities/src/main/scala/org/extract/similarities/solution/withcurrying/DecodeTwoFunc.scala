package org.extract.similarities.solution.withcurrying

object DecodeTwoFunc {
  def apply(): String => String = x => x.toLowerCase
}
