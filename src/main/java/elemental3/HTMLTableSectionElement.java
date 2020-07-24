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
    name = "HTMLTableSectionElement"
)
public class HTMLTableSectionElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String ch;

  @Nonnull
  public String chOff;

  @Nonnull
  public String vAlign;

  public HTMLTableSectionElement() {
  }

  @JsProperty(
      name = "rows"
  )
  @Nonnull
  public native HTMLCollection rows();

  public native void deleteRow(int index);

  @Nonnull
  public native HTMLTableRowElement insertRow(int index);

  @Nonnull
  public native HTMLTableRowElement insertRow();
}
