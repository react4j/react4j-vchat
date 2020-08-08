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
    name = "PointerEvent"
)
public class PointerEvent extends MouseEvent {
  public PointerEvent(@Nonnull final String type, @Nonnull final PointerEventInit eventInitDict) {
    super( null );
  }

  public PointerEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "height"
  )
  public native double height();

  @JsProperty(
      name = "isPrimary"
  )
  public native boolean isPrimary();

  @JsProperty(
      name = "pointerId"
  )
  public native int pointerId();

  @JsProperty(
      name = "pointerType"
  )
  @Nonnull
  public native String pointerType();

  @JsProperty(
      name = "pressure"
  )
  public native float pressure();

  @JsProperty(
      name = "tangentialPressure"
  )
  public native float tangentialPressure();

  @JsProperty(
      name = "tiltX"
  )
  public native int tiltX();

  @JsProperty(
      name = "tiltY"
  )
  public native int tiltY();

  @JsProperty(
      name = "twist"
  )
  public native int twist();

  @JsProperty(
      name = "width"
  )
  public native double width();
}
