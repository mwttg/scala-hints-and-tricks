package solution.two

object BusinessProcess {

  def execute(source: String, target: String): Unit = {
    val maybeFileContent = FileService.read(source)
    maybeFileContent match {
      case None => println("End.")
      case Some(fileContent) =>
        val transformed = TransformationService.transform(fileContent)
        FileService.write(target, transformed)
    }
  }
}
