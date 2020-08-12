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

/**
 * The MediaKeySystemConfiguration dictionary holds configuration information about the media key system in use.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration">MediaKeySystemConfiguration - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface MediaKeySystemConfiguration {
  @JsOverlay
  @Nonnull
  static MediaKeySystemConfiguration create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The MediaKeySystemConfiguration.audioCapabilities read-only property returns an array of supported audio type and capability pairs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/audioCapabilities">MediaKeySystemConfiguration.audioCapabilities - MDN</a>
   */
  @JsProperty(
      name = "audioCapabilities"
  )
  JsArray<MediaKeySystemMediaCapability> audioCapabilities();

  /**
   * The MediaKeySystemConfiguration.audioCapabilities read-only property returns an array of supported audio type and capability pairs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/audioCapabilities">MediaKeySystemConfiguration.audioCapabilities - MDN</a>
   */
  @JsProperty
  void setAudioCapabilities(@Nonnull JsArray<MediaKeySystemMediaCapability> audioCapabilities);

  /**
   * The MediaKeySystemConfiguration.audioCapabilities read-only property returns an array of supported audio type and capability pairs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/audioCapabilities">MediaKeySystemConfiguration.audioCapabilities - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration audioCapabilities(
      @Nonnull final JsArray<MediaKeySystemMediaCapability> audioCapabilities) {
    setAudioCapabilities( audioCapabilities );
    return this;
  }

  /**
   * The MediaKeySystemConfiguration.audioCapabilities read-only property returns an array of supported audio type and capability pairs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/audioCapabilities">MediaKeySystemConfiguration.audioCapabilities - MDN</a>
   */
  @JsOverlay
  default void setAudioCapabilities(
      @Nonnull final MediaKeySystemMediaCapability... audioCapabilities) {
    setAudioCapabilities( JsArray.asJsArray( audioCapabilities ) );
  }

  /**
   * The MediaKeySystemConfiguration.audioCapabilities read-only property returns an array of supported audio type and capability pairs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/audioCapabilities">MediaKeySystemConfiguration.audioCapabilities - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration audioCapabilities(
      @Nonnull final MediaKeySystemMediaCapability... audioCapabilities) {
    setAudioCapabilities( audioCapabilities );
    return this;
  }

  /**
   * The MediaKeySystemConfiguration.distinctiveIdentifier read-only property indicates whether a persistent distinctive identifier is required.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/distinctiveIdentifier">MediaKeySystemConfiguration.distinctiveIdentifier - MDN</a>
   */
  @JsProperty(
      name = "distinctiveIdentifier"
  )
  String distinctiveIdentifier();

  /**
   * The MediaKeySystemConfiguration.distinctiveIdentifier read-only property indicates whether a persistent distinctive identifier is required.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/distinctiveIdentifier">MediaKeySystemConfiguration.distinctiveIdentifier - MDN</a>
   */
  @JsProperty
  void setDistinctiveIdentifier(@Nonnull String distinctiveIdentifier);

  /**
   * The MediaKeySystemConfiguration.distinctiveIdentifier read-only property indicates whether a persistent distinctive identifier is required.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/distinctiveIdentifier">MediaKeySystemConfiguration.distinctiveIdentifier - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration distinctiveIdentifier(
      @Nonnull final String distinctiveIdentifier) {
    setDistinctiveIdentifier( distinctiveIdentifier );
    return this;
  }

  /**
   * The MediaKeySystemConfiguration.initDataTypes read-only property returns a list of supported initialization data type names. An initialization data type is a string indicating the format of the initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/initDataTypes">MediaKeySystemConfiguration.initDataTypes - MDN</a>
   */
  @JsProperty(
      name = "initDataTypes"
  )
  JsArray<String> initDataTypes();

  /**
   * The MediaKeySystemConfiguration.initDataTypes read-only property returns a list of supported initialization data type names. An initialization data type is a string indicating the format of the initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/initDataTypes">MediaKeySystemConfiguration.initDataTypes - MDN</a>
   */
  @JsProperty
  void setInitDataTypes(@Nonnull JsArray<String> initDataTypes);

  /**
   * The MediaKeySystemConfiguration.initDataTypes read-only property returns a list of supported initialization data type names. An initialization data type is a string indicating the format of the initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/initDataTypes">MediaKeySystemConfiguration.initDataTypes - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration initDataTypes(@Nonnull final JsArray<String> initDataTypes) {
    setInitDataTypes( initDataTypes );
    return this;
  }

  /**
   * The MediaKeySystemConfiguration.initDataTypes read-only property returns a list of supported initialization data type names. An initialization data type is a string indicating the format of the initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/initDataTypes">MediaKeySystemConfiguration.initDataTypes - MDN</a>
   */
  @JsOverlay
  default void setInitDataTypes(@Nonnull final String... initDataTypes) {
    setInitDataTypes( JsArray.asJsArray( initDataTypes ) );
  }

  /**
   * The MediaKeySystemConfiguration.initDataTypes read-only property returns a list of supported initialization data type names. An initialization data type is a string indicating the format of the initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/initDataTypes">MediaKeySystemConfiguration.initDataTypes - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration initDataTypes(@Nonnull final String... initDataTypes) {
    setInitDataTypes( initDataTypes );
    return this;
  }

  @JsProperty(
      name = "label"
  )
  String label();

  @JsProperty
  void setLabel(@Nonnull String label);

  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration label(@Nonnull final String label) {
    setLabel( label );
    return this;
  }

  /**
   * The MediaKeySystemConfiguration.persistentState read-only property indicates whether the ability to persist state is required.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/persistentState">MediaKeySystemConfiguration.persistentState - MDN</a>
   */
  @JsProperty(
      name = "persistentState"
  )
  String persistentState();

  /**
   * The MediaKeySystemConfiguration.persistentState read-only property indicates whether the ability to persist state is required.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/persistentState">MediaKeySystemConfiguration.persistentState - MDN</a>
   */
  @JsProperty
  void setPersistentState(@Nonnull String persistentState);

  /**
   * The MediaKeySystemConfiguration.persistentState read-only property indicates whether the ability to persist state is required.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/persistentState">MediaKeySystemConfiguration.persistentState - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration persistentState(@Nonnull final String persistentState) {
    setPersistentState( persistentState );
    return this;
  }

  @JsProperty(
      name = "sessionTypes"
  )
  JsArray<String> sessionTypes();

  @JsProperty
  void setSessionTypes(@Nonnull JsArray<String> sessionTypes);

  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration sessionTypes(@Nonnull final JsArray<String> sessionTypes) {
    setSessionTypes( sessionTypes );
    return this;
  }

  @JsOverlay
  default void setSessionTypes(@Nonnull final String... sessionTypes) {
    setSessionTypes( JsArray.asJsArray( sessionTypes ) );
  }

  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration sessionTypes(@Nonnull final String... sessionTypes) {
    setSessionTypes( sessionTypes );
    return this;
  }

  /**
   * The MediaKeySystemConfiguration.videoCapabilities read-only property returns an array of supported video type and capability pairs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/videoCapabilities">MediaKeySystemConfiguration.videoCapabilities - MDN</a>
   */
  @JsProperty(
      name = "videoCapabilities"
  )
  JsArray<MediaKeySystemMediaCapability> videoCapabilities();

  /**
   * The MediaKeySystemConfiguration.videoCapabilities read-only property returns an array of supported video type and capability pairs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/videoCapabilities">MediaKeySystemConfiguration.videoCapabilities - MDN</a>
   */
  @JsProperty
  void setVideoCapabilities(@Nonnull JsArray<MediaKeySystemMediaCapability> videoCapabilities);

  /**
   * The MediaKeySystemConfiguration.videoCapabilities read-only property returns an array of supported video type and capability pairs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/videoCapabilities">MediaKeySystemConfiguration.videoCapabilities - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration videoCapabilities(
      @Nonnull final JsArray<MediaKeySystemMediaCapability> videoCapabilities) {
    setVideoCapabilities( videoCapabilities );
    return this;
  }

  /**
   * The MediaKeySystemConfiguration.videoCapabilities read-only property returns an array of supported video type and capability pairs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/videoCapabilities">MediaKeySystemConfiguration.videoCapabilities - MDN</a>
   */
  @JsOverlay
  default void setVideoCapabilities(
      @Nonnull final MediaKeySystemMediaCapability... videoCapabilities) {
    setVideoCapabilities( JsArray.asJsArray( videoCapabilities ) );
  }

  /**
   * The MediaKeySystemConfiguration.videoCapabilities read-only property returns an array of supported video type and capability pairs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemConfiguration/videoCapabilities">MediaKeySystemConfiguration.videoCapabilities - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration videoCapabilities(
      @Nonnull final MediaKeySystemMediaCapability... videoCapabilities) {
    setVideoCapabilities( videoCapabilities );
    return this;
  }
}
