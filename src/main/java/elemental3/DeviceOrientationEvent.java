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
    name = "DeviceOrientationEvent"
)
public class DeviceOrientationEvent extends Event {
  public DeviceOrientationEvent(@Nonnull final String type,
      @Nonnull final DeviceOrientationEventInit eventInitDict) {
    super( null );
  }

  public DeviceOrientationEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "absolute"
  )
  public native boolean absolute();

  @JsProperty(
      name = "alpha"
  )
  @Nullable
  public native Double alpha();

  @JsProperty(
      name = "beta"
  )
  @Nullable
  public native Double beta();

  @JsProperty(
      name = "gamma"
  )
  @Nullable
  public native Double gamma();

  @Nonnull
  public static native Promise<String> requestPermission();
}
