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
    name = "RTCDTMFToneChangeEvent"
)
public class RTCDTMFToneChangeEvent extends Event {
  public RTCDTMFToneChangeEvent(@Nonnull final String type,
      @Nonnull final RTCDTMFToneChangeEventInit eventInitDict) {
    super( null );
  }

  public RTCDTMFToneChangeEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "tone"
  )
  @Nonnull
  public native String tone();
}
