import sbt.Def
import sbtcrossproject.CrossPlugin.autoImport.{CrossType, crossProject}

// Top-level settings
enablePlugins(ScalaJSPlugin)

enablePlugins(ScalafmtPlugin, GhpagesPlugin, MicrositesPlugin, TutPlugin)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.9")
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

git.remoteRepo := "git@github.com:littlenag/scalajs-react-bootstrap.git"

micrositeGithubOwner := "littlenag"

micrositeGithubRepo := Settings.name

micrositeName := "React-Bootstrap for ScalaJS"

micrositeDescription := "React-Bootstrap components for ScalaJS-React"

micrositeBaseUrl := Settings.name

// Filter out compiler flags to make the repl experience functional...
val badConsoleFlags = Seq("-Xfatal-warnings", "-Ywarn-unused:imports")

// use eliding to drop some debug code in the production build
lazy val elideOptions = settingKey[Seq[String]]("Set limit for elidable functions")

jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv()

scalaVersion := "2.12.8"
organization := "io.github.littlenag"
homepage     := Some(url("http://littlenag.github.io/scalajs-react-bootstrap"))
licenses     += ("Apache 2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
version      := Settings.version
scalacOptions ++= Settings.scalacOptions
scalacOptions in (Compile, console) ~= (_.filterNot(badConsoleFlags.contains(_)))
resolvers += Resolver.sonatypeRepo("snapshots")

// TODO change to scalatest
testFrameworks += new TestFramework("utest.runner.Framework")

elideOptions := Seq("-Xelide-below", "MINIMUM")

scalacOptions ++= elideOptions.value

scalaJSUseMainModuleInitializer := false
scalaJSUseMainModuleInitializer in Test := false

libraryDependencies ++= Settings.dependencies.value