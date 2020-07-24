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
    name = "HTMLDataListElement"
)
public class HTMLDataListElement extends HTMLElement {
  public HTMLDataListElement() {
  }

  @JsProperty(
      name = "options"
  )
  @Nonnull
  public native HTMLCollection options();
}
