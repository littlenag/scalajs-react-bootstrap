package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import org.scalajs.dom.html.Element

import scala.scalajs.js

/**
  * Bridge to [ReactBootstrap](http://react-bootstrap.github.io/)'s Modal components
  */
object Modal extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Modal
  def apply(animation: js.UndefOr[Boolean] = true,
            keyboard: js.UndefOr[Boolean] = true,
            show: js.UndefOr[Boolean] = false,
            size : js.UndefOr[String] = js.undefined,
            onHide: js.UndefOr[js.Function0[Unit]] = js.undefined,
            onExit: js.UndefOr[js.Function0[Unit]] = js.undefined,
            onExited: js.UndefOr[js.Function0[Unit]] = js.undefined,
            onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined,
            onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined,
            onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined,
            onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined): WithProps = auto
}

object ModalDialog extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Modal.Dialog
  def apply(centered: js.UndefOr[Boolean] = js.undefined,
            size: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

// Special handling, since react-bootstrap doesn't see the need to actually export this one, gah!
object ModalHeader extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Modal.Header
  def apply(closeButton: js.UndefOr[Boolean] = false,
            closeLabel: js.UndefOr[String] = "Close",
            onHide: js.UndefOr[js.Function0[Unit]] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object ModalTitle extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Modal.Title
  def apply(as: js.UndefOr[Element] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object ModalBody extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Modal.Body
  def apply(as: js.UndefOr[Element] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object ModalFooter extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Modal.Footer
  def apply(as: js.UndefOr[Element] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}
