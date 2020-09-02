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
import org.intellij.lang.annotations.MagicConstant;

/**
 * The RTCConfiguration dictionary is used to provide configuration options for an RTCPeerConnection. It may be passed into the constructor when instantiating a connection, or used with the RTCPeerConnection.getConfiguration() and RTCPeerConnection.setConfiguration() methods, which allow inspecting and changing the configuration while a connection is established.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration">RTCConfiguration - MDN</a>
 */
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

  @JsProperty(
      name = "bundlePolicy"
  )
  @MagicConstant(
      valuesFromClass = RTCBundlePolicy.class
  )
  String bundlePolicy();

  @JsProperty
  void setBundlePolicy(
      @MagicConstant(valuesFromClass = RTCBundlePolicy.class) @Nonnull String bundlePolicy);

  @JsOverlay
  @Nonnull
  default RTCConfiguration bundlePolicy(
      @MagicConstant(valuesFromClass = RTCBundlePolicy.class) @Nonnull final String bundlePolicy) {
    setBundlePolicy( bundlePolicy );
    return this;
  }

  @JsProperty(
      name = "certificates"
  )
  JsArray<RTCCertificate> certificates();

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

  @JsProperty(
      name = "iceCandidatePoolSize"
  )
  short iceCandidatePoolSize();

  @JsProperty
  void setIceCandidatePoolSize(short iceCandidatePoolSize);

  @JsOverlay
  @Nonnull
  default RTCConfiguration iceCandidatePoolSize(final short iceCandidatePoolSize) {
    setIceCandidatePoolSize( iceCandidatePoolSize );
    return this;
  }

  @JsProperty(
      name = "iceServers"
  )
  JsArray<RTCIceServer> iceServers();

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

  @JsProperty(
      name = "iceTransportPolicy"
  )
  @MagicConstant(
      valuesFromClass = RTCIceTransportPolicy.class
  )
  String iceTransportPolicy();

  @JsProperty
  void setIceTransportPolicy(
      @MagicConstant(valuesFromClass = RTCIceTransportPolicy.class) @Nonnull String iceTransportPolicy);

  @JsOverlay
  @Nonnull
  default RTCConfiguration iceTransportPolicy(
      @MagicConstant(valuesFromClass = RTCIceTransportPolicy.class) @Nonnull final String iceTransportPolicy) {
    setIceTransportPolicy( iceTransportPolicy );
    return this;
  }

  @JsProperty(
      name = "rtcpMuxPolicy"
  )
  @MagicConstant(
      valuesFromClass = RTCRtcpMuxPolicy.class
  )
  String rtcpMuxPolicy();

  @JsProperty
  void setRtcpMuxPolicy(
      @MagicConstant(valuesFromClass = RTCRtcpMuxPolicy.class) @Nonnull String rtcpMuxPolicy);

  @JsOverlay
  @Nonnull
  default RTCConfiguration rtcpMuxPolicy(
      @MagicConstant(valuesFromClass = RTCRtcpMuxPolicy.class) @Nonnull final String rtcpMuxPolicy) {
    setRtcpMuxPolicy( rtcpMuxPolicy );
    return this;
  }

  @JsProperty(
      name = "peerIdentity"
  )
  String peerIdentity();

  @JsProperty
  void setPeerIdentity(@Nonnull String peerIdentity);

  @JsOverlay
  @Nonnull
  default RTCConfiguration peerIdentity(@Nonnull final String peerIdentity) {
    setPeerIdentity( peerIdentity );
    return this;
  }
}
