package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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

  @JsProperty(
      name = "rowIndex"
  )
  public native int rowIndex();

  @JsProperty(
      name = "sectionRowIndex"
  )
  public native int sectionRowIndex();

  public native void deleteCell(int index);

  @Nonnull
  public native HTMLTableCellElement insertCell(int index);

  @Nonnull
  public native HTMLTableCellElement insertCell();
}
