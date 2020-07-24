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
public interface MediaTrackSupportedConstraints {
  @JsOverlay
  @Nonnull
  static MediaTrackSupportedConstraints create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  boolean isAspectRatio();

  @JsProperty
  void setAspectRatio(boolean aspectRatio);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints aspectRatio(final boolean aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsProperty
  boolean isAutoGainControl();

  @JsProperty
  void setAutoGainControl(boolean autoGainControl);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints autoGainControl(final boolean autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsProperty
  boolean isChannelCount();

  @JsProperty
  void setChannelCount(boolean channelCount);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints channelCount(final boolean channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsProperty
  boolean isDeviceId();

  @JsProperty
  void setDeviceId(boolean deviceId);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints deviceId(final boolean deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsProperty
  boolean isEchoCancellation();

  @JsProperty
  void setEchoCancellation(boolean echoCancellation);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints echoCancellation(final boolean echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsProperty
  boolean isFacingMode();

  @JsProperty
  void setFacingMode(boolean facingMode);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints facingMode(final boolean facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsProperty
  boolean isFrameRate();

  @JsProperty
  void setFrameRate(boolean frameRate);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints frameRate(final boolean frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  @JsProperty
  boolean isGroupId();

  @JsProperty
  void setGroupId(boolean groupId);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints groupId(final boolean groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsProperty
  boolean isHeight();

  @JsProperty
  void setHeight(boolean height);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints height(final boolean height) {
    setHeight( height );
    return this;
  }

  @JsProperty
  boolean isLatency();

  @JsProperty
  void setLatency(boolean latency);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints latency(final boolean latency) {
    setLatency( latency );
    return this;
  }

  @JsProperty
  boolean isNoiseSuppression();

  @JsProperty
  void setNoiseSuppression(boolean noiseSuppression);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints noiseSuppression(final boolean noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsProperty
  boolean isResizeMode();

  @JsProperty
  void setResizeMode(boolean resizeMode);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints resizeMode(final boolean resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsProperty
  boolean isSampleRate();

  @JsProperty
  void setSampleRate(boolean sampleRate);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints sampleRate(final boolean sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsProperty
  boolean isSampleSize();

  @JsProperty
  void setSampleSize(boolean sampleSize);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints sampleSize(final boolean sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsProperty
  boolean isWidth();

  @JsProperty
  void setWidth(boolean width);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints width(final boolean width) {
    setWidth( width );
    return this;
  }
}
