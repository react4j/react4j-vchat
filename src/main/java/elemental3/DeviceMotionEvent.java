package elemental3;

import elemental2.promise.Promise;
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
    name = "DeviceMotionEvent"
)
public class DeviceMotionEvent extends Event {
  public DeviceMotionEvent(@Nonnull final String type,
      @Nonnull final DeviceMotionEventInit eventInitDict) {
    super( null );
  }

  public DeviceMotionEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "acceleration"
  )
  @Nullable
  public native DeviceMotionEventAcceleration acceleration();

  @JsProperty(
      name = "accelerationIncludingGravity"
  )
  @Nullable
  public native DeviceMotionEventAcceleration accelerationIncludingGravity();

  @JsProperty(
      name = "interval"
  )
  public native double interval();

  @JsProperty(
      name = "rotationRate"
  )
  @Nullable
  public native DeviceMotionEventRotationRate rotationRate();

  @Nonnull
  public static native Promise<String> requestPermission();
}
