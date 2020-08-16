package react4j.vchat;

import arez.annotations.CascadeDispose;
import arez.annotations.PostConstruct;
import elemental2.promise.Promise;
import elemental3.ConstrainULongRange;
import elemental3.Global;
import elemental3.HTMLInputElement;
import elemental3.MediaStream;
import elemental3.MediaStreamConstraints;
import elemental3.MediaTrackConstraints;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import react4j.ReactNode;
import react4j.annotations.Input;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.events.FormEvent;
import react4j.dom.proptypes.html.AnchorProps;
import react4j.dom.proptypes.html.BtnProps;
import react4j.dom.proptypes.html.FormProps;
import react4j.dom.proptypes.html.HtmlProps;
import react4j.dom.proptypes.html.InputProps;
import react4j.dom.proptypes.html.LabelProps;
import react4j.dom.proptypes.html.attributeTypes.InputType;
import static react4j.dom.DOM.*;

@View( type = View.Type.TRACKING )
abstract class RoomView
{
  @CascadeDispose
  final MediaStreamConnection _camStream =
    MediaStreamConnection.create( this::requestWebCam, false, true, true );
  @CascadeDispose
  final MediaStreamConnection _screenShareStream =
    MediaStreamConnection.create( this::requestScreenShare, false, true, true );
  @CascadeDispose
  RoomModel _room;

  @PostConstruct
  void postConstruct()
  {
    _room = RoomModel.create( roomCode() );
  }

  @Input( immutable = true )
  @Nonnull
  abstract String roomCode();

  @Render
  @Nullable
  ReactNode render()
  {
    return div( new HtmlProps().className( "message-area" ), renderMessageAreaContent() );
  }

  @Nullable
  private ReactNode renderMessageAreaContent()
  {
    final RoomModel.State state = _room.state();
    if ( RoomModel.State.NOT_ASKED == state || RoomModel.State.CONNECTING == state )
    {
      return fragment( h2( "Getting ready..." ),
                       p( "You'll be able to join in just a moment." ) );
    }
    else if ( RoomModel.State.CONNECT_FAILED == state )
    {
      return fragment( h2( "Service Offline" ),
                       p( "The chat service is offline at the moment. Try again later." ) );
    }
    //h2( "Joining room..." )
    else if ( RoomModel.State.GUEST_CONNECTED == state )
    {
      return fragment( h2( "Ready to join?" ), p( "Request access to join the room." ), renderRequestAccessForm() );
    }
    else if ( RoomModel.State.GUEST_JOIN_REQUESTED == state )
    {
      return fragment( h2( "Joining room" ),
                       p( "Waiting for host to allow access to the room." ) );
    }
    else if ( RoomModel.State.GUEST_REJECTED == state )
    {
      return fragment( h2( "Access denied" ),
                       p( "The host denied access to the room. You can attempt to re-request access to join the room." ),
                       renderRequestAccessForm() );
    }
    else if ( RoomModel.State.ROOM_CLOSED == state )
    {
      return fragment( h2( "Room closed" ),
                       p( "The room was closed." ),
                       a( new AnchorProps().className( "primary-button" ).href( "#" ), "Return to Home" ) );
    }
    else if ( RoomModel.State.HOST_LEFT == state )
    {
      return fragment( h2( "Room closed" ),
                       p( "The closed the room." ),
                       renderRequestAccessForm() );
    }
    else if ( RoomModel.State.GUEST_LEFT == state )
    {
      return fragment( h2( "Left the room" ),
                       p( "You left the room. Request access to re-join the room." ),
                       renderRequestAccessForm() );
    }
    else
    {
      return null;
    }
  }

  @Nonnull
  private ReactNode renderRequestAccessForm()
  {
    return form( new FormProps().onSubmit( e -> _room.requestAccess() ),
                 label( new LabelProps().htmlFor( "requestAccessMessage" ),
                        "Enter a message to send to the host to request access." ),
                 input( new InputProps()
                          .type( InputType.text )
                          .placeHolder( "Hi, I'm John Doe." )
                          .id( "requestAccessMessage" )
                          .autoFocus()
                          .onChange( e -> _room.setRequestAccessMessage( getTargetValue( e ) ) )
                          .value( _room.requestAccessMessage() )
                          .maxLength( 30 )
                          .required(),
                        button( new BtnProps().className( "primary-button" ), "Request Access" )
                 )
    );
  }

  @Nonnull
  private String getTargetValue( @Nonnull final FormEvent e )
  {
    return React4jUtil.<HTMLInputElement>getTarget( e ).value.trim();
  }

  @Nonnull
  private Promise<MediaStream> requestWebCam()
  {
    return Global
      .globalThis()
      .navigator()
      .mediaDevices()
      .getUserMedia( MediaStreamConstraints
                       .create()
                       .audio( true )
                       .video( MediaTrackConstraints
                                 .create()
                                 .width( ConstrainULongRange.create().min( 160 ).ideal( 640 ).max( 1280 ) )
                                 .height( ConstrainULongRange.create().min( 120 ).ideal( 360 ).max( 720 ) ) ) );
  }

  @Nonnull
  private Promise<MediaStream> requestScreenShare()
  {
    return Global.globalThis().navigator().mediaDevices().getDisplayMedia();
  }
}
