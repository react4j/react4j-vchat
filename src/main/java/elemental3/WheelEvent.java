package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WheelEvent"
)
public class WheelEvent extends MouseEvent {
  @JsOverlay
  public static final int DOM_DELTA_LINE = 0x01;

  @JsOverlay
  public static final int DOM_DELTA_PAGE = 0x02;

  @JsOverlay
  public static final int DOM_DELTA_PIXEL = 0x00;

  WheelEvent() {
  }

  @JsProperty(
      name = "deltaMode"
  )
  public native int deltaMode();

  @JsProperty(
      name = "deltaX"
  )
  public native double deltaX();

  @JsProperty(
      name = "deltaY"
  )
  public native double deltaY();

  @JsProperty(
      name = "deltaZ"
  )
  public native double deltaZ();
}
