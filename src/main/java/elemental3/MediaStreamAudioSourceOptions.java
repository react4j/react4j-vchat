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
public interface MediaStreamAudioSourceOptions {
  @JsOverlay
  @Nonnull
  static MediaStreamAudioSourceOptions create(@Nonnull final MediaStream mediaStream) {
    return Js.<MediaStreamAudioSourceOptions>uncheckedCast( JsPropertyMap.of() ).mediaStream( mediaStream );
  }

  @JsProperty(
      name = "mediaStream"
  )
  @Nonnull
  MediaStream mediaStream();

  @JsProperty
  void setMediaStream(@Nonnull MediaStream mediaStream);

  @JsOverlay
  @Nonnull
  default MediaStreamAudioSourceOptions mediaStream(@Nonnull final MediaStream mediaStream) {
    setMediaStream( mediaStream );
    return this;
  }
}
