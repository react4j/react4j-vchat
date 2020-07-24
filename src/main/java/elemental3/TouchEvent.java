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
    name = "TouchEvent"
)
public class TouchEvent extends UIEvent {
  public TouchEvent(@Nonnull final String type, @Nonnull final TouchEventInit eventInitDict) {
  }

  public TouchEvent(@Nonnull final String type) {
  }

  @JsProperty(
      name = "altKey"
  )
  public native boolean altKey();

  @JsProperty(
      name = "changedTouches"
  )
  @Nonnull
  public native TouchList changedTouches();

  @JsProperty(
      name = "ctrlKey"
  )
  public native boolean ctrlKey();

  @JsProperty(
      name = "metaKey"
  )
  public native boolean metaKey();

  @JsProperty(
      name = "shiftKey"
  )
  public native boolean shiftKey();

  @JsProperty(
      name = "targetTouches"
  )
  @Nonnull
  public native TouchList targetTouches();

  @JsProperty(
      name = "touches"
  )
  @Nonnull
  public native TouchList touches();
}
