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
public interface RTCRtpSendParameters extends RTCRtpParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpSendParameters create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp,
      @Nonnull final JsArray<RTCRtpEncodingParameters> encodings,
      @Nonnull final String transactionId) {
    return Js.<RTCRtpSendParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpSendParameters create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp,
      @Nonnull final JsArray<RTCRtpEncodingParameters> encodings,
      @Nonnull final String transactionId) {
    return Js.<RTCRtpSendParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpSendParameters create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp,
      @Nonnull final JsArray<RTCRtpEncodingParameters> encodings,
      @Nonnull final String transactionId) {
    return Js.<RTCRtpSendParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpSendParameters create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp,
      @Nonnull final JsArray<RTCRtpEncodingParameters> encodings,
      @Nonnull final String transactionId) {
    return Js.<RTCRtpSendParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpSendParameters create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpEncodingParameters[] encodings,
      @Nonnull final String transactionId) {
    return Js.<RTCRtpSendParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpSendParameters create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpEncodingParameters[] encodings,
      @Nonnull final String transactionId) {
    return Js.<RTCRtpSendParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpSendParameters create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpEncodingParameters[] encodings,
      @Nonnull final String transactionId) {
    return Js.<RTCRtpSendParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpSendParameters create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpEncodingParameters[] encodings,
      @Nonnull final String transactionId) {
    return Js.<RTCRtpSendParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsProperty
  @Nonnull
  JsArray<RTCRtpEncodingParameters> getEncodings();

  @JsProperty
  void setEncodings(@Nonnull JsArray<RTCRtpEncodingParameters> encodings);

  @JsOverlay
  @Nonnull
  default RTCRtpSendParameters encodings(
      @Nonnull final JsArray<RTCRtpEncodingParameters> encodings) {
    setEncodings( encodings );
    return this;
  }

  @JsOverlay
  default void setEncodings(@Nonnull final RTCRtpEncodingParameters... encodings) {
    setEncodings( JsArray.asJsArray( encodings ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpSendParameters encodings(@Nonnull final RTCRtpEncodingParameters... encodings) {
    setEncodings( encodings );
    return this;
  }

  @JsProperty
  @Nonnull
  String getTransactionId();

  @JsProperty
  void setTransactionId(@Nonnull String transactionId);

  @JsOverlay
  @Nonnull
  default RTCRtpSendParameters transactionId(@Nonnull final String transactionId) {
    setTransactionId( transactionId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSendParameters codecs(@Nonnull final JsArray<RTCRtpCodecParameters> codecs) {
    setCodecs( codecs );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSendParameters codecs(@Nonnull final RTCRtpCodecParameters... codecs) {
    setCodecs( codecs );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSendParameters headerExtensions(
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions) {
    setHeaderExtensions( headerExtensions );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSendParameters headerExtensions(
      @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
    setHeaderExtensions( headerExtensions );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSendParameters rtcp(@Nonnull final RTCRtcpParameters rtcp) {
    setRtcp( rtcp );
    return this;
  }
}
