package react4j.vchat;

import arez.annotations.Feature;
import arez.annotations.Observable;
import elemental3.HTMLInputElement;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Js;
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
import react4j.dom.proptypes.html.attributeTypes.ButtonType;
import react4j.dom.proptypes.html.attributeTypes.InputType;
import static react4j.dom.DOM.*;

@View( type = View.Type.TRACKING )
abstract class SelectRoomView
{
  @Input( immutable = true )
  abstract BrowserLocation browserLocation();

  @Input( immutable = true )
  abstract ApplicationState applicationState();

  @Observable( readOutsideTransaction = Feature.ENABLE, writeOutsideTransaction = Feature.ENABLE )
  @Nullable
  abstract String getRoomCode();

  abstract void setRoomCode( @Nullable String roomCode );

  @Nonnull
  @Render
  ReactNode render()
  {
    final String roomCode = getRoomCode();
    return form( new FormProps().className( "home" ).onSubmit( this::onSubmit ),
                 h1( "vChat" ),
                 label( new LabelProps().htmlFor( "roomCode" ), "Enter a room code." ),
                 input( new InputProps()
                          .type( InputType.text )
                          .className( "roomCodeInput" )
                          .placeHolder( "Room code" )
                          .id( "roomCode" )
                          .value( null == roomCode ? "" : roomCode )
                          .onChange( event -> updateRoomId( asInputElement( event ).value.trim() ) )
                          .pattern( "^\\w+$" )
                          .maxLength( 10 )
                          .required()
                          .autoFocus()
                          .title( "Room code should only contain letters or numbers." ) ),
                 div( new HtmlProps().className( "roomSelectButtons" ),
                      button( new BtnProps().className( "primary-button" ).type( ButtonType.submit ), "Join" ),
                      a( new AnchorProps()
                           .className( "primary-button" )
                           .href( "#" + applicationState().randomRoomCode() ),
                         "Join Random" )
                 ),
                 applicationState().getLatestRoomCodes().isEmpty() ?
                 null :
                 fragment( div( "Recently used rooms:" ),
                           fragment( applicationState().getLatestRoomCodes().stream().map( this::roomLink ) ) )
    );
  }

  @Nonnull
  private ReactNode roomLink( @Nonnull final String roomCode )
  {
    return a( new AnchorProps().key( roomCode ).className( "recent-room" ).href( "#" + roomCode ), roomCode );
  }

  @Nonnull
  private HTMLInputElement asInputElement( @Nonnull final FormEvent event )
  {
    final HTMLInputElement element = Js.cast( event.getTarget() );
    //noinspection ConstantConditions
    assert null != element;
    return element;
  }

  private void onSubmit( @Nonnull final FormEvent e )
  {
    e.preventDefault();
    final String roomId = getRoomCode();
    if ( null != roomId )
    {
      browserLocation().gotoLocation( roomId );
    }
  }

  private void updateRoomId( @Nonnull final String value )
  {
    setRoomCode( value.isEmpty() ? null : value );
  }
}
