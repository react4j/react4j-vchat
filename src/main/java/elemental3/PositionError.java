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
    name = "Object"
)
public class PositionError {
  @JsOverlay
  public static final int PERMISSION_DENIED = 1;

  @JsOverlay
  public static final int POSITION_UNAVAILABLE = 2;

  @JsOverlay
  public static final int TIMEOUT = 3;

  PositionError() {
  }

  @JsProperty(
      name = "code"
  )
  public native int code();

  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();
}
