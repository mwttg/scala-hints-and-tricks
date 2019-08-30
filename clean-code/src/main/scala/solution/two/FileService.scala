package solution.two

import java.io.{ BufferedWriter, File, FileWriter }

import scala.io.Source
import scala.util.{ Failure, Success, Try }

object FileService {
  def read(source: String): Option[List[String]] =
    Try(Source.fromResource(source).getLines().toList) match {
      case Failure(exception) =>
        println(s"Error while reading source-file Exception was: $exception")
        None
      case Success(content) => Some(content)
    }

  def write(target: String, content: String): Unit = {
    val file = new File(target)
    val bw   = new BufferedWriter(new FileWriter(file))
    bw.write(content)
    bw.close()
  }
}
