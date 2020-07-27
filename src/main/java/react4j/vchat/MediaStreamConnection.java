package react4j.vchat;

import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.Feature;
import arez.annotations.Observable;
import arez.annotations.Observe;
import elemental2.dom.DomGlobal;
import elemental2.promise.Promise;
import elemental3.DOMException;
import elemental3.HTMLVideoElement;
import elemental3.MediaProvider;
import elemental3.MediaStream;
import elemental3.MediaStreamTrackState;
import elemental3.Navigator;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Js;

@ArezComponent
abstract class MediaStreamConnection
{
  @Nonnull
  private final Supplier<Promise<MediaStream>> _connect;

  @Nonnull
  static MediaStreamConnection create( @Nonnull final Supplier<Promise<MediaStream>> connect,
                                       final boolean enabled,
                                       final boolean audioEnabled,
                                       final boolean videoEnabled )
  {
    return new Arez_MediaStreamConnection( connect, enabled, audioEnabled, videoEnabled );
  }

  MediaStreamConnection( @Nonnull final Supplier<Promise<MediaStream>> connect )
  {
    _connect = Objects.requireNonNull( connect );
  }

  @Observable
  @Nullable
  abstract MediaStream getStream();

  abstract void setStream( @Nullable MediaStream stream );

  @Observable
  @Nullable
  abstract String getErrorName();

  abstract void setErrorName( @Nullable String message );

  @Observable
  @Nullable
  abstract String getErrorMessage();

  abstract void setErrorMessage( @Nullable String message );

  @Observable( initializer = Feature.ENABLE )
  abstract boolean isEnabled();

  @Action
  public void setEnabled( final boolean enabled )
  {
    _setEnabled( enabled );
    final MediaStream stream = getStream();
    if ( enabled )
    {
      if ( null == stream )
      {
        requestConnect();
      }
    }
    else
    {
      if ( null != stream )
      {
        stopTracks( stream );
        setStream( null );
      }
    }
  }

  @Observable( name = "enabled" )
  abstract void _setEnabled( boolean enabled );

  @Action
  void toggleEnabled()
  {
    setEnabled( !isEnabled() );
  }

  @Observable( initializer = Feature.ENABLE )
  abstract boolean isAudioEnabled();

  abstract void setAudioEnabled( boolean audioEnabled );

  @Action
  void toggleAudio()
  {
    setAudioEnabled( !isAudioEnabled() );
    final MediaStream stream = getStream();
    if ( null != stream )
    {
      stream.getAudioTracks().forEach( ( track, index, array ) -> track.enabled = !track.enabled );
    }
  }

  @Observable( initializer = Feature.ENABLE )
  abstract boolean isVideoEnabled();

  abstract void setVideoEnabled( boolean videoEnabled );

  @Action
  void toggleVideo()
  {
    setVideoEnabled( !isVideoEnabled() );
    final MediaStream stream = getStream();
    if ( null != stream )
    {
      stream.getVideoTracks().forEach( ( track, index, array ) -> track.enabled = !track.enabled );
    }
  }

  void requestConnect()
  {
    clearState();
    _connect.get()
      .then( stream -> {
        streamConnected( stream );
        return null;
      } )
      .catch_( error -> {
        streamError( error );
        return null;
      } );
  }

  @Action
  void streamConnected( @Nonnull final MediaStream stream )
  {
    setStream( stream );
    setErrorName( null );
    setErrorMessage( null );
    stream.getTracks().forEach( ( track, index, tracks ) -> {
      track.onended = e -> {
        streamDisconnected();
        // TODO: Should not have to return null here
        return null;
      };
      // TODO: Should not have to return null here
      return null;
    } );
  }

  @Action
  void streamDisconnected()
  {
    final MediaStream stream = getStream();
    clearState();
    setEnabled( false );
    if ( null != stream )
    {
      stream.getTracks().forEach( ( track, index, tracks ) -> {
        if ( MediaStreamTrackState.live.equals( track.readyState() ) )
        {
          track.stop();
        }
        return null;
      } );
    }
  }

  @Action
  void streamError( @Nonnull final Object error )
  {
    setStream( null );
    if ( error instanceof DOMException )
    {
      final DOMException e = (DOMException) error;
      setErrorName( e.name() );
      setErrorMessage( e.message() );
    }
    else
    {
      setErrorName( error.getClass().getName() );
      setErrorMessage( String.valueOf( error ) );
    }
  }

  @Observable( writeOutsideTransaction = Feature.ENABLE )
  @Nullable
  abstract HTMLVideoElement getVideoElement();

  abstract void setVideoElement( @Nullable HTMLVideoElement videoElement );

  @Observe
  void maintainVideo()
  {
    final MediaStream stream = getStream();
    final HTMLVideoElement videoElement = getVideoElement();
    if ( null != stream && null != videoElement )
    {
      videoElement.srcObject = MediaProvider.of( stream );
    }
  }

  private void clearState()
  {
    setStream( null );
    setErrorName( null );
    setErrorMessage( null );
  }

  private void stopTracks( @Nonnull final MediaStream stream )
  {
    stream.getTracks().forEach( ( track, index, array ) -> {
      if ( MediaStreamTrackState.live.equals( track.readyState() ) )
      {
        track.stop();
      }
      return null;
    } );
  }
}
