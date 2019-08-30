package solution.three.process.transform

object ExtractMarker {

  private[transform] def extract(content: List[String]) = {
    val markerLines = content.filter(line => line.startsWith("#marker#"))
    markerLines.flatMap(line => line.split("#marker#")).filter(_.nonEmpty)
  }
}
