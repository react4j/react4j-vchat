package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCIceCandidateInit {
  @JsOverlay
  @Nonnull
  static RTCIceCandidateInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getCandidate();

  @JsProperty
  void setCandidate(@Nonnull String candidate);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateInit candidate(@Nonnull final String candidate) {
    setCandidate( candidate );
    return this;
  }

  @JsProperty
  @Nullable
  Double getSdpMLineIndex();

  @JsProperty
  void setSdpMLineIndex(@Nullable Double sdpMLineIndex);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateInit sdpMLineIndex(@Nullable final Double sdpMLineIndex) {
    setSdpMLineIndex( sdpMLineIndex );
    return this;
  }

  @JsProperty
  @Nullable
  String getSdpMid();

  @JsProperty
  void setSdpMid(@Nullable String sdpMid);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateInit sdpMid(@Nullable final String sdpMid) {
    setSdpMid( sdpMid );
    return this;
  }

  @JsProperty
  @Nullable
  String getUsernameFragment();

  @JsProperty
  void setUsernameFragment(@Nullable String usernameFragment);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateInit usernameFragment(@Nullable final String usernameFragment) {
    setUsernameFragment( usernameFragment );
    return this;
  }
}
