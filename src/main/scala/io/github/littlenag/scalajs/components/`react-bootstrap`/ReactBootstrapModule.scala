package io.github.littlenag.scalajs.components.`react-bootstrap`

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("react-bootstrap", JSImport.Namespace)
object ReactBootstrapModule extends js.Object {

  @js.native
  trait AlertComponent extends js.Object {
    def Heading: js.Any = js.native
    def Link: js.Any = js.native
  }

  @js.native
  trait BreadcrumbComponent extends js.Object {
    def Item: js.Any = js.native
  }

  @js.native
  trait CardComponent extends js.Object {
    def Title: js.Any = js.native
    def Subtitle: js.Any = js.native
    def Header: js.Any = js.native
    def Footer: js.Any = js.native
    def Text: js.Any = js.native
    def Body: js.Any = js.native
    def Link: js.Any = js.native
  }

  @js.native
  trait DropdownComponent extends js.Object {
    def Toggle: js.Any = js.native
    def Menu: js.Any = js.native
    def Item: js.Any = js.native
    def Header: js.Any = js.native
    def Divider: js.Any = js.native
  }

  @js.native
  trait FormComponent extends js.Object {
    def Row: js.Any = js.native
    def Group: js.Any = js.native
    def Label: js.Any = js.native
    def Control: js.Any = js.native
    def Check: FormCheckComponent = js.native
  }

  @js.native
  trait FormControlComponent extends js.Object {
    def Feedback: js.Any = js.native
  }

  @js.native
  trait FormCheckComponent extends js.Object {
    def Input: js.Any = js.native
    def Label: js.Any = js.native
  }

  @js.native
  trait ModalComponent extends js.Object {
    def Body: js.Any = js.native
    def Title: js.Any = js.native
    def Header: js.Any = js.native
    def Footer: js.Any = js.native
    def Dialog: js.Any = js.native
  }

  @js.native
  trait NavComponent extends js.Object {
    def Item: js.Any = js.native
    def Link: js.Any = js.native
  }

  @js.native
  trait NavDropdownComponent extends js.Object {
    def Item: js.Any = js.native
    def Divider: js.Any = js.native
    def Header: js.Any = js.native
  }

  @js.native
  trait NavbarComponent extends js.Object {
    def Brand: js.Any = js.native
    def Toggle: js.Any = js.native
    def Collapse: js.Any = js.native
    def Text: js.Any = js.native
  }

  def Alert: AlertComponent = js.native
  def Badge: js.Any = js.native
  def Breadcrumb: BreadcrumbComponent = js.native
  def Button: js.Any = js.native
  def Dropdown: DropdownComponent = js.native
  def DropdownButton: js.Any = js.native
  def ToggleButtonGroup: js.Any = js.native
  def ToggleButton: js.Any = js.native
  def ButtonToolbar: js.Any = js.native
  def Card: CardComponent = js.native
  def Form: FormComponent = js.native
  def FormControl: FormControlComponent = js.native
  def FormCheck: FormCheckComponent = js.native
  def Modal: ModalComponent = js.native
  def Nav: NavComponent = js.native
  def NavDropdown: NavDropdownComponent = js.native
  def Navbar: NavbarComponent = js.native
  def Table: js.Any = js.native
}