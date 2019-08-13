package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js

/**
  * [Badge Component](http://react-bootstrap.github.io/components/badge/)
  */
object Badge extends ReactBridgeComponent {

  override lazy val componentValue: js.Any = ReactBootstrapModule.Badge

  def apply(pill: js.UndefOr[Boolean] = js.undefined,
            variant: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}
