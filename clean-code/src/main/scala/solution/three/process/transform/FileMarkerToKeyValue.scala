package solution.three.process.transform

object FileMarkerToKeyValue {

  private[transform] def transform(marker: List[String]) =
    marker.map(line => {
      val pair  = line.split("-")
      val key   = pair(0)
      val value = pair(1).toInt
      KeyValue(key, value)
    })
}
