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
    name = "URLSearchParams"
)
public class URLSearchParams {
  public URLSearchParams(@Nonnull final JsArray<JsArray<String>> init) {
  }

  public URLSearchParams(@Nonnull final JsArray<String>[] init) {
  }

  public URLSearchParams(@Nonnull final JsPropertyMap<String> init) {
  }

  public URLSearchParams(@Nonnull final String init) {
  }

  public URLSearchParams() {
  }

  public native void append(@Nonnull String name, @Nonnull String value);

  public native void delete(@Nonnull String name);

  @Nullable
  public native String get(@Nonnull String name);

  @Nonnull
  public native JsArray<String> getAll(@Nonnull String name);

  public native boolean has(@Nonnull String name);

  public native void set(@Nonnull String name, @Nonnull String value);

  public native void sort();
}
