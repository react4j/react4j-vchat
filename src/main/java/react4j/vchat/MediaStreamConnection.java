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
  static MediaStreamConnection create( @Nonnull final Supplier<Promise<MediaStream>> connect, final boolean enabled )
  {
    return new Arez_MediaStreamConnection( connect, enabled );
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

  abstract void setEnabled( boolean screenShareEnabled );

  @Action
  void toggleEnabled()
  {
    final boolean enabled = !isEnabled();
    setEnabled( enabled );
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
        stream.getTracks().forEach( ( track, index, array ) -> {
          track.stop();
          return null;
        } );
      }
    }
  }

  void requestConnect()
  {
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
    setStream( null );
    setErrorName( null );
    setErrorMessage( null );
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

  @Nonnull
  private Navigator getNavigator()
  {
    final Navigator navigator = Js.cast( DomGlobal.navigator );
    //noinspection ConstantConditions
    assert null != navigator;
    return navigator;
  }
}
