enablePlugins(ScalaJSPlugin, ScalafmtPlugin, GhpagesPlugin, MicrositesPlugin, TutPlugin)

scalaVersion := "2.12.8"
organization := "io.github.littlenag"
name         := "scalajs-react-bootstrap"
version      := "0.0.1-SNAPSHOT"

git.remoteRepo := "git@github.com:littlenag/scalajs-react-bootstrap.git"

micrositeGithubOwner := "littlenag"

micrositeGithubRepo := name.value

micrositeName := "React-Bootstrap for ScalaJS"

micrositeDescription := "React-Bootstrap components for ScalaJS-React"

micrositeBaseUrl := name.value

//jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv()

homepage     := Some(url("http://littlenag.github.io/scalajs-react-bootstrap"))
licenses     += ("Apache 2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
mappings.in(Compile, packageBin) += baseDirectory.in(ThisBuild).value / "LICENSE" -> "LICENSE"

scalacOptions ++= Settings.scalacOptions
// Filter out compiler flags to make the repl experience functional...
scalacOptions in (Compile, console) ~= (_.filterNot(Seq("-Xfatal-warnings", "-Ywarn-unused:imports").contains(_)))
resolvers += Resolver.sonatypeRepo("snapshots")

// TODO change to scalatest
testFrameworks += new TestFramework("utest.runner.Framework")

scalaJSUseMainModuleInitializer := false
scalaJSUseMainModuleInitializer in Test := false

libraryDependencies ++= Settings.dependencies.value

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra :=
  <scm>
    <connection>scm:git:github.com:littlenag/scalajs-react-bootstrap</connection>
    <developerConnection>scm:git:git@github.com:littlenag/scalajs-react-bootstrap.git</developerConnection>
    <url>github.com:littlenag/scalajs-react-bootstrap.git</url>
  </scm>
  <developers>
    <developer>
      <id>littlenag</id>
      <name>Mark Kegel</name>
    </developer>
    <developer>
      <id>cabriner</id>
      <name>Clarissa Briner</name>
    </developer>
  </developers>
