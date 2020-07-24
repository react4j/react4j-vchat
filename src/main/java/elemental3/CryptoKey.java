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
    name = "CryptoKey"
)
public class CryptoKey {
  CryptoKey() {
  }

  @JsProperty(
      name = "algorithm"
  )
  @Nonnull
  public native Object algorithm();

  @JsProperty(
      name = "extractable"
  )
  public native boolean extractable();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @JsProperty(
      name = "usages"
  )
  @Nonnull
  public native Object usages();
}
