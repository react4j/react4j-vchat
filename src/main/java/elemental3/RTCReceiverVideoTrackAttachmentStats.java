package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCReceiverVideoTrackAttachmentStats extends RTCVideoReceiverStats {
  @JsOverlay
  @Nonnull
  static RTCReceiverVideoTrackAttachmentStats create(@Nonnull final String id,
      final double timestamp, @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCReceiverVideoTrackAttachmentStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats estimatedPlayoutTimestamp(
      final double estimatedPlayoutTimestamp) {
    setEstimatedPlayoutTimestamp( estimatedPlayoutTimestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats framesDecoded(final int framesDecoded) {
    setFramesDecoded( framesDecoded );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats framesDropped(final int framesDropped) {
    setFramesDropped( framesDropped );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats framesReceived(final int framesReceived) {
    setFramesReceived( framesReceived );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats fullFramesLost(final int fullFramesLost) {
    setFullFramesLost( fullFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats jitterBufferDelay(final double jitterBufferDelay) {
    setJitterBufferDelay( jitterBufferDelay );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats jitterBufferEmittedCount(
      final int jitterBufferEmittedCount) {
    setJitterBufferEmittedCount( jitterBufferEmittedCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats keyFramesReceived(final int keyFramesReceived) {
    setKeyFramesReceived( keyFramesReceived );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats partialFramesLost(final int partialFramesLost) {
    setPartialFramesLost( partialFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats frameHeight(final int frameHeight) {
    setFrameHeight( frameHeight );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats frameWidth(final int frameWidth) {
    setFrameWidth( frameWidth );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats trackIdentifier(
      @Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceiverVideoTrackAttachmentStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
