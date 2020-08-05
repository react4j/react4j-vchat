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
 * The DisplayMediaStreamConstraints dictionary is used to specify whether or not to include video and/or audio tracks in the MediaStream to be returned by getDisplayMedia(), as well as what type of processing must be applied to the tracks.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints">DisplayMediaStreamConstraints - MDN</a>
 */
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

  @JsProperty(
      name = "audio"
  )
  BooleanOrMediaTrackConstraintsUnion audio();

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

  @JsProperty(
      name = "video"
  )
  BooleanOrMediaTrackConstraintsUnion video();

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
