package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "History"
)
public class History {
  @Nonnull
  public String scrollRestoration;

  History() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "state"
  )
  @Nullable
  public native Any state();

  public native void back();

  public native void forward();

  public native void go(int delta);

  public native void go();

  public native void pushState(@Nullable Any data, @Nonnull String title, @Nullable String url);

  public native void pushState(@Nullable Any data, @Nonnull String title);

  public native void replaceState(@Nullable Any data, @Nonnull String title, @Nullable String url);

  public native void replaceState(@Nullable Any data, @Nonnull String title);
}
