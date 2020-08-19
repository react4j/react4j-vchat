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
import react4j.dom.events.MouseEvent;
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
    _room.open();
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
    if ( RoomModel.State.NOT_READY == state )
    {
      return fragment( h2( "Getting ready..." ),
                       p( "You'll be able to join in just a moment." ) );
    }
    else if ( RoomModel.State.ERROR == state )
    {
      return fragment( h2( "Service Offline" ),
                       p( "The chat service is offline at the moment. Try again later." ) );
    }
    else if ( RoomModel.State.CONNECTED == state )
    {
      return fragment( h2( "Ready to join?" ), p( "Request access to join the room." ), renderRequestAccessForm() );
    }
    else if ( RoomModel.State.JOIN_REQUESTED == state )
    {
      return fragment( h2( "Joining room" ),
                       p( "Waiting for host to allow access to the room." ) );
    }
    else if ( RoomModel.State.JOINED == state &&
              RoomModel.Role.HOST == _room.role() &&
              !_room.getPendingAccessRequests().isEmpty() )
    {
      final AccessRequest accessRequest = _room.getPendingAccessRequests().get( 0 );
      return fragment( h2( "Guest requests access" ),
                       p( "A guest has sent you a message to join the room:" ),
                       div( new HtmlProps().className( "request-message" ), accessRequest.getMessage() ),
                       form( new FormProps().onSubmit( FormEvent::preventDefault ),
                             button( new BtnProps().className( "primary-button" )
                                       .onClick( e -> acceptRequest( e, accessRequest ) ), "Accept" ),
                             button( new BtnProps().className( "primary-button" )
                                       .onClick( e -> rejectRequest( e, accessRequest ) ), "Reject" )
                       )
      );
    }
    else if ( RoomModel.State.JOINED == state &&
              RoomModel.Role.HOST == _room.role() &&
              _room.getParticipants().isEmpty() )
    {
      return fragment( h2( "Waiting for guests to join" ),
                       p( "Waiting for someone to join this room" ),
                       a( new AnchorProps().href( "#" + _room.getRoomCode() ), _room.getRoomCode() ) );
    }
    else if ( RoomModel.State.JOINED == state )
    {
      return fragment( h2( "Joined room" ),
                       p( "Joined room. Feel free to chat." ) );
    }
    else if ( RoomModel.State.JOIN_REJECTED == state )
    {
      return fragment( h2( "Access denied" ),
                       p( "The host denied access to the room. You can attempt to re-request access to join the room." ),
                       renderRequestAccessForm() );
    }
    else if ( RoomModel.State.CLOSED == state )
    {
      return fragment( h2( "Room closed" ),
                       p( RoomModel.Role.HOST == _room.role() ? "You closed the room." : "The host closed the room." ),
                       a( new AnchorProps().className( "primary-button" ).href( "#" ), "Return to Home" ) );
    }
    else if ( RoomModel.State.LEFT == state )
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

  private void acceptRequest( @Nonnull final MouseEvent event, @Nonnull final AccessRequest accessRequest )
  {
    event.preventDefault();
    _room.acceptAccessRequest( accessRequest );
  }

  private void rejectRequest( @Nonnull final MouseEvent event, @Nonnull final AccessRequest accessRequest )
  {
    event.preventDefault();
    _room.rejectAccessRequest( accessRequest );
  }

  @Nonnull
  private ReactNode renderRequestAccessForm()
  {
    return form( new FormProps().onSubmit( this::requestAccess ),
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
                          .required() ),
                 button( new BtnProps().className( "primary-button" ), "Request Access" )
    );
  }

  private void requestAccess( final FormEvent e )
  {
    e.preventDefault();
    _room.requestAccess();
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
