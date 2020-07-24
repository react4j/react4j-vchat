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
    name = "DOMStringList"
)
public class DOMStringList {
  DOMStringList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  public native boolean contains(@Nonnull String string);
}
