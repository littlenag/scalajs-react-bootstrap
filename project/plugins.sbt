// Makes our code tidy
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")

// Documentation plugins
//addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.6.10")
//addSbtPlugin("com.47deg"  % "sbt-microsites" % "0.7.18")
//addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")

// ScalaJS and associated plugins
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.26")
//addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.2")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.0")

// Automate releases
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")