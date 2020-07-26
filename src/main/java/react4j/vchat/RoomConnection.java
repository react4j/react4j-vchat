package react4j.vchat;

import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.ComponentDependency;
import arez.annotations.Feature;
import arez.annotations.Observable;
import arez.annotations.Observe;
import elemental2.dom.DomGlobal;
import elemental3.ConstrainULongRange;
import elemental3.DOMException;
import elemental3.HTMLVideoElement;
import elemental3.MediaProvider;
import elemental3.MediaStream;
import elemental3.MediaStreamConstraints;
import elemental3.MediaTrackConstraints;
import elemental3.Navigator;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Js;

@ArezComponent
abstract class RoomConnection
{
  @ComponentDependency
  final BrowserLocation _browserLocation;

  @Nonnull
  static RoomConnection create( @Nonnull final BrowserLocation browserLocation )
  {
    return new Arez_RoomConnection( browserLocation, true, true, false );
  }

  RoomConnection( @Nonnull final BrowserLocation browserLocation )
  {
    _browserLocation = Objects.requireNonNull( browserLocation );
  }

  @Nullable
  String getRoomId()
  {
    final String location = _browserLocation.getLocation();
    return location.isEmpty() ? null : location;
  }

  @Observable( initializer = Feature.ENABLE )
  abstract boolean isAudioEnabled();

  abstract void setAudioEnabled( boolean audioEnabled );

  @Action
  void toggleAudio()
  {
    setAudioEnabled( !isAudioEnabled() );
    final MediaStream localStream = getLocalStream();
    if ( null != localStream )
    {
      localStream.getAudioTracks().forEach( ( track, index, array ) -> track.enabled = !track.enabled );
    }
  }

  @Observable( initializer = Feature.ENABLE )
  abstract boolean isVideoEnabled();

  abstract void setVideoEnabled( boolean videoEnabled );

  @Action
  void toggleVideo()
  {
    setVideoEnabled( !isVideoEnabled() );
    final MediaStream localStream = getLocalStream();
    if ( null != localStream )
    {
      localStream.getVideoTracks().forEach( ( track, index, array ) -> track.enabled = !track.enabled );
    }
  }

  boolean isConnecting()
  {
    return false;
  }

  boolean isWaiting()
  {
    return true;
  }

  @Observable
  @Nullable
  abstract MediaStream getLocalStream();

  abstract void setLocalStream( @Nullable MediaStream localStream );

  @Observable
  @Nullable
  abstract String getLocalStreamErrorMessage();

  abstract void setLocalStreamErrorMessage( @Nullable String message );

  @Observable( writeOutsideTransaction = Feature.ENABLE )
  @Nullable
  abstract HTMLVideoElement getLocalVideoElement();

  abstract void setLocalVideoElement( @Nullable HTMLVideoElement videoElement );

  void connectLocalMedia()
  {
    getNavigator()
      .mediaDevices()
      .getUserMedia( MediaStreamConstraints
                       .create()
                       .audio( true )
                       .video( MediaTrackConstraints
                                 .create()
                                 .width( ConstrainULongRange.create().min( 160 ).ideal( 640 ).max( 1280 ) )
                                 .height( ConstrainULongRange.create().min( 120 ).ideal( 360 ).max( 720 ) ) ) )
      .then( stream -> {
        onLocalStream( stream );
        return null;
      } )
      .catch_( error -> {
        if ( error instanceof DOMException )
        {
          onLocalStreamError( (DOMException) error );
        }
        return null;
      } );
  }

  @Observe
  void maintainLocalVideo()
  {
    final MediaStream stream = getLocalStream();
    final HTMLVideoElement videoElement = getLocalVideoElement();
    if ( null != stream && null != videoElement )
    {
      videoElement.srcObject = MediaProvider.of( stream );
    }
  }

  @Action
  void onLocalStream( @Nonnull final MediaStream stream )
  {
    setLocalStream( stream );
    setLocalStreamErrorMessage( null );
  }

  @Action
  void onLocalStreamError( @Nonnull final DOMException exception )
  {
    setLocalStream( null );
    switch ( exception.name() )
    {
      case "NotAllowedError":
        setLocalStreamErrorMessage( "The user did not all allow access to the audio or video stream" );
        break;
      case "NotFoundError":
        setLocalStreamErrorMessage( "The computing device does not support devices to capture " +
                                    "audio and/or video streams" );
        break;
      case "NotReadableError":
        setLocalStreamErrorMessage( "A hardware error occurred trying to retrieve data from " +
                                    "the audio and/or video devices" );
        break;
      case "SecurityError":
        setLocalStreamErrorMessage( "The security policy has blocked access to the audio or video stream" );
        break;
      case "AbortError":
        setLocalStreamErrorMessage( "Unexpected error occurred accessing the audio or video stream: " +
                                    exception.message() );
        break;
      default:
        setLocalStreamErrorMessage( "Unexpected error occurred accessing the audio or video stream" );
        break;
    }
  }

  @Observable
  @Nullable
  abstract MediaStream getScreenShareStream();

  abstract void setScreenShareStream( @Nullable MediaStream localStream );

  @Observable
  @Nullable
  abstract String getScreenShareStreamErrorMessage();

  abstract void setScreenShareStreamErrorMessage( @Nullable String message );

  @Observable( initializer = Feature.ENABLE )
  abstract boolean isScreenShareEnabled();

  abstract void setScreenShareEnabled( boolean screenShareEnabled );

  @Action
  void toggleScreenShare()
  {
    final boolean enabled = !isScreenShareEnabled();
    setScreenShareEnabled( enabled );
    final MediaStream stream = getScreenShareStream();
    if ( enabled )
    {
      if ( null == stream )
      {
        requestConnectScreenShare();
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

  void requestConnectScreenShare()
  {
    getNavigator()
      .mediaDevices()
      .getDisplayMedia()
      .then( stream -> {
        screenShareStreamConnected( stream );
        stream.getVideoTracks().forEach( ( track, index, tracks ) -> {
          track.onended = e -> {
            screenShareDisconnected();
            return null;
          };
          return null;
        } );
        return null;
      } )
      .catch_( error -> {
        screenShareStreamError( error );
        return null;
      } );
  }

  @Action
  void screenShareStreamConnected( @Nonnull final MediaStream stream )
  {
    setScreenShareStream( stream );
    setScreenShareStreamErrorMessage( null );
  }

  @Action
  void screenShareDisconnected()
  {
    setScreenShareStream( null );
    setScreenShareStreamErrorMessage( null );
    setScreenShareEnabled( false );
  }

  @Action
  void screenShareStreamError( @Nonnull final Object error )
  {
    setScreenShareStream( null );
    final String errorSuffix;
    if ( error instanceof DOMException )
    {
      final DOMException e = (DOMException) error;
      errorSuffix = e.name() + ": " + e.message();
    }
    else
    {
      errorSuffix = String.valueOf( error );
    }
    setScreenShareStreamErrorMessage( "Error occurred attempting to share screen. Error: " + errorSuffix );
  }

  @Observable( writeOutsideTransaction = Feature.ENABLE )
  @Nullable
  abstract HTMLVideoElement getScreenShareVideoElement();

  abstract void setScreenShareVideoElement( @Nullable HTMLVideoElement videoElement );

  @Observe
  void maintainScreenShareVideo()
  {
    final MediaStream stream = getScreenShareStream();
    final HTMLVideoElement videoElement = getScreenShareVideoElement();
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
