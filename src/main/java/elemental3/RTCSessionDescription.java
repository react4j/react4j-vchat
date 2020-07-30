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
    name = "RTCSessionDescription"
)
public class RTCSessionDescription {
  public RTCSessionDescription(@Nonnull final RTCSessionDescriptionInit descriptionInitDict) {
  }

  @JsProperty(
      name = "sdp"
  )
  @Nonnull
  public native String sdp();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @Nonnull
  public native Object toJSON();
}
