package solution.two

object Application {
  def main(args: Array[String]): Unit = {
    val source = "source-file.txt"
    val target = "target-file-two.txt"
    BusinessProcess.execute(source, target)
  }
}
