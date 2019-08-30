package solution.three.process.transform

object Transform {

  def transform(content: List[String]): String = {
    val marker    = ExtractMarker.extract(content)
    val keyValues = FileMarkerToKeyValue.transform(marker)
    val enriched  = EnrichWithDatabase.enrich(keyValues)
    val lines     = KeyValuesToLines.transform(enriched)
    LinesToFileContent.transform(lines)
  }

//  def transform(content: List[String]): String = {
//    val marker = ExtractMarker(content)
//    val keyValues = FileMarkerToKeyValue(marker)
//    val enriched = EnrichWithDatabase(keyValues)
//    val lines = KeyValuesToLines(enriched)
//    LinesToFileContent(lines)
//  }
}
