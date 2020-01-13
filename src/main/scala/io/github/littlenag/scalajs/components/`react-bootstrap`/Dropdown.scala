package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.Callback
import org.scalajs.dom.html.Element

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * [Alerts Component](http://react-bootstrap.github.io/components/alerts/)
  */
object Dropdown extends ReactBridgeComponent {
  override lazy val componentValue: js.Any = ReactBootstrapModule.Dropdown

  def apply(alignRight: js.UndefOr[Boolean] = js.undefined,
            drop: js.UndefOr[String /* up | left | right | down */] = js.undefined,
            flip: js.UndefOr[Boolean] = js.undefined,
            focusFirstItemOnShow: js.UndefOr[Boolean | String /* false | true | "keyboard" */] = js.undefined,
            navbar: js.UndefOr[Boolean] = js.undefined,
            onSelect: js.UndefOr[(/* eventKey */ js.Any, /* event */ js.Any) => Callback] = js.undefined,
            onToggle: js.UndefOr[(/* isOpen */ Boolean, /* event */ js.Any, /* metadata: select | click | rootClose | keydown */ String) => Callback] = js.undefined,
            show: js.UndefOr[Boolean] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object DropdownButton extends ReactBridgeComponent {
  override lazy val componentValue: js.Any = ReactBootstrapModule.DropdownButton

  def apply(disabled: js.UndefOr[Boolean] = js.undefined,
            href: js.UndefOr[String] = js.undefined,
            id: js.UndefOr[String | Int] = js.undefined,
            menuRole: js.UndefOr[String] = js.undefined,
            onClick: js.UndefOr[() => Callback] = js.undefined,
            size: js.UndefOr[String] = js.undefined,
            title: js.UndefOr[String] = js.undefined,
            variant: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

object DropdownItem extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Dropdown.Item
  def apply(active: js.UndefOr[Boolean] = js.undefined,
            disabled: js.UndefOr[Boolean] = js.undefined,
            eventKey: js.UndefOr[js.Any] = js.undefined,
            href: js.UndefOr[String] = js.undefined,
            onClick: js.UndefOr[() => Callback] = js.undefined,
            onSelect: js.UndefOr[(/* eventKey */ js.Any, /* event */ js.Any) => Callback] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined
           ): WithProps = auto
}

object DropdownMenu extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Dropdown.Menu
  def apply(alignRight: js.UndefOr[Boolean] = js.undefined,
            flip: js.UndefOr[Boolean] = js.undefined,
            onSelect: js.UndefOr[(/* eventKey */ js.Any, /* event */ js.Any) => Callback] = js.undefined,
            show: js.UndefOr[Boolean] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined,
           ): WithProps = auto
}

object DropdownDivider extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Dropdown.Divider
  def apply(as: js.UndefOr[Element] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}
