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
    name = "HTMLLabelElement"
)
public class HTMLLabelElement extends HTMLElement {
  @Nonnull
  public String htmlFor;

  public HTMLLabelElement() {
  }

  @JsProperty(
      name = "control"
  )
  @Nullable
  public native HTMLElement control();

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();
}
