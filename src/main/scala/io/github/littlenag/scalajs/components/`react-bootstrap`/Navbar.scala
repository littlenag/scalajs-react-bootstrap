package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomElement

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * Bridge to [ReactBootstrap](http://react-bootstrap.github.io/)'s Navbar components
  */
object Navbar extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Navbar
  def apply(bg: js.UndefOr[String] = js.undefined,
            fixed: js.UndefOr[String] = js.undefined,
            variant: js.UndefOr[String] = js.undefined,
            sticky : js.UndefOr[String] = js.undefined,
            expand : js.UndefOr[String | Boolean] = js.undefined,
            expanded : js.UndefOr[Boolean] = js.undefined,
            onSelect: js.UndefOr[() => Unit] = js.undefined,
            onToggle: js.UndefOr[() => Unit] = js.undefined): WithProps = auto
}

object NavbarBrand extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Navbar.Brand
  def apply(as: js.UndefOr[VdomElement] = js.undefined,
            href: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

// Special handling, since react-bootstrap doesn't see the need to actually export this one, gah!
object NavbarToggle extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Navbar.Toggle
  def apply(as: js.UndefOr[VdomElement] = js.undefined,
            label: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object NavbarCollapse extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Navbar.Collapse
  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object NavbarText extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Navbar.Text
  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}