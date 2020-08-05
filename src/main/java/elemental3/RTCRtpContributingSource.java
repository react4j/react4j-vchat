package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCRtpContributingSource dictionary of the the WebRTC API is used by getContributingSources() to provide information about a given contributing source (CSRC), including the most recent time a packet that the source contributed was played out.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource">RTCRtpContributingSource - MDN</a>
 */
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
