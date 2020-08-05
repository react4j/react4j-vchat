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
 * An instance of the WebRTC API's RTCRtpEncodingParameters dictionary describes a single configuration of a codec for an RTCRtpSender.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters">RTCRtpEncodingParameters - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRtpEncodingParameters extends RTCRtpCodingParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpEncodingParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "active"
  )
  boolean active();

  @JsProperty
  void setActive(boolean active);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters active(final boolean active) {
    setActive( active );
    return this;
  }

  @JsProperty(
      name = "maxBitrate"
  )
  int maxBitrate();

  @JsProperty
  void setMaxBitrate(int maxBitrate);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters maxBitrate(final int maxBitrate) {
    setMaxBitrate( maxBitrate );
    return this;
  }

  @JsProperty(
      name = "scaleResolutionDownBy"
  )
  double scaleResolutionDownBy();

  @JsProperty
  void setScaleResolutionDownBy(double scaleResolutionDownBy);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters scaleResolutionDownBy(final double scaleResolutionDownBy) {
    setScaleResolutionDownBy( scaleResolutionDownBy );
    return this;
  }

  @JsProperty(
      name = "networkPriority"
  )
  String networkPriority();

  @JsProperty
  void setNetworkPriority(@Nonnull String networkPriority);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters networkPriority(@Nonnull final String networkPriority) {
    setNetworkPriority( networkPriority );
    return this;
  }

  @JsProperty(
      name = "priority"
  )
  String priority();

  @JsProperty
  void setPriority(@Nonnull String priority);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpEncodingParameters rid(@Nonnull final String rid) {
    setRid( rid );
    return this;
  }
}
