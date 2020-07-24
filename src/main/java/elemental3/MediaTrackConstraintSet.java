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
public interface MediaTrackConstraintSet {
  @JsOverlay
  @Nonnull
  static MediaTrackConstraintSet create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  ConstrainDouble getAspectRatio();

  @JsProperty
  void setAspectRatio(@Nonnull ConstrainDouble aspectRatio);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet aspectRatio(@Nonnull final ConstrainDouble aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsOverlay
  default void setAspectRatio(final double aspectRatio) {
    setAspectRatio( ConstrainDouble.of( aspectRatio ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet aspectRatio(final double aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsOverlay
  default void setAspectRatio(@Nonnull final ConstrainDoubleRange aspectRatio) {
    setAspectRatio( ConstrainDouble.of( aspectRatio ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet aspectRatio(@Nonnull final ConstrainDoubleRange aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsProperty
  ConstrainBoolean getAutoGainControl();

  @JsProperty
  void setAutoGainControl(@Nonnull ConstrainBoolean autoGainControl);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet autoGainControl(@Nonnull final ConstrainBoolean autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsOverlay
  default void setAutoGainControl(final boolean autoGainControl) {
    setAutoGainControl( ConstrainBoolean.of( autoGainControl ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet autoGainControl(final boolean autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsOverlay
  default void setAutoGainControl(@Nonnull final ConstrainBooleanParameters autoGainControl) {
    setAutoGainControl( ConstrainBoolean.of( autoGainControl ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet autoGainControl(
      @Nonnull final ConstrainBooleanParameters autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsProperty
  ConstrainULong getChannelCount();

  @JsProperty
  void setChannelCount(@Nonnull ConstrainULong channelCount);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet channelCount(@Nonnull final ConstrainULong channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  default void setChannelCount(final int channelCount) {
    setChannelCount( ConstrainULong.of( channelCount ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  default void setChannelCount(@Nonnull final ConstrainULongRange channelCount) {
    setChannelCount( ConstrainULong.of( channelCount ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet channelCount(@Nonnull final ConstrainULongRange channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsProperty
  ConstrainDOMString getDeviceId();

  @JsProperty
  void setDeviceId(@Nonnull ConstrainDOMString deviceId);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet deviceId(@Nonnull final ConstrainDOMString deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  default void setDeviceId(@Nonnull final String deviceId) {
    setDeviceId( ConstrainDOMString.of( deviceId ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet deviceId(@Nonnull final String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  default void setDeviceId(@Nonnull final JsArray<String> deviceId) {
    setDeviceId( ConstrainDOMString.of( deviceId ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet deviceId(@Nonnull final JsArray<String> deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  default void setDeviceId(@Nonnull final String... deviceId) {
    setDeviceId( ConstrainDOMString.of( deviceId ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet deviceId(@Nonnull final String... deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  default void setDeviceId(@Nonnull final ConstrainDOMStringParameters deviceId) {
    setDeviceId( ConstrainDOMString.of( deviceId ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet deviceId(@Nonnull final ConstrainDOMStringParameters deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsProperty
  ConstrainBoolean getEchoCancellation();

  @JsProperty
  void setEchoCancellation(@Nonnull ConstrainBoolean echoCancellation);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet echoCancellation(
      @Nonnull final ConstrainBoolean echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsOverlay
  default void setEchoCancellation(final boolean echoCancellation) {
    setEchoCancellation( ConstrainBoolean.of( echoCancellation ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet echoCancellation(final boolean echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsOverlay
  default void setEchoCancellation(@Nonnull final ConstrainBooleanParameters echoCancellation) {
    setEchoCancellation( ConstrainBoolean.of( echoCancellation ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet echoCancellation(
      @Nonnull final ConstrainBooleanParameters echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsProperty
  ConstrainDOMString getFacingMode();

  @JsProperty
  void setFacingMode(@Nonnull ConstrainDOMString facingMode);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet facingMode(@Nonnull final ConstrainDOMString facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsOverlay
  default void setFacingMode(@Nonnull final String facingMode) {
    setFacingMode( ConstrainDOMString.of( facingMode ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet facingMode(@Nonnull final String facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsOverlay
  default void setFacingMode(@Nonnull final JsArray<String> facingMode) {
    setFacingMode( ConstrainDOMString.of( facingMode ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet facingMode(@Nonnull final JsArray<String> facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsOverlay
  default void setFacingMode(@Nonnull final String... facingMode) {
    setFacingMode( ConstrainDOMString.of( facingMode ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet facingMode(@Nonnull final String... facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsOverlay
  default void setFacingMode(@Nonnull final ConstrainDOMStringParameters facingMode) {
    setFacingMode( ConstrainDOMString.of( facingMode ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet facingMode(
      @Nonnull final ConstrainDOMStringParameters facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsProperty
  ConstrainDouble getFrameRate();

  @JsProperty
  void setFrameRate(@Nonnull ConstrainDouble frameRate);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet frameRate(@Nonnull final ConstrainDouble frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  @JsOverlay
  default void setFrameRate(final double frameRate) {
    setFrameRate( ConstrainDouble.of( frameRate ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet frameRate(final double frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  @JsOverlay
  default void setFrameRate(@Nonnull final ConstrainDoubleRange frameRate) {
    setFrameRate( ConstrainDouble.of( frameRate ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet frameRate(@Nonnull final ConstrainDoubleRange frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  @JsProperty
  ConstrainDOMString getGroupId();

  @JsProperty
  void setGroupId(@Nonnull ConstrainDOMString groupId);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet groupId(@Nonnull final ConstrainDOMString groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsOverlay
  default void setGroupId(@Nonnull final String groupId) {
    setGroupId( ConstrainDOMString.of( groupId ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet groupId(@Nonnull final String groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsOverlay
  default void setGroupId(@Nonnull final JsArray<String> groupId) {
    setGroupId( ConstrainDOMString.of( groupId ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet groupId(@Nonnull final JsArray<String> groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsOverlay
  default void setGroupId(@Nonnull final String... groupId) {
    setGroupId( ConstrainDOMString.of( groupId ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet groupId(@Nonnull final String... groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsOverlay
  default void setGroupId(@Nonnull final ConstrainDOMStringParameters groupId) {
    setGroupId( ConstrainDOMString.of( groupId ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet groupId(@Nonnull final ConstrainDOMStringParameters groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsProperty
  ConstrainULong getHeight();

  @JsProperty
  void setHeight(@Nonnull ConstrainULong height);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet height(@Nonnull final ConstrainULong height) {
    setHeight( height );
    return this;
  }

  @JsOverlay
  default void setHeight(final int height) {
    setHeight( ConstrainULong.of( height ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet height(final int height) {
    setHeight( height );
    return this;
  }

  @JsOverlay
  default void setHeight(@Nonnull final ConstrainULongRange height) {
    setHeight( ConstrainULong.of( height ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet height(@Nonnull final ConstrainULongRange height) {
    setHeight( height );
    return this;
  }

  @JsProperty
  ConstrainDouble getLatency();

  @JsProperty
  void setLatency(@Nonnull ConstrainDouble latency);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet latency(@Nonnull final ConstrainDouble latency) {
    setLatency( latency );
    return this;
  }

  @JsOverlay
  default void setLatency(final double latency) {
    setLatency( ConstrainDouble.of( latency ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet latency(final double latency) {
    setLatency( latency );
    return this;
  }

  @JsOverlay
  default void setLatency(@Nonnull final ConstrainDoubleRange latency) {
    setLatency( ConstrainDouble.of( latency ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet latency(@Nonnull final ConstrainDoubleRange latency) {
    setLatency( latency );
    return this;
  }

  @JsProperty
  ConstrainBoolean getNoiseSuppression();

  @JsProperty
  void setNoiseSuppression(@Nonnull ConstrainBoolean noiseSuppression);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet noiseSuppression(
      @Nonnull final ConstrainBoolean noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsOverlay
  default void setNoiseSuppression(final boolean noiseSuppression) {
    setNoiseSuppression( ConstrainBoolean.of( noiseSuppression ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet noiseSuppression(final boolean noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsOverlay
  default void setNoiseSuppression(@Nonnull final ConstrainBooleanParameters noiseSuppression) {
    setNoiseSuppression( ConstrainBoolean.of( noiseSuppression ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet noiseSuppression(
      @Nonnull final ConstrainBooleanParameters noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsProperty
  ConstrainDOMString getResizeMode();

  @JsProperty
  void setResizeMode(@Nonnull ConstrainDOMString resizeMode);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet resizeMode(@Nonnull final ConstrainDOMString resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsOverlay
  default void setResizeMode(@Nonnull final String resizeMode) {
    setResizeMode( ConstrainDOMString.of( resizeMode ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet resizeMode(@Nonnull final String resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsOverlay
  default void setResizeMode(@Nonnull final JsArray<String> resizeMode) {
    setResizeMode( ConstrainDOMString.of( resizeMode ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet resizeMode(@Nonnull final JsArray<String> resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsOverlay
  default void setResizeMode(@Nonnull final String... resizeMode) {
    setResizeMode( ConstrainDOMString.of( resizeMode ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet resizeMode(@Nonnull final String... resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsOverlay
  default void setResizeMode(@Nonnull final ConstrainDOMStringParameters resizeMode) {
    setResizeMode( ConstrainDOMString.of( resizeMode ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet resizeMode(
      @Nonnull final ConstrainDOMStringParameters resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsProperty
  ConstrainULong getSampleRate();

  @JsProperty
  void setSampleRate(@Nonnull ConstrainULong sampleRate);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet sampleRate(@Nonnull final ConstrainULong sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsOverlay
  default void setSampleRate(final int sampleRate) {
    setSampleRate( ConstrainULong.of( sampleRate ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet sampleRate(final int sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsOverlay
  default void setSampleRate(@Nonnull final ConstrainULongRange sampleRate) {
    setSampleRate( ConstrainULong.of( sampleRate ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet sampleRate(@Nonnull final ConstrainULongRange sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsProperty
  ConstrainULong getSampleSize();

  @JsProperty
  void setSampleSize(@Nonnull ConstrainULong sampleSize);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet sampleSize(@Nonnull final ConstrainULong sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsOverlay
  default void setSampleSize(final int sampleSize) {
    setSampleSize( ConstrainULong.of( sampleSize ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet sampleSize(final int sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsOverlay
  default void setSampleSize(@Nonnull final ConstrainULongRange sampleSize) {
    setSampleSize( ConstrainULong.of( sampleSize ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet sampleSize(@Nonnull final ConstrainULongRange sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsProperty
  ConstrainULong getWidth();

  @JsProperty
  void setWidth(@Nonnull ConstrainULong width);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet width(@Nonnull final ConstrainULong width) {
    setWidth( width );
    return this;
  }

  @JsOverlay
  default void setWidth(final int width) {
    setWidth( ConstrainULong.of( width ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet width(final int width) {
    setWidth( width );
    return this;
  }

  @JsOverlay
  default void setWidth(@Nonnull final ConstrainULongRange width) {
    setWidth( ConstrainULong.of( width ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraintSet width(@Nonnull final ConstrainULongRange width) {
    setWidth( width );
    return this;
  }
}
