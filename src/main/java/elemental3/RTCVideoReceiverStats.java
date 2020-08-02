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
public interface RTCVideoReceiverStats extends RTCVideoHandlerStats {
  @JsOverlay
  @Nonnull
  static RTCVideoReceiverStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCVideoReceiverStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty(
      name = "estimatedPlayoutTimestamp"
  )
  double estimatedPlayoutTimestamp();

  @JsProperty
  void setEstimatedPlayoutTimestamp(double estimatedPlayoutTimestamp);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats estimatedPlayoutTimestamp(final double estimatedPlayoutTimestamp) {
    setEstimatedPlayoutTimestamp( estimatedPlayoutTimestamp );
    return this;
  }

  @JsProperty(
      name = "framesDecoded"
  )
  int framesDecoded();

  @JsProperty
  void setFramesDecoded(int framesDecoded);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats framesDecoded(final int framesDecoded) {
    setFramesDecoded( framesDecoded );
    return this;
  }

  @JsProperty(
      name = "framesDropped"
  )
  int framesDropped();

  @JsProperty
  void setFramesDropped(int framesDropped);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats framesDropped(final int framesDropped) {
    setFramesDropped( framesDropped );
    return this;
  }

  @JsProperty(
      name = "framesReceived"
  )
  int framesReceived();

  @JsProperty
  void setFramesReceived(int framesReceived);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats framesReceived(final int framesReceived) {
    setFramesReceived( framesReceived );
    return this;
  }

  @JsProperty(
      name = "fullFramesLost"
  )
  int fullFramesLost();

  @JsProperty
  void setFullFramesLost(int fullFramesLost);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats fullFramesLost(final int fullFramesLost) {
    setFullFramesLost( fullFramesLost );
    return this;
  }

  @JsProperty(
      name = "jitterBufferDelay"
  )
  double jitterBufferDelay();

  @JsProperty
  void setJitterBufferDelay(double jitterBufferDelay);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats jitterBufferDelay(final double jitterBufferDelay) {
    setJitterBufferDelay( jitterBufferDelay );
    return this;
  }

  @JsProperty(
      name = "jitterBufferEmittedCount"
  )
  int jitterBufferEmittedCount();

  @JsProperty
  void setJitterBufferEmittedCount(int jitterBufferEmittedCount);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats jitterBufferEmittedCount(final int jitterBufferEmittedCount) {
    setJitterBufferEmittedCount( jitterBufferEmittedCount );
    return this;
  }

  @JsProperty(
      name = "keyFramesReceived"
  )
  int keyFramesReceived();

  @JsProperty
  void setKeyFramesReceived(int keyFramesReceived);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats keyFramesReceived(final int keyFramesReceived) {
    setKeyFramesReceived( keyFramesReceived );
    return this;
  }

  @JsProperty(
      name = "partialFramesLost"
  )
  int partialFramesLost();

  @JsProperty
  void setPartialFramesLost(int partialFramesLost);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats partialFramesLost(final int partialFramesLost) {
    setPartialFramesLost( partialFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats frameHeight(final int frameHeight) {
    setFrameHeight( frameHeight );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats frameWidth(final int frameWidth) {
    setFrameWidth( frameWidth );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
