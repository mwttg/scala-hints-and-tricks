name := "scala-hints-and-tricks"

version := "0.1"

scalaVersion := "2.12.7"

lazy val commonSettings = Seq(
  scalaVersion := "2.12.8",
  libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

lazy val `currying` = (project in file("currying"))
  .settings(commonSettings)

lazy val `deconstruction` = (project in file("deconstruction"))
  .settings(commonSettings)

lazy val `varargs` = (project in file("varargs"))
  .settings(commonSettings)

lazy val `extract-similarities` = (project in file("extract-similarities"))
  .settings(commonSettings)
