enablePlugins(ScalaJSPlugin, ScalafmtPlugin)

scalaVersion := "2.12.8"
organization := "io.github.littlenag"
name         := "scalajs-react-bootstrap"

scalacOptions ++= Settings.scalacOptions

// Filter out compiler flags to make the repl experience functional...
scalacOptions in (Compile, console) ~= (_.filterNot(Seq("-Xfatal-warnings", "-Ywarn-unused:imports").contains(_)))
resolvers += Resolver.sonatypeRepo("snapshots")

// TODO change to scalatest
testFrameworks += new TestFramework("utest.runner.Framework")

scalaJSUseMainModuleInitializer := false
scalaJSUseMainModuleInitializer in Test := false

libraryDependencies ++= Settings.dependencies.value

//useGpg := true

credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credential")