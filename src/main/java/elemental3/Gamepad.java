package elemental3;

import elemental2.core.JsArray;
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
    name = "Gamepad"
)
public class Gamepad {
  Gamepad() {
  }

  @JsProperty(
      name = "axes"
  )
  @Nonnull
  public native JsArray<Double> axes();

  @JsProperty(
      name = "buttons"
  )
  @Nonnull
  public native JsArray<GamepadButton> buttons();

  @JsProperty(
      name = "connected"
  )
  public native boolean connected();

  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  @JsProperty(
      name = "index"
  )
  public native int index();

  @JsProperty(
      name = "mapping"
  )
  @Nonnull
  public native String mapping();

  @JsProperty(
      name = "timestamp"
  )
  public native double timestamp();

  @JsProperty(
      name = "hand"
  )
  @Nonnull
  public native String hand();

  @JsProperty(
      name = "hapticActuators"
  )
  @Nonnull
  public native JsArray<GamepadHapticActuator> hapticActuators();

  @JsProperty(
      name = "pose"
  )
  @Nullable
  public native GamepadPose pose();
}
