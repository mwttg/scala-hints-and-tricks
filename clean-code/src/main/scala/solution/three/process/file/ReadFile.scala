package solution.three.process.file

import scala.io.Source
import scala.util.{ Failure, Success, Try }

object ReadFile {

  def read(source: String): Option[List[String]] =
    Try(Source.fromResource(source).getLines().toList) match {
      case Failure(exception) =>
        println(s"Error while reading source-file Exception was: $exception")
        None
      case Success(content) => Some(content)
    }
}
