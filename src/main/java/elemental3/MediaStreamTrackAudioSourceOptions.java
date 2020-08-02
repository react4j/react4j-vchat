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
public interface MediaStreamTrackAudioSourceOptions {
  @JsOverlay
  @Nonnull
  static MediaStreamTrackAudioSourceOptions create(
      @Nonnull final MediaStreamTrack mediaStreamTrack) {
    return Js.<MediaStreamTrackAudioSourceOptions>uncheckedCast( JsPropertyMap.of() ).mediaStreamTrack( mediaStreamTrack );
  }

  @JsProperty(
      name = "mediaStreamTrack"
  )
  @Nonnull
  MediaStreamTrack mediaStreamTrack();

  @JsProperty
  void setMediaStreamTrack(@Nonnull MediaStreamTrack mediaStreamTrack);

  @JsOverlay
  @Nonnull
  default MediaStreamTrackAudioSourceOptions mediaStreamTrack(
      @Nonnull final MediaStreamTrack mediaStreamTrack) {
    setMediaStreamTrack( mediaStreamTrack );
    return this;
  }
}
