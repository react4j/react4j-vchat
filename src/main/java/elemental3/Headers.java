package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Headers"
)
public class Headers {
  public Headers(@Nonnull final HeadersInit init) {
  }

  public Headers(@Nonnull final JsArray<JsArray<String>> init) {
  }

  public Headers(@Nonnull final JsArray<String>[] init) {
  }

  public Headers(@Nonnull final JsPropertyMap<String> init) {
  }

  public Headers() {
  }

  public native void append(@Nonnull String name, @Nonnull String value);

  public native void delete(@Nonnull String name);

  @Nullable
  public native String get(@Nonnull String name);

  public native boolean has(@Nonnull String name);

  public native void set(@Nonnull String name, @Nonnull String value);
}
