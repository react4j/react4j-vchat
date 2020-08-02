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
public interface RTCRtpSynchronizationSource extends RTCRtpContributingSource {
  @JsOverlay
  @Nonnull
  static RTCRtpSynchronizationSource create(final int rtpTimestamp, final int source,
      final double timestamp) {
    return Js.<RTCRtpSynchronizationSource>uncheckedCast( JsPropertyMap.of() ).rtpTimestamp( rtpTimestamp ).source( source ).timestamp( timestamp );
  }

  @JsProperty(
      name = "voiceActivityFlag"
  )
  boolean voiceActivityFlag();

  @JsProperty
  void setVoiceActivityFlag(boolean voiceActivityFlag);

  @JsOverlay
  @Nonnull
  default RTCRtpSynchronizationSource voiceActivityFlag(final boolean voiceActivityFlag) {
    setVoiceActivityFlag( voiceActivityFlag );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSynchronizationSource audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSynchronizationSource rtpTimestamp(final int rtpTimestamp) {
    setRtpTimestamp( rtpTimestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSynchronizationSource source(final int source) {
    setSource( source );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSynchronizationSource timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }
}
