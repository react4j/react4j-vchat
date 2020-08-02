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
public interface RTCCertificateStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCCertificateStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String base64Certificate,
      @Nonnull final String fingerprint, @Nonnull final String fingerprintAlgorithm) {
    return Js.<RTCCertificateStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).base64Certificate( base64Certificate ).fingerprint( fingerprint ).fingerprintAlgorithm( fingerprintAlgorithm );
  }

  @JsProperty(
      name = "base64Certificate"
  )
  @Nonnull
  String base64Certificate();

  @JsProperty
  void setBase64Certificate(@Nonnull String base64Certificate);

  @JsOverlay
  @Nonnull
  default RTCCertificateStats base64Certificate(@Nonnull final String base64Certificate) {
    setBase64Certificate( base64Certificate );
    return this;
  }

  @JsProperty(
      name = "fingerprint"
  )
  @Nonnull
  String fingerprint();

  @JsProperty
  void setFingerprint(@Nonnull String fingerprint);

  @JsOverlay
  @Nonnull
  default RTCCertificateStats fingerprint(@Nonnull final String fingerprint) {
    setFingerprint( fingerprint );
    return this;
  }

  @JsProperty(
      name = "fingerprintAlgorithm"
  )
  @Nonnull
  String fingerprintAlgorithm();

  @JsProperty
  void setFingerprintAlgorithm(@Nonnull String fingerprintAlgorithm);

  @JsOverlay
  @Nonnull
  default RTCCertificateStats fingerprintAlgorithm(@Nonnull final String fingerprintAlgorithm) {
    setFingerprintAlgorithm( fingerprintAlgorithm );
    return this;
  }

  @JsProperty(
      name = "issuerCertificateId"
  )
  String issuerCertificateId();

  @JsProperty
  void setIssuerCertificateId(@Nonnull String issuerCertificateId);

  @JsOverlay
  @Nonnull
  default RTCCertificateStats issuerCertificateId(@Nonnull final String issuerCertificateId) {
    setIssuerCertificateId( issuerCertificateId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCCertificateStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCCertificateStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCCertificateStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
