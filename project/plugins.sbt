// Makes our code tidy
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")

// ScalaJS and associated plugins
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.5.1")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

// Automate releases
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")

// PGP signing
//addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")

// Sonatype integration
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.7")

// Strict scalac options from tpolecat
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.17")
