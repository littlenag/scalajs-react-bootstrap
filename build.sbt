import ReleaseTransformations._
import xerial.sbt.Sonatype.autoImport.sonatypePublishToBundle

enablePlugins(ScalaJSPlugin, ScalafmtPlugin)

scalaVersion := "2.13.5"
organization := "io.github.littlenag"
name         := "scalajs-react-bootstrap"

ThisBuild / versionScheme := Some("early-semver")

resolvers += Resolver.sonatypeRepo("snapshots")

val relaxScalacOptions = { options: Seq[String] =>
  options.filterNot(Set(
    "-Wunused:nowarn",
    "-Xfatal-warnings"
  ))
}

scalacOptions ~= relaxScalacOptions

scalaJSUseMainModuleInitializer := false
Test / scalaJSUseMainModuleInitializer := false

libraryDependencies ++= Settings.dependencies.value

ThisBuild / publishTo := sonatypePublishToBundle.value

credentials += Credentials(Path.userHome / ".sbt" / "sonatype.credentials")

PgpKeys.pgpPassphrase := Option(Credentials.toDirect(Credentials(Path.userHome / ".sbt" / "pgp.credentials")).passwd.toCharArray)

pgpSecretRing := pgpPublicRing.value

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
  releaseStepCommand("sonatypeBundleRelease"),
  //publishArtifacts,
  setNextVersion,                         // : ReleaseStep
  commitNextVersion,                      // : ReleaseStep
  pushChanges,                            // : ReleaseStep, also checks that an upstream branch is properly configured,
)