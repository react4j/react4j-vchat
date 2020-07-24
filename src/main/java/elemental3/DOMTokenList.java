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
    name = "DOMTokenList"
)
public class DOMTokenList {
  @Nonnull
  public String value;

  DOMTokenList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  public native void add(@Nonnull String... tokens);

  public native boolean contains(@Nonnull String token);

  public native void remove(@Nonnull String... tokens);

  public native boolean replace(@Nonnull String token, @Nonnull String newToken);

  public native boolean supports(@Nonnull String token);

  public native boolean toggle(@Nonnull String token, boolean force);

  public native boolean toggle(@Nonnull String token);
}
