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
    name = "HTMLTemplateElement"
)
public class HTMLTemplateElement extends HTMLElement {
  public HTMLTemplateElement() {
  }

  @JsProperty(
      name = "content"
  )
  @Nonnull
  public native DocumentFragment content();
}
