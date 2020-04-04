course := "progfun1"

assignment := "example"

sbtVersion := "1.3.8"

scalaVersion := "2.12.8"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s")