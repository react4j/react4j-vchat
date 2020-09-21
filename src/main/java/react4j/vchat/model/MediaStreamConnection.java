package react4j.vchat.model;

import arez.ComputableValue;
import arez.Disposable;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.ComputableValueRef;
import arez.annotations.DepType;
import arez.annotations.Feature;
import arez.annotations.Memoize;
import arez.annotations.Observable;
import arez.annotations.Observe;
import elemental2.promise.Promise;
import elemental3.DOMException;
import elemental3.HTMLVideoElement;
import elemental3.MediaProvider;
import elemental3.media.MediaStream;
import elemental3.media.MediaStreamTrackState;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ArezComponent
public abstract class MediaStreamConnection
{
  @Nonnull
  private final Supplier<Promise<MediaStream>> _connect;
  @Nonnull
  private final Consumer<MediaStream> _onStreamConnected;
  private int _requestId;

  @SuppressWarnings( "SameParameterValue" )
  @Nonnull
  static MediaStreamConnection create( @Nonnull final Supplier<Promise<MediaStream>> connect,
                                       @Nonnull final Consumer<MediaStream> onStreamConnected,
                                       final boolean enabled,
                                       final boolean videoEnabled )
  {
    return new Arez_MediaStreamConnection( connect, onStreamConnected, enabled, videoEnabled );
  }

  MediaStreamConnection( @Nonnull final Supplier<Promise<MediaStream>> connect,
                         @Nonnull final Consumer<MediaStream> onStreamConnected )
  {
    _connect = Objects.requireNonNull( connect );
    _onStreamConnected = Objects.requireNonNull( onStreamConnected );
  }

  @Observable
  abstract boolean isConnecting();

  abstract void setConnecting( boolean connecting );

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
  public abstract boolean isEnabled();

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
  public void toggleEnabled()
  {
    setEnabled( !isEnabled() );
  }

  @Memoize( depType = DepType.AREZ_OR_EXTERNAL )
  public boolean isAudioEnabled()
  {
    final MediaStream stream = getStream();
    return null != stream && stream.getAudioTracks().some( ( track, index, tracks ) -> track.enabled );
  }

  @ComputableValueRef
  abstract ComputableValue<?> getAudioEnabledComputableValue();

  public boolean hasTracks()
  {
    final MediaStream stream = getStream();
    return null != stream && stream.getTracks().length > 0;
  }

  public boolean hasVideo()
  {
    final MediaStream stream = getStream();
    return null != stream && stream.getAudioTracks().length > 0;
  }

  public boolean hasAudio()
  {
    final MediaStream stream = getStream();
    return null != stream && stream.getAudioTracks().length > 0;
  }

  @Action
  public void toggleAudio()
  {
    final MediaStream stream = getStream();
    if ( null != stream )
    {
      stream.getAudioTracks().forEach( ( track, index, array ) -> track.enabled = !track.enabled );
    }
    getAudioEnabledComputableValue().reportPossiblyChanged();
  }

  @Observable( initializer = Feature.ENABLE )
  public abstract boolean isVideoEnabled();

  abstract void setVideoEnabled( boolean videoEnabled );

  @Action
  public void toggleVideo()
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
    // keep an id for request so that we don't set state on completion if
    // we have issued another request in the meantime
    _requestId++;
    final int requestId = _requestId;
    clearState();
    setConnecting( true );
    _connect
      .get()
      .then( stream -> {
        if ( _requestId == requestId )
        {
          streamConnected( stream );
        }
        else
        {
          stopTracks( stream );
        }
        return null;
      } )
      .catch_( error -> {
        if ( _requestId == requestId )
        {
          streamError( error );
        }
        return null;
      } );
  }

  @Action
  void streamConnected( @Nonnull final MediaStream stream )
  {
    setConnecting( false );
    setStream( stream );
    stream.getTracks().forEach( ( track, index, tracks ) -> {
      track.onended = e -> onTrackEnded();
      // TODO: Should not have to return null here
      return null;
    } );
    _onStreamConnected.accept( stream );
  }

  private void onTrackEnded()
  {
    if ( Disposable.isNotDisposed( this ) )
    {
      streamDisconnected();
    }
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
          track.onended = null;
          track.stop();
        }
        return null;
      } );
    }
  }

  @Action
  void streamError( @Nonnull final Object error )
  {
    setConnecting( false );
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

  public abstract void setVideoElement( @Nullable HTMLVideoElement videoElement );

  @Observe
  void maintainVideo()
  {
    final MediaStream stream = getStream();
    final HTMLVideoElement videoElement = getVideoElement();
    if ( null != stream && null != videoElement )
    {
      final MediaProvider provider = MediaProvider.of( stream );
      if ( provider != videoElement.srcObject )
      {
        // We make sure we do not assign srcObject to the same object again
        // as otherwise the video stream will flicker
        videoElement.srcObject = provider;
      }
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
