package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class Geolocation {
  Geolocation() {
  }

  public native void clearWatch(int watchId);

  public native void getCurrentPosition(@Nonnull PositionCallback successCallback,
      @Nonnull PositionErrorCallback errorCallback, @Nonnull PositionOptions options);

  public native void getCurrentPosition(@Nonnull PositionCallback successCallback,
      @Nonnull PositionErrorCallback errorCallback);

  public native void getCurrentPosition(@Nonnull PositionCallback successCallback);

  public native int watchPosition(@Nonnull PositionCallback successCallback,
      @Nonnull PositionErrorCallback errorCallback, @Nonnull PositionOptions options);

  public native int watchPosition(@Nonnull PositionCallback successCallback,
      @Nonnull PositionErrorCallback errorCallback);

  public native int watchPosition(@Nonnull PositionCallback successCallback);
}
