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
public interface RTCVideoSourceStats extends RTCMediaSourceStats {
  @JsOverlay
  @Nonnull
  static RTCVideoSourceStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind,
      @Nonnull final String trackIdentifier) {
    return Js.<RTCVideoSourceStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).trackIdentifier( trackIdentifier );
  }

  @JsProperty
  int getBitDepth();

  @JsProperty
  void setBitDepth(int bitDepth);

  @JsOverlay
  @Nonnull
  default RTCVideoSourceStats bitDepth(final int bitDepth) {
    setBitDepth( bitDepth );
    return this;
  }

  @JsProperty
  int getFrames();

  @JsProperty
  void setFrames(int frames);

  @JsOverlay
  @Nonnull
  default RTCVideoSourceStats frames(final int frames) {
    setFrames( frames );
    return this;
  }

  @JsProperty
  double getFramesPerSecond();

  @JsProperty
  void setFramesPerSecond(double framesPerSecond);

  @JsOverlay
  @Nonnull
  default RTCVideoSourceStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsProperty
  int getHeight();

  @JsProperty
  void setHeight(int height);

  @JsOverlay
  @Nonnull
  default RTCVideoSourceStats height(final int height) {
    setHeight( height );
    return this;
  }

  @JsProperty
  int getWidth();

  @JsProperty
  void setWidth(int width);

  @JsOverlay
  @Nonnull
  default RTCVideoSourceStats width(final int width) {
    setWidth( width );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSourceStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSourceStats relayedSource(final boolean relayedSource) {
    setRelayedSource( relayedSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSourceStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSourceStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSourceStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSourceStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
