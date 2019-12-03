package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.SyntheticEvent
import org.scalajs.dom.html

import scala.scalajs.js

/**
  * Bridge to [ReactBootstrap](http://react-bootstrap.github.io/)'s FormControl component
  */
object FormControl extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.FormControl
  def apply(`type`: js.UndefOr[String] = js.undefined,
            label: js.UndefOr[String] = js.undefined,
            help: js.UndefOr[String] = js.undefined,
            placeholder: js.UndefOr[String] = js.undefined,
            bsStyle: js.UndefOr[String] = js.undefined,
            hasFeedback: js.UndefOr[Boolean] = js.undefined,
            groupClassName: js.UndefOr[String] = js.undefined,
            wrapperClassName: js.UndefOr[String] = js.undefined,
            labelClassName: js.UndefOr[String] = js.undefined,
            onChange: js.UndefOr[SyntheticEvent[html.Input] => Unit] = js.undefined,
            onKeyDown: js.UndefOr[ReactKeyboardEvent => Unit] = js.undefined,
            value: js.UndefOr[String] = js.undefined,
            defaultValue: js.UndefOr[String] = js.undefined,
            multiple: js.UndefOr[Boolean] = js.undefined,
            readOnly: js.UndefOr[Boolean] = js.undefined,
            checked: js.UndefOr[Boolean] = js.undefined,
            disabled: js.UndefOr[Boolean] = js.undefined): WithPropsNoChildren = autoNoChildren
}

object FormControlFeedback extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.FormControl.Feedback
  def apply(`type`: js.UndefOr[String] = js.undefined): WithPropsNoChildren = autoNoChildren
}