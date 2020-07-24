package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceNavigation"
)
public class PerformanceNavigation {
  @JsOverlay
  public static final int TYPE_BACK_FORWARD = 2;

  @JsOverlay
  public static final int TYPE_NAVIGATE = 0;

  @JsOverlay
  public static final int TYPE_RELOAD = 1;

  @JsOverlay
  public static final int TYPE_RESERVED = 255;

  PerformanceNavigation() {
  }

  @JsProperty(
      name = "redirectCount"
  )
  public native int redirectCount();

  @JsProperty(
      name = "type"
  )
  public native int type();

  @Nonnull
  public native Object toJSON();
}
