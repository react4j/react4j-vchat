package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaKeySystemAccess"
)
public class MediaKeySystemAccess {
  MediaKeySystemAccess() {
  }

  @JsProperty(
      name = "keySystem"
  )
  @Nonnull
  public native String keySystem();

  @Nonnull
  public native Promise<MediaKeys> createMediaKeys();

  @Nonnull
  public native MediaKeySystemConfiguration getConfiguration();
}
