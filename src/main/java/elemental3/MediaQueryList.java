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
    name = "MediaQueryList"
)
public class MediaQueryList extends EventTarget {
  @Nullable
  public EventHandler onchange;

  MediaQueryList() {
  }

  @JsProperty(
      name = "matches"
  )
  public native boolean matches();

  @JsProperty(
      name = "media"
  )
  @Nonnull
  public native String media();

  public native void addListener(@Nullable EventListener callback);

  public native void removeListener(@Nullable EventListener callback);
}
