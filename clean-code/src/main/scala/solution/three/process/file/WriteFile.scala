package solution.three.process.file

import java.io.{ BufferedWriter, File, FileWriter }

object WriteFile {

  def write(target: String, content: String): Unit = {
    val file = new File(target)
    val bw   = new BufferedWriter(new FileWriter(file))
    bw.write(content)
    bw.close()
  }
}
