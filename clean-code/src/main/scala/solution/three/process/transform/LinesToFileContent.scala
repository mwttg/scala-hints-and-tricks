package solution.three.process.transform

object LinesToFileContent {

  private[transform] def transform(lines: List[String]) =
    lines.foldLeft("") { (accumulator, line) =>
      accumulator + line + "\n"
    }
}
