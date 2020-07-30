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
    name = "RTCDataChannelEvent"
)
public class RTCDataChannelEvent extends Event {
  public RTCDataChannelEvent(@Nonnull final String type,
      @Nonnull final RTCDataChannelEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "channel"
  )
  @Nonnull
  public native RTCDataChannel channel();
}
