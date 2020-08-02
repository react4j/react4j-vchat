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
public interface RTCVideoHandlerStats extends RTCMediaHandlerStats {
  @JsOverlay
  @Nonnull
  static RTCVideoHandlerStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCVideoHandlerStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty(
      name = "frameHeight"
  )
  int frameHeight();

  @JsProperty
  void setFrameHeight(int frameHeight);

  @JsOverlay
  @Nonnull
  default RTCVideoHandlerStats frameHeight(final int frameHeight) {
    setFrameHeight( frameHeight );
    return this;
  }

  @JsProperty(
      name = "frameWidth"
  )
  int frameWidth();

  @JsProperty
  void setFrameWidth(int frameWidth);

  @JsOverlay
  @Nonnull
  default RTCVideoHandlerStats frameWidth(final int frameWidth) {
    setFrameWidth( frameWidth );
    return this;
  }

  @JsProperty(
      name = "framesPerSecond"
  )
  double framesPerSecond();

  @JsProperty
  void setFramesPerSecond(double framesPerSecond);

  @JsOverlay
  @Nonnull
  default RTCVideoHandlerStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoHandlerStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoHandlerStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoHandlerStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoHandlerStats priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoHandlerStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoHandlerStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoHandlerStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoHandlerStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
