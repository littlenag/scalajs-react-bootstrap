package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import org.scalajs.dom.html.Element

import scala.scalajs.js

/**
  * [Breadcrumb Component](http://react-bootstrap.github.io/components/breadcrumb/)
  */
object Breadcrumb extends ReactBridgeComponent {
  override lazy val componentValue: js.Any = ReactBootstrapModule.Breadcrumb

  def apply(as: js.UndefOr[Element] = js.undefined,
            label: js.UndefOr[String] = js.undefined,
            listProps: js.UndefOr[js.Object] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object BreadcrumbItem extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Breadcrumb.Item

  def apply(active: js.UndefOr[Boolean] = js.undefined,
            as: js.UndefOr[Element] = js.undefined,
            href: js.UndefOr[String] = js.undefined,
            target: js.UndefOr[String] = js.undefined,
            title: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}
