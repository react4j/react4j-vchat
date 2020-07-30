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
public interface RTCVideoSenderStats extends RTCVideoHandlerStats {
  @JsOverlay
  @Nonnull
  static RTCVideoSenderStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCVideoSenderStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty
  String getMediaSourceId();

  @JsProperty
  void setMediaSourceId(@Nonnull String mediaSourceId);

  @JsOverlay
  @Nonnull
  default RTCVideoSenderStats mediaSourceId(@Nonnull final String mediaSourceId) {
    setMediaSourceId( mediaSourceId );
    return this;
  }

  @JsProperty
  int getFramesCaptured();

  @JsProperty
  void setFramesCaptured(int framesCaptured);

  @JsOverlay
  @Nonnull
  default RTCVideoSenderStats framesCaptured(final int framesCaptured) {
    setFramesCaptured( framesCaptured );
    return this;
  }

  @JsProperty
  int getFramesSent();

  @JsProperty
  void setFramesSent(int framesSent);

  @JsOverlay
  @Nonnull
  default RTCVideoSenderStats framesSent(final int framesSent) {
    setFramesSent( framesSent );
    return this;
  }

  @JsProperty
  int getHugeFramesSent();

  @JsProperty
  void setHugeFramesSent(int hugeFramesSent);

  @JsOverlay
  @Nonnull
  default RTCVideoSenderStats hugeFramesSent(final int hugeFramesSent) {
    setHugeFramesSent( hugeFramesSent );
    return this;
  }

  @JsProperty
  int getKeyFramesSent();

  @JsProperty
  void setKeyFramesSent(int keyFramesSent);

  @JsOverlay
  @Nonnull
  default RTCVideoSenderStats keyFramesSent(final int keyFramesSent) {
    setKeyFramesSent( keyFramesSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats frameHeight(final int frameHeight) {
    setFrameHeight( frameHeight );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats frameWidth(final int frameWidth) {
    setFrameWidth( frameWidth );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
