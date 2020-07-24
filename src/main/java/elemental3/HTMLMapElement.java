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
    name = "HTMLMapElement"
)
public class HTMLMapElement extends HTMLElement {
  @Nonnull
  public String name;

  public HTMLMapElement() {
  }

  @JsProperty(
      name = "areas"
  )
  @Nonnull
  public native HTMLCollection areas();
}
