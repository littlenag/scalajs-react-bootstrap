package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.Callback
import org.scalajs.dom.html.Element

import scala.scalajs.js

/**
  * [Alerts Component](http://react-bootstrap.github.io/components/alerts/)
  */
object Alert extends ReactBridgeComponent {
  override lazy val componentValue: js.Any = ReactBootstrapModule.Alert

  def apply(closeLabel: js.UndefOr[String] = js.undefined,
            dismissible: js.UndefOr[Boolean] = js.undefined,
            onClose: js.UndefOr[() => Callback] = js.undefined,
            show: js.UndefOr[Boolean] = js.undefined,
            transition: js.UndefOr[js.Any] = js.undefined,
            variant: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object AlertHeading extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Alert.Heading
  def apply(as: js.UndefOr[Element] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object AlertLink extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Alert.Link
  def apply(as: js.UndefOr[Element] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}
