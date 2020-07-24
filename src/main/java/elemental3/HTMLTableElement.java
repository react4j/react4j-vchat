package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableElement"
)
public class HTMLTableElement extends HTMLElement {
  @Nullable
  public HTMLTableCaptionElement caption;

  @Nullable
  public HTMLTableSectionElement tFoot;

  @Nullable
  public HTMLTableSectionElement tHead;

  @Nonnull
  public String align;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String border;

  @Nonnull
  public String cellPadding;

  @Nonnull
  public String cellSpacing;

  @Nonnull
  public String frame;

  @Nonnull
  public String rules;

  @Nonnull
  public String summary;

  @Nonnull
  public String width;

  public HTMLTableElement() {
  }

  @JsProperty(
      name = "rows"
  )
  @Nonnull
  public native HTMLCollection rows();

  @JsProperty(
      name = "tBodies"
  )
  @Nonnull
  public native HTMLCollection tBodies();

  @Nonnull
  public native HTMLTableCaptionElement createCaption();

  @Nonnull
  public native HTMLTableSectionElement createTBody();

  @Nonnull
  public native HTMLTableSectionElement createTFoot();

  @Nonnull
  public native HTMLTableSectionElement createTHead();

  public native void deleteCaption();

  public native void deleteRow(int index);

  public native void deleteTFoot();

  public native void deleteTHead();

  @Nonnull
  public native HTMLTableRowElement insertRow(int index);

  @Nonnull
  public native HTMLTableRowElement insertRow();
}
