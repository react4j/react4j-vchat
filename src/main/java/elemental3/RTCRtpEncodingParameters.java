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
public interface RTCRtpEncodingParameters extends RTCRtpCodingParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpEncodingParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  boolean isActive();

  @JsProperty
  void setActive(boolean active);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters active(final boolean active) {
    setActive( active );
    return this;
  }

  @JsProperty
  int getMaxBitrate();

  @JsProperty
  void setMaxBitrate(int maxBitrate);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters maxBitrate(final int maxBitrate) {
    setMaxBitrate( maxBitrate );
    return this;
  }

  @JsProperty
  double getScaleResolutionDownBy();

  @JsProperty
  void setScaleResolutionDownBy(double scaleResolutionDownBy);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters scaleResolutionDownBy(final double scaleResolutionDownBy) {
    setScaleResolutionDownBy( scaleResolutionDownBy );
    return this;
  }

  @JsProperty
  String getNetworkPriority();

  @JsProperty
  void setNetworkPriority(@Nonnull String networkPriority);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters networkPriority(@Nonnull final String networkPriority) {
    setNetworkPriority( networkPriority );
    return this;
  }

  @JsProperty
  String getPriority();

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
