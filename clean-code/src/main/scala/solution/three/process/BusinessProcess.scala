package solution.three.process

import solution.three.process.file.{ ReadFile, WriteFile }
import solution.three.process.transform.Transform

object BusinessProcess {

  def execute(source: String, target: String): Unit = {
    val maybeContent = ReadFile.read(source)
    maybeContent match {
      case None => println("End.")
      case Some(content) =>
        val transformedContent = Transform.transform(content)
        WriteFile.write(target, transformedContent)
    }
  }
}
