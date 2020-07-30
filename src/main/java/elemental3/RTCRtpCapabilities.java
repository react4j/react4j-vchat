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
public interface RTCRtpCapabilities {
  @JsOverlay
  @Nonnull
  static RTCRtpCapabilities create(@Nonnull final JsArray<RTCRtpCodecCapability> codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionCapability> headerExtensions) {
    return Js.<RTCRtpCapabilities>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpCapabilities create(@Nonnull final RTCRtpCodecCapability[] codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionCapability> headerExtensions) {
    return Js.<RTCRtpCapabilities>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpCapabilities create(@Nonnull final JsArray<RTCRtpCodecCapability> codecs,
      @Nonnull final RTCRtpHeaderExtensionCapability[] headerExtensions) {
    return Js.<RTCRtpCapabilities>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpCapabilities create(@Nonnull final RTCRtpCodecCapability[] codecs,
      @Nonnull final RTCRtpHeaderExtensionCapability[] headerExtensions) {
    return Js.<RTCRtpCapabilities>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions );
  }

  @JsProperty
  @Nonnull
  JsArray<RTCRtpCodecCapability> getCodecs();

  @JsProperty
  void setCodecs(@Nonnull JsArray<RTCRtpCodecCapability> codecs);

  @JsOverlay
  @Nonnull
  default RTCRtpCapabilities codecs(@Nonnull final JsArray<RTCRtpCodecCapability> codecs) {
    setCodecs( codecs );
    return this;
  }

  @JsOverlay
  default void setCodecs(@Nonnull final RTCRtpCodecCapability... codecs) {
    setCodecs( JsArray.asJsArray( codecs ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpCapabilities codecs(@Nonnull final RTCRtpCodecCapability... codecs) {
    setCodecs( codecs );
    return this;
  }

  @JsProperty
  @Nonnull
  JsArray<RTCRtpHeaderExtensionCapability> getHeaderExtensions();

  @JsProperty
  void setHeaderExtensions(@Nonnull JsArray<RTCRtpHeaderExtensionCapability> headerExtensions);

  @JsOverlay
  @Nonnull
  default RTCRtpCapabilities headerExtensions(
      @Nonnull final JsArray<RTCRtpHeaderExtensionCapability> headerExtensions) {
    setHeaderExtensions( headerExtensions );
    return this;
  }

  @JsOverlay
  default void setHeaderExtensions(
      @Nonnull final RTCRtpHeaderExtensionCapability... headerExtensions) {
    setHeaderExtensions( JsArray.asJsArray( headerExtensions ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpCapabilities headerExtensions(
      @Nonnull final RTCRtpHeaderExtensionCapability... headerExtensions) {
    setHeaderExtensions( headerExtensions );
    return this;
  }
}
