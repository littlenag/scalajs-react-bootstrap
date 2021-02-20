// Makes our code tidy
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")

// ScalaJS and associated plugins
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.5.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

// Automate releases
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")

// PGP signing
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.1")

// Sonatype integration
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")

// Documentation plugins
//addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.6.10")
//addSbtPlugin("com.47deg"  % "sbt-microsites" % "0.7.18")
//addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")
