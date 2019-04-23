//https://www.scala-sbt.org/0.13/docs/Full-Def.html
//https://github.com/scalaz/scalaz/blob/series/7.3.x/project/build.scala/

import sbt._
import Keys._

object build {

  val dependencies = Seq(
    )

  lazy val exampleProject1 = Project("exampleProject1", file(".")) settings (
    version := "0.2",
    scalaVersion := "2.12.8",
    scalacOptions := Seq("-deprecation"),
    libraryDependencies ++= dependencies,
    addCommandAlias("c", ";compile")
  )

  lazy val exampleProject2 = Project("exampleProject2", file("p2"))
}
