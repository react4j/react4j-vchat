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
 * The MediaTrackSupportedConstraints dictionary establishes the list of constrainable properties recognized by the user agent or browser in its implementation of the MediaStreamTrack object. An object conforming to MediaTrackSupportedConstraints is returned by MediaDevices.getSupportedConstraints().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints">MediaTrackSupportedConstraints - MDN</a>
 */
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

  @JsProperty(
      name = "aspectRatio"
  )
  boolean aspectRatio();

  @JsProperty
  void setAspectRatio(boolean aspectRatio);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints aspectRatio(final boolean aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsProperty(
      name = "autoGainControl"
  )
  boolean autoGainControl();

  @JsProperty
  void setAutoGainControl(boolean autoGainControl);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints autoGainControl(final boolean autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsProperty(
      name = "channelCount"
  )
  boolean channelCount();

  @JsProperty
  void setChannelCount(boolean channelCount);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints channelCount(final boolean channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsProperty(
      name = "deviceId"
  )
  boolean deviceId();

  @JsProperty
  void setDeviceId(boolean deviceId);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints deviceId(final boolean deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsProperty(
      name = "echoCancellation"
  )
  boolean echoCancellation();

  @JsProperty
  void setEchoCancellation(boolean echoCancellation);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints echoCancellation(final boolean echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsProperty(
      name = "facingMode"
  )
  boolean facingMode();

  @JsProperty
  void setFacingMode(boolean facingMode);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints facingMode(final boolean facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsProperty(
      name = "frameRate"
  )
  boolean frameRate();

  @JsProperty
  void setFrameRate(boolean frameRate);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints frameRate(final boolean frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  @JsProperty(
      name = "groupId"
  )
  boolean groupId();

  @JsProperty
  void setGroupId(boolean groupId);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints groupId(final boolean groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsProperty(
      name = "height"
  )
  boolean height();

  @JsProperty
  void setHeight(boolean height);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints height(final boolean height) {
    setHeight( height );
    return this;
  }

  @JsProperty(
      name = "latency"
  )
  boolean latency();

  @JsProperty
  void setLatency(boolean latency);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints latency(final boolean latency) {
    setLatency( latency );
    return this;
  }

  @JsProperty(
      name = "noiseSuppression"
  )
  boolean noiseSuppression();

  @JsProperty
  void setNoiseSuppression(boolean noiseSuppression);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints noiseSuppression(final boolean noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsProperty(
      name = "resizeMode"
  )
  boolean resizeMode();

  @JsProperty
  void setResizeMode(boolean resizeMode);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints resizeMode(final boolean resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsProperty(
      name = "sampleRate"
  )
  boolean sampleRate();

  @JsProperty
  void setSampleRate(boolean sampleRate);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints sampleRate(final boolean sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsProperty(
      name = "sampleSize"
  )
  boolean sampleSize();

  @JsProperty
  void setSampleSize(boolean sampleSize);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints sampleSize(final boolean sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsProperty(
      name = "width"
  )
  boolean width();

  @JsProperty
  void setWidth(boolean width);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints width(final boolean width) {
    setWidth( width );
    return this;
  }

  @JsProperty(
      name = "cursor"
  )
  boolean cursor();

  @JsProperty
  void setCursor(boolean cursor);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints cursor(final boolean cursor) {
    setCursor( cursor );
    return this;
  }

  @JsProperty(
      name = "displaySurface"
  )
  boolean displaySurface();

  @JsProperty
  void setDisplaySurface(boolean displaySurface);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints displaySurface(final boolean displaySurface) {
    setDisplaySurface( displaySurface );
    return this;
  }

  @JsProperty(
      name = "logicalSurface"
  )
  boolean logicalSurface();

  @JsProperty
  void setLogicalSurface(boolean logicalSurface);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints logicalSurface(final boolean logicalSurface) {
    setLogicalSurface( logicalSurface );
    return this;
  }

  @JsProperty(
      name = "restrictOwnAudio"
  )
  boolean restrictOwnAudio();

  @JsProperty
  void setRestrictOwnAudio(boolean restrictOwnAudio);

  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints restrictOwnAudio(final boolean restrictOwnAudio) {
    setRestrictOwnAudio( restrictOwnAudio );
    return this;
  }
}
