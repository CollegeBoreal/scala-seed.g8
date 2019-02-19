name := "$name$"
description := "$app_description$"
version := "1.0-SNAPSHOT"
organization := "$organization$"
scalaVersion := "2.12.6"

lazy val root = (project in file("."))

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

scalacOptions ++= Seq(
    "-unchecked"
  , "-deprecation"
  , "-feature"
  , "-language:postfixOps"
  , "-language:reflectiveCalls"
)



