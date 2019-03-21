package io.github.littlenag.scalajs.components.reactbootstrap

import com.payalabs.scalajs.react.bridge.WithProps
import org.scalajs.dom.html.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * [Breadcrumb Component](http://react-bootstrap.github.io/components/breadcrumb/)
  */
object Breadcrumb extends ReactBootstrapComponent {
  def apply(as: js.UndefOr[Element] = js.undefined,
            label: js.UndefOr[String] = js.undefined,
            listProps: js.UndefOr[js.Object] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

@js.native
@JSImport("react-bootstrap/Breadcrumb", JSImport.Namespace)
private object BreadcrumbObj extends js.Object {
  def Item: js.Any = js.native
}

object BreadcrumbItem extends ReactBootstrapComponent {
  override protected lazy val componentName: String = "Breadcrumb.Item"
  override protected lazy val componentValue: js.Any = BreadcrumbObj.Item
  def apply(active: js.UndefOr[Boolean] = js.undefined,
            as: js.UndefOr[Element] = js.undefined,
            href: js.UndefOr[String] = js.undefined,
            target: js.UndefOr[String] = js.undefined,
            title: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}
