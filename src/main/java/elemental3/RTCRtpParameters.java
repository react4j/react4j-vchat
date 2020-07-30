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
public interface RTCRtpParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpParameters create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpParameters create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpParameters create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpParameters create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsProperty
  @Nonnull
  JsArray<RTCRtpCodecParameters> getCodecs();

  @JsProperty
  void setCodecs(@Nonnull JsArray<RTCRtpCodecParameters> codecs);

  @JsOverlay
  @Nonnull
  default RTCRtpParameters codecs(@Nonnull final JsArray<RTCRtpCodecParameters> codecs) {
    setCodecs( codecs );
    return this;
  }

  @JsOverlay
  default void setCodecs(@Nonnull final RTCRtpCodecParameters... codecs) {
    setCodecs( JsArray.asJsArray( codecs ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpParameters codecs(@Nonnull final RTCRtpCodecParameters... codecs) {
    setCodecs( codecs );
    return this;
  }

  @JsProperty
  @Nonnull
  JsArray<RTCRtpHeaderExtensionParameters> getHeaderExtensions();

  @JsProperty
  void setHeaderExtensions(@Nonnull JsArray<RTCRtpHeaderExtensionParameters> headerExtensions);

  @JsOverlay
  @Nonnull
  default RTCRtpParameters headerExtensions(
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions) {
    setHeaderExtensions( headerExtensions );
    return this;
  }

  @JsOverlay
  default void setHeaderExtensions(
      @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
    setHeaderExtensions( JsArray.asJsArray( headerExtensions ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpParameters headerExtensions(
      @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
    setHeaderExtensions( headerExtensions );
    return this;
  }

  @JsProperty
  @Nonnull
  RTCRtcpParameters getRtcp();

  @JsProperty
  void setRtcp(@Nonnull RTCRtcpParameters rtcp);

  @JsOverlay
  @Nonnull
  default RTCRtpParameters rtcp(@Nonnull final RTCRtcpParameters rtcp) {
    setRtcp( rtcp );
    return this;
  }
}
