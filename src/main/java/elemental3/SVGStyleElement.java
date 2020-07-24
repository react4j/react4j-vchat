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
    name = "SVGStyleElement"
)
public class SVGStyleElement extends SVGElement {
  @Nonnull
  public String media;

  @Nonnull
  public String title;

  @Nonnull
  public String type;

  SVGStyleElement() {
  }

  @JsProperty(
      name = "sheet"
  )
  @Nullable
  public native CSSStyleSheet sheet();
}
