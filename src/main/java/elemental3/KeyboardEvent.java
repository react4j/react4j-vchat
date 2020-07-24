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
    name = "KeyboardEvent"
)
public class KeyboardEvent extends UIEvent {
  @JsOverlay
  public static final int DOM_KEY_LOCATION_LEFT = 0x01;

  @JsOverlay
  public static final int DOM_KEY_LOCATION_NUMPAD = 0x03;

  @JsOverlay
  public static final int DOM_KEY_LOCATION_RIGHT = 0x02;

  @JsOverlay
  public static final int DOM_KEY_LOCATION_STANDARD = 0x00;

  KeyboardEvent() {
  }

  @JsProperty(
      name = "altKey"
  )
  public native boolean altKey();

  @JsProperty(
      name = "code"
  )
  @Nonnull
  public native String code();

  @JsProperty(
      name = "ctrlKey"
  )
  public native boolean ctrlKey();

  @JsProperty(
      name = "isComposing"
  )
  public native boolean isComposing();

  @JsProperty(
      name = "key"
  )
  @Nonnull
  public native String key();

  @JsProperty(
      name = "location"
  )
  public native int location();

  @JsProperty(
      name = "metaKey"
  )
  public native boolean metaKey();

  @JsProperty(
      name = "repeat"
  )
  public native boolean repeat();

  @JsProperty(
      name = "shiftKey"
  )
  public native boolean shiftKey();

  @JsProperty(
      name = "charCode"
  )
  public native int charCode();

  @JsProperty(
      name = "keyCode"
  )
  public native int keyCode();

  public native boolean getModifierState(@Nonnull String keyArg);
}
