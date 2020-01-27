package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement

import scala.scalajs.js

/**
 * Bridge to [ReactBootstrap](http://react-bootstrap.github.io/)'s Nav components
 */
object NavDropdown extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.NavDropdown
  def apply(title: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object NavDropdownItem extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.NavDropdown.Item
  def apply(href: js.UndefOr[String] = js.undefined,
            disabled: js.UndefOr[Boolean] = js.undefined,
            eventKey: js.UndefOr[js.Any] = js.undefined,
            onClick:  js.UndefOr[() => Callback] = js.undefined,
            onSelect: js.UndefOr[(/* eventKey */ js.Any, /* event */ js.Any) => Callback] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object NavDropdownDivider extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.NavDropdown.Divider
  def apply(): VdomElement = autoNoTagModsNoChildren
}

object NavDropdownHeader extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.NavDropdown.Header
  def apply(): VdomElement = autoNoTagModsNoChildren
}
