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
    name = "RTCIceCandidate"
)
public class RTCIceCandidate {
  public RTCIceCandidate(@Nonnull final RTCIceCandidateInit candidateInitDict) {
  }

  public RTCIceCandidate() {
  }

  @JsProperty(
      name = "address"
  )
  @Nullable
  public native String address();

  @JsProperty(
      name = "candidate"
  )
  @Nonnull
  public native String candidate();

  @JsProperty(
      name = "component"
  )
  @Nullable
  public native String component();

  @JsProperty(
      name = "foundation"
  )
  @Nullable
  public native String foundation();

  @JsProperty(
      name = "port"
  )
  @Nullable
  public native Double port();

  @JsProperty(
      name = "priority"
  )
  @Nullable
  public native Double priority();

  @JsProperty(
      name = "protocol"
  )
  @Nullable
  public native String protocol();

  @JsProperty(
      name = "relatedAddress"
  )
  @Nullable
  public native String relatedAddress();

  @JsProperty(
      name = "relatedPort"
  )
  @Nullable
  public native Double relatedPort();

  @JsProperty(
      name = "sdpMLineIndex"
  )
  @Nullable
  public native Double sdpMLineIndex();

  @JsProperty(
      name = "sdpMid"
  )
  @Nullable
  public native String sdpMid();

  @JsProperty(
      name = "tcpType"
  )
  @Nullable
  public native String tcpType();

  @JsProperty(
      name = "type"
  )
  @Nullable
  public native String type();

  @JsProperty(
      name = "usernameFragment"
  )
  @Nullable
  public native String usernameFragment();

  @Nonnull
  public native RTCIceCandidateInit toJSON();
}
