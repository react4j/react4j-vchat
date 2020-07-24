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
    name = "HTMLTableCellElement"
)
public class HTMLTableCellElement extends HTMLElement {
  @Nonnull
  public String abbr;

  public int colSpan;

  @Nonnull
  public String headers;

  public int rowSpan;

  @Nonnull
  public String scope;

  @Nonnull
  public String align;

  @Nonnull
  public String axis;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String ch;

  @Nonnull
  public String chOff;

  @Nonnull
  public String height;

  public boolean noWrap;

  @Nonnull
  public String vAlign;

  @Nonnull
  public String width;

  public HTMLTableCellElement() {
  }

  @JsProperty(
      name = "cellIndex"
  )
  public native int cellIndex();
}
