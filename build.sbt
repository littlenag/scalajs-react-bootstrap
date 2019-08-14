import ReleaseTransformations._

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

credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credential")

releasePublishArtifactsAction := {PgpKeys.publishSigned.value}

// Custom release process
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,              // : ReleaseStep
  inquireVersions,                        // : ReleaseStep
  runClean,                               // : ReleaseStep
  runTest,                                // : ReleaseStep
  setReleaseVersion,                      // : ReleaseStep
  commitReleaseVersion,                   // : ReleaseStep, performs the initial git checks
  tagRelease,                             // : ReleaseStep
  //releaseStepCommand(s"sonatypeOpen \"io.github.littlenag\" \"iogithublittlenag-${System.currentTimeMillis()}\""),
  //releaseStepCommand("publishSigned"),
  //releaseStepCommand("sonatypeRelease"),
  publishArtifacts,
  setNextVersion,                         // : ReleaseStep
  commitNextVersion,                      // : ReleaseStep
  pushChanges,                            // : ReleaseStep, also checks that an upstream branch is properly configured,
)