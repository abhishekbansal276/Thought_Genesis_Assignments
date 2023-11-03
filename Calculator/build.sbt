ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "Calculator"
  )

val scalaTestVersion = "3.2.15"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % "test",
)