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
public interface RTCRtpContributingSource {
  @JsOverlay
  @Nonnull
  static RTCRtpContributingSource create(final int rtpTimestamp, final int source,
      final double timestamp) {
    return Js.<RTCRtpContributingSource>uncheckedCast( JsPropertyMap.of() ).rtpTimestamp( rtpTimestamp ).source( source ).timestamp( timestamp );
  }

  @JsProperty(
      name = "audioLevel"
  )
  double audioLevel();

  @JsProperty
  void setAudioLevel(double audioLevel);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSource audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  @JsProperty(
      name = "rtpTimestamp"
  )
  int rtpTimestamp();

  @JsProperty
  void setRtpTimestamp(int rtpTimestamp);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSource rtpTimestamp(final int rtpTimestamp) {
    setRtpTimestamp( rtpTimestamp );
    return this;
  }

  @JsProperty(
      name = "source"
  )
  int source();

  @JsProperty
  void setSource(int source);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSource source(final int source) {
    setSource( source );
    return this;
  }

  @JsProperty(
      name = "timestamp"
  )
  double timestamp();

  @JsProperty
  void setTimestamp(double timestamp);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSource timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }
}
