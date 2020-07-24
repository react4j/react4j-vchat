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
    name = "HTMLOptionElement"
)
public class HTMLOptionElement extends HTMLElement {
  public boolean defaultSelected;

  public boolean disabled;

  @Nonnull
  public String label;

  public boolean selected;

  @Nonnull
  public String text;

  @Nonnull
  public String value;

  public HTMLOptionElement() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  @JsProperty(
      name = "index"
  )
  public native int index();
}
