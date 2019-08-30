package solution.two

final case class KeyValue(key: String, value: Int)

object TransformationService {

  def transform(content: List[String]): String = {
    val marker    = getMarker(content)
    val keyValues = fileMarkerToKeyValue(marker)
    val enriched  = enrichWithDatabase(keyValues)
    val lines     = keyValueToLines(enriched)
    linesToFileContent(lines)
  }

  private def getMarker(content: List[String]) = {
    val markerLines = content.filter(line => line.startsWith("#marker#"))
    markerLines.flatMap(line => line.split("#marker#")).filter(_.nonEmpty)
  }

  private def fileMarkerToKeyValue(marker: List[String]) =
    marker.map(line => {
      val pair  = line.split("-")
      val key   = pair(0)
      val value = pair(1).toInt
      KeyValue(key, value)
    })

  private def enrichWithDatabase(keyValues: List[KeyValue]) =
    keyValues.map(keyValue => {
      val fromDatabase = DatabaseService.fetchFromDatabase()
      KeyValue(keyValue.key, keyValue.value + fromDatabase)
    })

  private def keyValueToLines(keyValues: List[KeyValue]) =
    keyValues.map(keyValue => s"Key=${keyValue.key} Value=${keyValue.value}")

  private def linesToFileContent(lines: List[String]) =
    lines.foldLeft("") { (accumulator, line) =>
      accumulator + line + "\n"
    }
}
