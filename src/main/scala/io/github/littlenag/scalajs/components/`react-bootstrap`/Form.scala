package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps, WithPropsNoChildren}
import japgolly.scalajs.react.Callback

import scala.scalajs.js

/**
 *
 */
object Form extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Form
  def apply(inline: js.UndefOr[Boolean] = js.undefined,
            validated: js.UndefOr[Boolean] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object Form_Row extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Form.Row
  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object Form_Group extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Form.Group
  def apply(controlId: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object Form_Label extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Form.Label
  def apply(column: js.UndefOr[Boolean] = js.undefined,
            htmlFor: js.UndefOr[String] = js.undefined,
            srOnly: js.UndefOr[Boolean] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object Form_Control extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Form.Control
  def apply(as: js.UndefOr[String] = js.undefined,
            disabled: js.UndefOr[Boolean] = js.undefined,
            id: js.UndefOr[String] = js.undefined,
            isInvalid: js.UndefOr[Boolean] = js.undefined,
            onChange: js.UndefOr[() => Callback] = js.undefined,
            plaintext: js.UndefOr[Boolean] = js.undefined,
            readOnly: js.UndefOr[Boolean] = js.undefined,
            size: js.UndefOr[String] = js.undefined,
            `type`: js.UndefOr[String] = js.undefined,
            value: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithPropsNoChildren = autoNoChildren
}

object Form_Check extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Form.Check
  def apply(bsPrefix: js.UndefOr[String] = js.undefined):  WithPropsNoChildren = autoNoChildren
}