package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableRowElement interface provides special properties and methods (beyond the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of rows in an HTML table.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement">HTMLTableRowElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableRowElement"
)
public class HTMLTableRowElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String ch;

  @Nonnull
  public String chOff;

  @Nonnull
  public String vAlign;

  public HTMLTableRowElement() {
  }

  @JsProperty(
      name = "cells"
  )
  @Nonnull
  public native HTMLCollection cells();

  /**
   * The HTMLTableRowElement.rowIndex read-only property represents the position of a row in relation to the whole table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement/rowIndex">HTMLTableRowElement.rowIndex - MDN</a>
   */
  @JsProperty(
      name = "rowIndex"
  )
  public native int rowIndex();

  @JsProperty(
      name = "sectionRowIndex"
  )
  public native int sectionRowIndex();

  public native void deleteCell(int index);

  /**
   * The HTMLTableRowElement.insertCell() method inserts a new cell (td) into a table row (tr) and returns a reference to the cell.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement/insertCell">HTMLTableRowElement.insertCell - MDN</a>
   */
  @Nonnull
  public native HTMLTableCellElement insertCell(int index);

  /**
   * The HTMLTableRowElement.insertCell() method inserts a new cell (td) into a table row (tr) and returns a reference to the cell.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement/insertCell">HTMLTableRowElement.insertCell - MDN</a>
   */
  @Nonnull
  public native HTMLTableCellElement insertCell();
}
