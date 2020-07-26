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
public interface DisplayMediaStreamConstraints {
  @JsOverlay
  @Nonnull
  static DisplayMediaStreamConstraints create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  BooleanOrMediaTrackConstraintsUnion getAudio();

  @JsProperty
  void setAudio(@Nonnull BooleanOrMediaTrackConstraintsUnion audio);

  @JsOverlay
  default void setAudio(final boolean audio) {
    setAudio( BooleanOrMediaTrackConstraintsUnion.of( audio ) );
  }

  @JsOverlay
  @Nonnull
  default DisplayMediaStreamConstraints audio(final boolean audio) {
    setAudio( audio );
    return this;
  }

  @JsOverlay
  default void setAudio(@Nonnull final MediaTrackConstraints audio) {
    setAudio( BooleanOrMediaTrackConstraintsUnion.of( audio ) );
  }

  @JsOverlay
  @Nonnull
  default DisplayMediaStreamConstraints audio(@Nonnull final MediaTrackConstraints audio) {
    setAudio( audio );
    return this;
  }

  @JsProperty
  BooleanOrMediaTrackConstraintsUnion getVideo();

  @JsProperty
  void setVideo(@Nonnull BooleanOrMediaTrackConstraintsUnion video);

  @JsOverlay
  default void setVideo(final boolean video) {
    setVideo( BooleanOrMediaTrackConstraintsUnion.of( video ) );
  }

  @JsOverlay
  @Nonnull
  default DisplayMediaStreamConstraints video(final boolean video) {
    setVideo( video );
    return this;
  }

  @JsOverlay
  default void setVideo(@Nonnull final MediaTrackConstraints video) {
    setVideo( BooleanOrMediaTrackConstraintsUnion.of( video ) );
  }

  @JsOverlay
  @Nonnull
  default DisplayMediaStreamConstraints video(@Nonnull final MediaTrackConstraints video) {
    setVideo( video );
    return this;
  }
}