package solution.three.process.transform

object KeyValuesToLines {

  private[transform] def transform(keyValues: List[KeyValue]) =
    keyValues.map(keyValue => s"Key=${keyValue.key} Value=${keyValue.value}")
}
