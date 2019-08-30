package solution.one

object Application {
  def main(args: Array[String]): Unit = {
    val source = "source-file.txt"
    val target = "target-file-one.txt"
    BusinessProcess.execute(source, target)
  }
}
