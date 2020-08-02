package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
public interface RTCIceCandidatePair {
  @JsOverlay
  @Nonnull
  static RTCIceCandidatePair create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "local"
  )
  RTCIceCandidate local();

  @JsProperty
  void setLocal(@Nonnull RTCIceCandidate local);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePair local(@Nonnull final RTCIceCandidate local) {
    setLocal( local );
    return this;
  }

  @JsProperty(
      name = "remote"
  )
  RTCIceCandidate remote();

  @JsProperty
  void setRemote(@Nonnull RTCIceCandidate remote);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePair remote(@Nonnull final RTCIceCandidate remote) {
    setRemote( remote );
    return this;
  }
}
