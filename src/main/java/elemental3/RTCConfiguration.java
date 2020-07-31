package elemental3;

import elemental2.core.JsArray;
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
public interface RTCConfiguration {
  @JsOverlay
  @Nonnull
  static RTCConfiguration create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getBundlePolicy();

  @JsProperty
  void setBundlePolicy(@Nonnull String bundlePolicy);

  @JsOverlay
  @Nonnull
  default RTCConfiguration bundlePolicy(@Nonnull final String bundlePolicy) {
    setBundlePolicy( bundlePolicy );
    return this;
  }

  @JsProperty
  JsArray<RTCCertificate> getCertificates();

  @JsProperty
  void setCertificates(@Nonnull JsArray<RTCCertificate> certificates);

  @JsOverlay
  @Nonnull
  default RTCConfiguration certificates(@Nonnull final JsArray<RTCCertificate> certificates) {
    setCertificates( certificates );
    return this;
  }

  @JsOverlay
  default void setCertificates(@Nonnull final RTCCertificate... certificates) {
    setCertificates( JsArray.asJsArray( certificates ) );
  }

  @JsOverlay
  @Nonnull
  default RTCConfiguration certificates(@Nonnull final RTCCertificate... certificates) {
    setCertificates( certificates );
    return this;
  }

  @JsProperty
  short getIceCandidatePoolSize();

  @JsProperty
  void setIceCandidatePoolSize(short iceCandidatePoolSize);

  @JsOverlay
  @Nonnull
  default RTCConfiguration iceCandidatePoolSize(final short iceCandidatePoolSize) {
    setIceCandidatePoolSize( iceCandidatePoolSize );
    return this;
  }

  @JsProperty
  JsArray<RTCIceServer> getIceServers();

  @JsProperty
  void setIceServers(@Nonnull JsArray<RTCIceServer> iceServers);

  @JsOverlay
  @Nonnull
  default RTCConfiguration iceServers(@Nonnull final JsArray<RTCIceServer> iceServers) {
    setIceServers( iceServers );
    return this;
  }

  @JsOverlay
  default void setIceServers(@Nonnull final RTCIceServer... iceServers) {
    setIceServers( JsArray.asJsArray( iceServers ) );
  }

  @JsOverlay
  @Nonnull
  default RTCConfiguration iceServers(@Nonnull final RTCIceServer... iceServers) {
    setIceServers( iceServers );
    return this;
  }

  @JsProperty
  String getIceTransportPolicy();

  @JsProperty
  void setIceTransportPolicy(@Nonnull String iceTransportPolicy);

  @JsOverlay
  @Nonnull
  default RTCConfiguration iceTransportPolicy(@Nonnull final String iceTransportPolicy) {
    setIceTransportPolicy( iceTransportPolicy );
    return this;
  }

  @JsProperty
  String getRtcpMuxPolicy();

  @JsProperty
  void setRtcpMuxPolicy(@Nonnull String rtcpMuxPolicy);

  @JsOverlay
  @Nonnull
  default RTCConfiguration rtcpMuxPolicy(@Nonnull final String rtcpMuxPolicy) {
    setRtcpMuxPolicy( rtcpMuxPolicy );
    return this;
  }
}