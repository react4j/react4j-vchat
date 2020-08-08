package react4j.vchat;

import arez.annotations.Action;
import arez.annotations.Feature;
import arez.annotations.Observable;
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
  @Observable( writeOutsideTransaction = Feature.ENABLE )
  @Nullable
  abstract String getRoomId();

  abstract void setRoomId( @Nullable String roomId );

  @Nonnull
  @Render
  ReactNode render()
  {
    final String roomId = getRoomId();
    return div( new HtmlProps().className( "enter-room-container" ),
                form( new FormProps().onSubmit( this::onSubmit ),
                      input( new InputProps()
                               .type( InputType.text )
                               .placeHolder( "Room id" )
                               .value( null == roomId ? "" : roomId )
                               .onChange( event -> updateRoomId( asInputElement( event ).value.trim() ) ) ),
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
    submit();
  }

  @Action
  void submit()
  {
    final String roomId = getRoomId();
    if ( null != roomId )
    {
      Global.window().location().hash = roomId;
    }
  }

  private void updateRoomId( @Nonnull final String value )
  {
    setRoomId( value.isEmpty() ? null : value );
  }
}
