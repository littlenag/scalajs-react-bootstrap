// https://www.scala-sbt.org/release/docs/Using-Sonatype.html

ThisBuild / organization := "io.github.littlenag"
ThisBuild / organizationName := "io.github.littlenag"
ThisBuild / organizationHomepage := Some(url("http://littlenag.github.io/"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/littlenag/scalajs-react-bootstrap"),
    "scm:git:git@github.com:littlenag/scalajs-react-bootstrap.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "littlenag",
    name  = "Mark Kegel",
    email = "mark.kegel@gmail.com",
    url   = url("http://littlenag.github.io")
  ),
  Developer(
    id    = "cabriner",
    name  = "Clarissa Briner",
    email = "clarissa.briner@gmail.com",
    url   = url("https://github.com/cabriner")
  )
)

ThisBuild / description := "Some descripiton about your project."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("http://littlenag.github.io/scalajs-react-bootstrap"))

// Remove all additional repository other than Maven Central from POM
//ThisBuild / pomIncludeRepository := { _ => false }
//ThisBuild / publishTo := {
//  val nexus = "https://oss.sonatype.org/"
//  if (isSnapshot.value)
//    Some("snapshots" at nexus + "content/repositories/snapshots")
//  else
//    Some("releases" at nexus + "service/local/staging/deploy/maven2")
//}
ThisBuild / publishMavenStyle := true


// Where is the source code hosted: GitHub or GitLab?
import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("littlenag", "scalajs-react-bootstrap", "mark.kegel@gmail.com"))