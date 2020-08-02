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
public interface MediaKeySystemConfiguration {
  @JsOverlay
  @Nonnull
  static MediaKeySystemConfiguration create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "audioCapabilities"
  )
  JsArray<MediaKeySystemMediaCapability> audioCapabilities();

  @JsProperty
  void setAudioCapabilities(@Nonnull JsArray<MediaKeySystemMediaCapability> audioCapabilities);

  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration audioCapabilities(
      @Nonnull final JsArray<MediaKeySystemMediaCapability> audioCapabilities) {
    setAudioCapabilities( audioCapabilities );
    return this;
  }

  @JsOverlay
  default void setAudioCapabilities(
      @Nonnull final MediaKeySystemMediaCapability... audioCapabilities) {
    setAudioCapabilities( JsArray.asJsArray( audioCapabilities ) );
  }

  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration audioCapabilities(
      @Nonnull final MediaKeySystemMediaCapability... audioCapabilities) {
    setAudioCapabilities( audioCapabilities );
    return this;
  }

  @JsProperty(
      name = "distinctiveIdentifier"
  )
  String distinctiveIdentifier();

  @JsProperty
  void setDistinctiveIdentifier(@Nonnull String distinctiveIdentifier);

  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration distinctiveIdentifier(
      @Nonnull final String distinctiveIdentifier) {
    setDistinctiveIdentifier( distinctiveIdentifier );
    return this;
  }

  @JsProperty(
      name = "initDataTypes"
  )
  JsArray<String> initDataTypes();

  @JsProperty
  void setInitDataTypes(@Nonnull JsArray<String> initDataTypes);

  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration initDataTypes(@Nonnull final JsArray<String> initDataTypes) {
    setInitDataTypes( initDataTypes );
    return this;
  }

  @JsOverlay
  default void setInitDataTypes(@Nonnull final String... initDataTypes) {
    setInitDataTypes( JsArray.asJsArray( initDataTypes ) );
  }

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

  @JsProperty(
      name = "persistentState"
  )
  String persistentState();

  @JsProperty
  void setPersistentState(@Nonnull String persistentState);

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

  @JsProperty(
      name = "videoCapabilities"
  )
  JsArray<MediaKeySystemMediaCapability> videoCapabilities();

  @JsProperty
  void setVideoCapabilities(@Nonnull JsArray<MediaKeySystemMediaCapability> videoCapabilities);

  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration videoCapabilities(
      @Nonnull final JsArray<MediaKeySystemMediaCapability> videoCapabilities) {
    setVideoCapabilities( videoCapabilities );
    return this;
  }

  @JsOverlay
  default void setVideoCapabilities(
      @Nonnull final MediaKeySystemMediaCapability... videoCapabilities) {
    setVideoCapabilities( JsArray.asJsArray( videoCapabilities ) );
  }

  @JsOverlay
  @Nonnull
  default MediaKeySystemConfiguration videoCapabilities(
      @Nonnull final MediaKeySystemMediaCapability... videoCapabilities) {
    setVideoCapabilities( videoCapabilities );
    return this;
  }
}
