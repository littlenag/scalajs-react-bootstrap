import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._

/**
 * Application settings. Configure the build for your application here.
 * You normally don't have to touch the actual build definition after this.
 */
object Settings {

  /** Declare global dependency versions here to avoid mismatches in multi part dependencies */
  object versions {
    val scalaDom           = "1.1.0"
    val scalajsReactFacade = "1.7.7"
    val scalajsReactBridge = "0.8.5"
  }

  val dependencies = Def.setting(Seq(
    "com.github.japgolly.scalajs-react" %%% "core"                      % versions.scalajsReactFacade,
    "com.github.japgolly.scalajs-react" %%% "extra"                     % versions.scalajsReactFacade,

    "com.payalabs"                      %%% "scalajs-react-bridge"      % versions.scalajsReactBridge,

    "org.scala-js"                      %%% "scalajs-dom"               % versions.scalaDom,
  ))
}
