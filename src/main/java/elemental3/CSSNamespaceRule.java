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
    name = "CSSNamespaceRule"
)
public class CSSNamespaceRule extends CSSRule {
  CSSNamespaceRule() {
  }

  @JsProperty(
      name = "namespaceURI"
  )
  @Nonnull
  public native String namespaceURI();

  @JsProperty(
      name = "prefix"
  )
  @Nonnull
  public native String prefix();
}
