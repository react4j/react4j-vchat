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

  /**
   * The MediaTrackSupportedConstraints dictionary's aspectRatio property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the aspectRatio constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/aspectRatio">MediaTrackSupportedConstraints.aspectRatio - MDN</a>
   */
  @JsProperty(
      name = "aspectRatio"
  )
  boolean aspectRatio();

  /**
   * The MediaTrackSupportedConstraints dictionary's aspectRatio property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the aspectRatio constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/aspectRatio">MediaTrackSupportedConstraints.aspectRatio - MDN</a>
   */
  @JsProperty
  void setAspectRatio(boolean aspectRatio);

  /**
   * The MediaTrackSupportedConstraints dictionary's aspectRatio property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the aspectRatio constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/aspectRatio">MediaTrackSupportedConstraints.aspectRatio - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints aspectRatio(final boolean aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's autoGainControl property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the autoGainControl constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/autoGainControl">MediaTrackSupportedConstraints.autoGainControl - MDN</a>
   */
  @JsProperty(
      name = "autoGainControl"
  )
  boolean autoGainControl();

  /**
   * The MediaTrackSupportedConstraints dictionary's autoGainControl property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the autoGainControl constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/autoGainControl">MediaTrackSupportedConstraints.autoGainControl - MDN</a>
   */
  @JsProperty
  void setAutoGainControl(boolean autoGainControl);

  /**
   * The MediaTrackSupportedConstraints dictionary's autoGainControl property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the autoGainControl constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/autoGainControl">MediaTrackSupportedConstraints.autoGainControl - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints autoGainControl(final boolean autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's channelCount property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the channelCount constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/channelCount">MediaTrackSupportedConstraints.channelCount - MDN</a>
   */
  @JsProperty(
      name = "channelCount"
  )
  boolean channelCount();

  /**
   * The MediaTrackSupportedConstraints dictionary's channelCount property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the channelCount constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/channelCount">MediaTrackSupportedConstraints.channelCount - MDN</a>
   */
  @JsProperty
  void setChannelCount(boolean channelCount);

  /**
   * The MediaTrackSupportedConstraints dictionary's channelCount property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the channelCount constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/channelCount">MediaTrackSupportedConstraints.channelCount - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints channelCount(final boolean channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's deviceId property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the deviceId constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/deviceId">MediaTrackSupportedConstraints.deviceId - MDN</a>
   */
  @JsProperty(
      name = "deviceId"
  )
  boolean deviceId();

  /**
   * The MediaTrackSupportedConstraints dictionary's deviceId property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the deviceId constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/deviceId">MediaTrackSupportedConstraints.deviceId - MDN</a>
   */
  @JsProperty
  void setDeviceId(boolean deviceId);

  /**
   * The MediaTrackSupportedConstraints dictionary's deviceId property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the deviceId constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/deviceId">MediaTrackSupportedConstraints.deviceId - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints deviceId(final boolean deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's echoCancellation property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the echoCancellation constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/echoCancellation">MediaTrackSupportedConstraints.echoCancellation - MDN</a>
   */
  @JsProperty(
      name = "echoCancellation"
  )
  boolean echoCancellation();

  /**
   * The MediaTrackSupportedConstraints dictionary's echoCancellation property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the echoCancellation constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/echoCancellation">MediaTrackSupportedConstraints.echoCancellation - MDN</a>
   */
  @JsProperty
  void setEchoCancellation(boolean echoCancellation);

  /**
   * The MediaTrackSupportedConstraints dictionary's echoCancellation property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the echoCancellation constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/echoCancellation">MediaTrackSupportedConstraints.echoCancellation - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints echoCancellation(final boolean echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's facingMode property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the facingMode constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/facingMode">MediaTrackSupportedConstraints.facingMode - MDN</a>
   */
  @JsProperty(
      name = "facingMode"
  )
  boolean facingMode();

  /**
   * The MediaTrackSupportedConstraints dictionary's facingMode property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the facingMode constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/facingMode">MediaTrackSupportedConstraints.facingMode - MDN</a>
   */
  @JsProperty
  void setFacingMode(boolean facingMode);

  /**
   * The MediaTrackSupportedConstraints dictionary's facingMode property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the facingMode constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/facingMode">MediaTrackSupportedConstraints.facingMode - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints facingMode(final boolean facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's frameRate property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the frameRate constraint.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/frameRate">MediaTrackSupportedConstraints.frameRate - MDN</a>
   */
  @JsProperty(
      name = "frameRate"
  )
  boolean frameRate();

  /**
   * The MediaTrackSupportedConstraints dictionary's frameRate property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the frameRate constraint.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/frameRate">MediaTrackSupportedConstraints.frameRate - MDN</a>
   */
  @JsProperty
  void setFrameRate(boolean frameRate);

  /**
   * The MediaTrackSupportedConstraints dictionary's frameRate property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the frameRate constraint.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/frameRate">MediaTrackSupportedConstraints.frameRate - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints frameRate(final boolean frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's groupId property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the groupId constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/groupId">MediaTrackSupportedConstraints.groupId - MDN</a>
   */
  @JsProperty(
      name = "groupId"
  )
  boolean groupId();

  /**
   * The MediaTrackSupportedConstraints dictionary's groupId property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the groupId constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/groupId">MediaTrackSupportedConstraints.groupId - MDN</a>
   */
  @JsProperty
  void setGroupId(boolean groupId);

  /**
   * The MediaTrackSupportedConstraints dictionary's groupId property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the groupId constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/groupId">MediaTrackSupportedConstraints.groupId - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints groupId(final boolean groupId) {
    setGroupId( groupId );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's height property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the height constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/height">MediaTrackSupportedConstraints.height - MDN</a>
   */
  @JsProperty(
      name = "height"
  )
  boolean height();

  /**
   * The MediaTrackSupportedConstraints dictionary's height property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the height constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/height">MediaTrackSupportedConstraints.height - MDN</a>
   */
  @JsProperty
  void setHeight(boolean height);

  /**
   * The MediaTrackSupportedConstraints dictionary's height property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the height constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/height">MediaTrackSupportedConstraints.height - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints height(final boolean height) {
    setHeight( height );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's latency property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the latency constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/latency">MediaTrackSupportedConstraints.latency - MDN</a>
   */
  @JsProperty(
      name = "latency"
  )
  boolean latency();

  /**
   * The MediaTrackSupportedConstraints dictionary's latency property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the latency constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/latency">MediaTrackSupportedConstraints.latency - MDN</a>
   */
  @JsProperty
  void setLatency(boolean latency);

  /**
   * The MediaTrackSupportedConstraints dictionary's latency property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the latency constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/latency">MediaTrackSupportedConstraints.latency - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints latency(final boolean latency) {
    setLatency( latency );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's noiseSuppression property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the noiseSuppression constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/noiseSuppression">MediaTrackSupportedConstraints.noiseSuppression - MDN</a>
   */
  @JsProperty(
      name = "noiseSuppression"
  )
  boolean noiseSuppression();

  /**
   * The MediaTrackSupportedConstraints dictionary's noiseSuppression property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the noiseSuppression constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/noiseSuppression">MediaTrackSupportedConstraints.noiseSuppression - MDN</a>
   */
  @JsProperty
  void setNoiseSuppression(boolean noiseSuppression);

  /**
   * The MediaTrackSupportedConstraints dictionary's noiseSuppression property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the noiseSuppression constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/noiseSuppression">MediaTrackSupportedConstraints.noiseSuppression - MDN</a>
   */
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

  /**
   * The MediaTrackSupportedConstraints dictionary's sampleRate property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the sampleRate constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/sampleRate">MediaTrackSupportedConstraints.sampleRate - MDN</a>
   */
  @JsProperty(
      name = "sampleRate"
  )
  boolean sampleRate();

  /**
   * The MediaTrackSupportedConstraints dictionary's sampleRate property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the sampleRate constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/sampleRate">MediaTrackSupportedConstraints.sampleRate - MDN</a>
   */
  @JsProperty
  void setSampleRate(boolean sampleRate);

  /**
   * The MediaTrackSupportedConstraints dictionary's sampleRate property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the sampleRate constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/sampleRate">MediaTrackSupportedConstraints.sampleRate - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints sampleRate(final boolean sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's sampleSize property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the sampleSize constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/sampleSize">MediaTrackSupportedConstraints.sampleSize - MDN</a>
   */
  @JsProperty(
      name = "sampleSize"
  )
  boolean sampleSize();

  /**
   * The MediaTrackSupportedConstraints dictionary's sampleSize property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the sampleSize constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/sampleSize">MediaTrackSupportedConstraints.sampleSize - MDN</a>
   */
  @JsProperty
  void setSampleSize(boolean sampleSize);

  /**
   * The MediaTrackSupportedConstraints dictionary's sampleSize property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the sampleSize constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/sampleSize">MediaTrackSupportedConstraints.sampleSize - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSupportedConstraints sampleSize(final boolean sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  /**
   * The MediaTrackSupportedConstraints dictionary's width property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the width constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/width">MediaTrackSupportedConstraints.width - MDN</a>
   */
  @JsProperty(
      name = "width"
  )
  boolean width();

  /**
   * The MediaTrackSupportedConstraints dictionary's width property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the width constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/width">MediaTrackSupportedConstraints.width - MDN</a>
   */
  @JsProperty
  void setWidth(boolean width);

  /**
   * The MediaTrackSupportedConstraints dictionary's width property is a read-only Boolean value which is present (and set to true) in the object returned by MediaDevices.getSupportedConstraints() if and only if the user agent supports the width constraint. If the constraint isn't supported, it's not included in the list, so this value will never be false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSupportedConstraints/width">MediaTrackSupportedConstraints.width - MDN</a>
   */
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
