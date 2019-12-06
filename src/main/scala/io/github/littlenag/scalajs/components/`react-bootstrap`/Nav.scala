package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.Callback
import org.scalajs.dom.html.Element

import scala.scalajs.js

/**
  * Bridge to [ReactBootstrap](http://react-bootstrap.github.io/)'s Nav components
  */
object Nav extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Nav
  def apply(activeKey: js.UndefOr[String] = js.undefined,
            as: js.UndefOr[Element] = js.undefined,
            fill: js.UndefOr[Boolean] = js.undefined,
            justify: js.UndefOr[Boolean] = js.undefined,
            navbar: js.UndefOr[Boolean] = js.undefined,
            role: js.UndefOr[String] = js.undefined,
            variant: js.UndefOr[String] = js.undefined,
            onSelect: js.UndefOr[() => Callback] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object NavItem extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Nav.Item
  def apply(as: js.UndefOr[Element] = js.undefined,
            role: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object NavLink extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Nav.Link
  def apply(active: js.UndefOr[Boolean] = js.undefined,
            as: js.UndefOr[Element] = js.undefined,
            disabled: js.UndefOr[Boolean] = js.undefined,
            eventKey: js.UndefOr[js.Any] = js.undefined,
            href: js.UndefOr[String] = js.undefined,
            onSelect: js.UndefOr[() => Callback] = js.undefined,
            role: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}