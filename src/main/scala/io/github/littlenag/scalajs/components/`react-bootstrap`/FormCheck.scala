package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.VdomElement

import scala.scalajs.js

/**
 * Bridge to [ReactBootstrap](http://react-bootstrap.github.io/)'s FormCheck component
 */
object FormCheck extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Form.Check
  def apply(disabled: js.UndefOr[Boolean] = js.undefined,
            feedback: js.UndefOr[VdomElement] = js.undefined,
            id: js.UndefOr[String] = js.undefined,
            inline: js.UndefOr[Boolean] = js.undefined,
            isInvalid: js.UndefOr[Boolean] = js.undefined,
            isValid: js.UndefOr[Boolean] = js.undefined,
            label: js.UndefOr[VdomElement] = js.undefined,
            title: js.UndefOr[String] = js.undefined,
            `type`: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithPropsNoChildren = autoNoChildren
}

object FormCheckInput extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.FormCheck.Input
  def apply(id: js.UndefOr[String] = js.undefined,
            isInvalid: js.UndefOr[Boolean] = js.undefined,
            isStatic: js.UndefOr[Boolean] = js.undefined,
            isValid: js.UndefOr[Boolean] = js.undefined,
            `type`: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithPropsNoChildren = autoNoChildren
}

object FormCheckLabel extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.FormCheck.Label
  def apply(`type`: js.UndefOr[String] = js.undefined): WithProps = auto
}