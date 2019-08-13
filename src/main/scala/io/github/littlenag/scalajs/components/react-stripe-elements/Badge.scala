package io.github.littlenag.scalajs.components.reactbootstrap

import com.payalabs.scalajs.react.bridge.WithProps

import scala.scalajs.js

/**
  * [Badge Component](http://react-bootstrap.github.io/components/badge/)
  */
object Badge extends ReactBootstrapComponent {
  def apply(pill: js.UndefOr[Boolean] = js.undefined,
            variant: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}
