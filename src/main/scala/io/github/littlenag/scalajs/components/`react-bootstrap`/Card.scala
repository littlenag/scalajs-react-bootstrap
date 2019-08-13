package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import org.scalajs.dom.html.Element

import scala.scalajs.js

/**
  * Bridge to [ReactBootstrap](http://react-bootstrap.github.io/)'s Card components
  */
object Card extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Card
  def apply(as: js.UndefOr[Element] = js.undefined,
            bg: js.UndefOr[String] = js.undefined,
            body: js.UndefOr[Boolean] = false,
            border: js.UndefOr[String] = js.undefined,
            text: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object CardTitle extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Card.Title
  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object CardSubtitle extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Card.Subtitle
  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object CardHeader extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Card.Header
  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object CardFooter extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Card.Footer
  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object CardText extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Card.Text
  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object CardBody extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Card.Body
  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object CardLink extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Card.Link
  def apply(bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}
