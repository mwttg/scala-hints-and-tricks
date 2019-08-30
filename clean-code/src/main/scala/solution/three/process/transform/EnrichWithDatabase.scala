package solution.three.process.transform

import solution.three.process.database.ReadFromDatabase

object EnrichWithDatabase {

  private[transform] def enrich(keyValues: List[KeyValue]) =
    keyValues.map(keyValue => {
      val fromDatabase = ReadFromDatabase.read()
      KeyValue(keyValue.key, keyValue.value + fromDatabase)
    })
}
