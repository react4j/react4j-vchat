package react4j.vchat;

import arez.annotations.Action;
import arez.annotations.Feature;
import arez.annotations.Observable;
import elemental3.Global;
import elemental3.HTMLInputElement;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Js;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.events.FormEvent;
import react4j.dom.proptypes.html.BtnProps;
import react4j.dom.proptypes.html.FormProps;
import react4j.dom.proptypes.html.HtmlProps;
import react4j.dom.proptypes.html.InputProps;
import react4j.dom.proptypes.html.attributeTypes.ButtonType;
import react4j.dom.proptypes.html.attributeTypes.InputType;
import static react4j.dom.DOM.*;

@View( type = View.Type.TRACKING )
abstract class SelectRoomView
{
  @Input( immutable = true )
  abstract RoomsHistory roomHistory();

  @Observable( readOutsideTransaction = Feature.ENABLE, writeOutsideTransaction = Feature.ENABLE )
  @Nullable
  abstract String getRoomId();

  abstract void setRoomId( @Nullable String roomId );

  @Nonnull
  @Render
  ReactNode render()
  {
    final String roomId = getRoomId();
    return div( new HtmlProps().className( "home" ),
                form( new FormProps().onSubmit( this::onSubmit ),
                      h1( "React4j Video Chat" ),
                      label( new LabelProps().htmlFor( "roomId" ), "Please enter a room code." ),
                      input( new InputProps()
                               .type( InputType.text )
                               .placeHolder( "Room code" )
                               .id( "roomId" )
                               .name( "roomId" )
                               .value( null == roomId ? "" : roomId )
                               .onChange( event -> updateRoomId( asInputElement( event ).value.trim() ) )
                               .pattern( "^\\w+$" )
                               .maxLength( 10 )
                               .required()
                               .autoFocus()
                               .title( "Room name should only contain letters or numbers." ) ),
                      button( new BtnProps().type( ButtonType.submit ).disabled( null == roomId ), "Enter" )
                ) );
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
    final String roomId = getRoomId();
    if ( null != roomId )
    {
      Global.globalThis().window().location().hash = roomId;
    }
  }

  private void updateRoomId( @Nonnull final String value )
  {
    setRoomId( value.isEmpty() ? null : value );
  }
}
