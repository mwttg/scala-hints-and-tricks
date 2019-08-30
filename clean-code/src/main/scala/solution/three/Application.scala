package solution.three

import solution.three.process.BusinessProcess

object Application {
  def main(args: Array[String]): Unit = {
    val source = "source-file.txt"
    val target = "target-file-three.txt"
    BusinessProcess.execute(source, target)
  }
}
