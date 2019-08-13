package io.github.littlenag.scalajs.components.reactbootstrap

import com.payalabs.scalajs.react.bridge.WithProps
import org.scalajs.dom.html.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * [Alerts Component](http://react-bootstrap.github.io/components/alerts/)
  */
object Alert extends ReactBootstrapComponent {
  def apply(closeLabel: js.UndefOr[String] = js.undefined,
            dismissible: js.UndefOr[Boolean] = js.undefined,
            onClose: js.UndefOr[js.Function0[Unit]] = js.undefined,
            show: js.UndefOr[Boolean] = js.undefined,
            transition: js.UndefOr[js.Any] = js.undefined,
            variant: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

@js.native
@JSImport("react-bootstrap/Alert", JSImport.Namespace)
private object AlertObj extends js.Object {
  def Heading: js.Any = js.native
  def Link: js.Any = js.native
}

object AlertHeading extends ReactBootstrapComponent {
  override protected lazy val componentName: String = "Alert.Heading"
  override protected lazy val componentValue: js.Any = AlertObj.Heading
  def apply(as: js.UndefOr[Element] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object AlertLink extends ReactBootstrapComponent {
  override protected lazy val componentName: String = "Alert.Link"
  override protected lazy val componentValue: js.Any = AlertObj.Link
  def apply(as: js.UndefOr[Element] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}
