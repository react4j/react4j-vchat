package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DeviceMotionEventAcceleration"
)
public class DeviceMotionEventAcceleration {
  DeviceMotionEventAcceleration() {
  }

  @JsProperty(
      name = "x"
  )
  @Nullable
  public native Double x();

  @JsProperty(
      name = "y"
  )
  @Nullable
  public native Double y();

  @JsProperty(
      name = "z"
  )
  @Nullable
  public native Double z();
}
