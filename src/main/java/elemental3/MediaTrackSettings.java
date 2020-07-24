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
public interface MediaTrackSettings {
  @JsOverlay
  @Nonnull
  static MediaTrackSettings create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  double getAspectRatio();

  @JsProperty
  void setAspectRatio(double aspectRatio);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings aspectRatio(final double aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsProperty
  boolean isAutoGainControl();

  @JsProperty
  void setAutoGainControl(boolean autoGainControl);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings autoGainControl(final boolean autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsProperty
  int getChannelCount();

  @JsProperty
  void setChannelCount(int channelCount);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsProperty
  String getDeviceId();

  @JsProperty
  void setDeviceId(@Nonnull String deviceId);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings deviceId(@Nonnull final String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsProperty
  boolean isEchoCancellation();

  @JsProperty
  void setEchoCancellation(boolean echoCancellation);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings echoCancellation(final boolean echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsProperty
  String getFacingMode();

  @JsProperty
  void setFacingMode(@Nonnull String facingMode);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings facingMode(@Nonnull final String facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsProperty
  double getFrameRate();

  @JsProperty
  void setFrameRate(double frameRate);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings frameRate(final double frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  @JsProperty
  String getGroupId();

  @JsProperty
  void setGroupId(@Nonnull String groupId);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings groupId(@Nonnull final String groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsProperty
  int getHeight();

  @JsProperty
  void setHeight(int height);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings height(final int height) {
    setHeight( height );
    return this;
  }

  @JsProperty
  double getLatency();

  @JsProperty
  void setLatency(double latency);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings latency(final double latency) {
    setLatency( latency );
    return this;
  }

  @JsProperty
  boolean isNoiseSuppression();

  @JsProperty
  void setNoiseSuppression(boolean noiseSuppression);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings noiseSuppression(final boolean noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsProperty
  String getResizeMode();

  @JsProperty
  void setResizeMode(@Nonnull String resizeMode);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings resizeMode(@Nonnull final String resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsProperty
  int getSampleRate();

  @JsProperty
  void setSampleRate(int sampleRate);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings sampleRate(final int sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsProperty
  int getSampleSize();

  @JsProperty
  void setSampleSize(int sampleSize);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings sampleSize(final int sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsProperty
  int getWidth();

  @JsProperty
  void setWidth(int width);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings width(final int width) {
    setWidth( width );
    return this;
  }
}
