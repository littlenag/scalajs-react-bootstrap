package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Ref
import org.scalajs.dom.html.Element

import scala.scalajs.js

/**
  * [Button Component](http://react-bootstrap.github.io/components/buttons/)
  */
object Button extends ReactBridgeComponent {
  override lazy val componentValue: js.Any = ReactBootstrapModule.Button

  def apply(active: js.UndefOr[Boolean] = js.undefined,
            as: js.UndefOr[Element] = js.undefined,
            block: js.UndefOr[Boolean] = js.undefined,
            disabled: js.UndefOr[Boolean] = js.undefined,
            title: js.UndefOr[String] = js.undefined,
            href: js.UndefOr[String] = js.undefined,
            size: js.UndefOr[String] = js.undefined,
            `type`: js.UndefOr[String] = js.undefined,
            variant: js.UndefOr[String] = js.undefined,
            onClick: js.UndefOr[() => Callback] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

/**
  * [ToggleButtonGroup Component](http://react-bootstrap.github.io/components/buttons/)
  */
object ToggleButtonGroup extends ReactBridgeComponent {
  override lazy val componentValue: js.Any = ReactBootstrapModule.ToggleButtonGroup

  def apply(name: js.UndefOr[String] = js.undefined,
            onChange: js.UndefOr[() => Callback] = js.undefined,
            `type`: js.UndefOr[String] = js.undefined,
            value: js.UndefOr[js.Any] = js.undefined): WithProps = auto
}

/**
  * [ToggleButton Component](http://react-bootstrap.github.io/components/buttons/)
  */
object ToggleButton extends ReactBridgeComponent {
  override lazy val componentValue: js.Any = ReactBootstrapModule.ToggleButton

  def apply(checked: js.UndefOr[Boolean] = js.undefined,
            disabled: js.UndefOr[Boolean] = js.undefined,
            inputRef: js.UndefOr[Ref] = js.undefined,
            name: js.UndefOr[String] = js.undefined,
            onChange: js.UndefOr[() => Callback] = js.undefined,
            `type`: js.UndefOr[String] = js.undefined,
            value: js.UndefOr[js.Any] = js.undefined): WithProps = auto
}

object ButtonToolbar extends ReactBridgeComponent {
  override lazy val componentValue: js.Any = ReactBootstrapModule.ButtonToolbar

  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}