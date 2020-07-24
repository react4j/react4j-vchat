package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ScreenOrientation"
)
public class ScreenOrientation extends EventTarget {
  @Nullable
  public EventHandler onchange;

  ScreenOrientation() {
  }

  @JsProperty(
      name = "angle"
  )
  public native int angle();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @Nonnull
  public native Promise<Void> lock(
      @MagicConstant(stringValues = {"any", "landscape", "landscape-primary", "landscape-secondary", "natural", "portrait", "portrait-primary", "portrait-secondary"}) @Nonnull String orientation);

  public native void unlock();
}
