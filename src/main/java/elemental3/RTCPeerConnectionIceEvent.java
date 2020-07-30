package elemental3;

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
    name = "RTCPeerConnectionIceEvent"
)
public class RTCPeerConnectionIceEvent extends Event {
  public RTCPeerConnectionIceEvent(@Nonnull final String type,
      @Nonnull final RTCPeerConnectionIceEventInit eventInitDict) {
    super( null );
  }

  public RTCPeerConnectionIceEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "candidate"
  )
  @Nullable
  public native RTCIceCandidate candidate();

  @JsProperty(
      name = "url"
  )
  @Nullable
  public native String url();
}
