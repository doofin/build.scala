

//https://www.scala-sbt.org/0.13/docs/Full-Def.html
//https://github.com/scalaz/scalaz/blob/series/7.3.x/project/build.scala/

import sbt._
import Keys._

object ExampleBuild extends Build {

  val dependencies = Seq(
  )

  lazy val exampleProject = Project("SbtExample", file(".")) settings(
    version       := "0.2",
    scalaVersion  := "2.12.8",
    scalacOptions := Seq("-deprecation"),
    libraryDependencies ++= dependencies
  )

  lazy val exampleProject1 = Project("p2", file("p2"))

}

