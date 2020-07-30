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
public interface RTCSenderVideoTrackAttachmentStats extends RTCVideoSenderStats {
  @JsOverlay
  @Nonnull
  static RTCSenderVideoTrackAttachmentStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCSenderVideoTrackAttachmentStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats mediaSourceId(@Nonnull final String mediaSourceId) {
    setMediaSourceId( mediaSourceId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats framesCaptured(final int framesCaptured) {
    setFramesCaptured( framesCaptured );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats framesSent(final int framesSent) {
    setFramesSent( framesSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats hugeFramesSent(final int hugeFramesSent) {
    setHugeFramesSent( hugeFramesSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats keyFramesSent(final int keyFramesSent) {
    setKeyFramesSent( keyFramesSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats frameHeight(final int frameHeight) {
    setFrameHeight( frameHeight );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats frameWidth(final int frameWidth) {
    setFrameWidth( frameWidth );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats trackIdentifier(
      @Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderVideoTrackAttachmentStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
