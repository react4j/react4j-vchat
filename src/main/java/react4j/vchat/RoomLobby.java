package react4j.vchat;

import arez.annotations.Action;
import elemental3.HTMLVideoElement;
import javax.annotation.Nonnull;
import jsinterop.base.JsPropertyMap;
import react4j.ReactElement;
import react4j.ReactNode;
import react4j.annotations.Input;
import react4j.annotations.PostMount;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.proptypes.html.BtnProps;
import react4j.dom.proptypes.html.CssProps;
import react4j.dom.proptypes.html.HtmlProps;
import react4j.dom.proptypes.html.ImgProps;
import react4j.dom.proptypes.html.RefConsumer;
import static react4j.dom.DOM.*;

@View( type = View.Type.TRACKING )
abstract class RoomLobby
{
  @Input( immutable = true )
  @Nonnull
  abstract MediaStreamConnection camStream();

  @Input( immutable = true )
  abstract ApplicationState roomHistory();

  @Action
  @PostMount
  void postMount()
  {
    final String roomId = "";
    roomHistory().recordRoomCode( roomId );
    camStream().setEnabled( true );
  }

  @Nonnull
  @Render
  ReactNode render()
  {
    final MediaStreamConnection camStream = camStream();
    final RefConsumer localRef = e -> camStream.setVideoElement( (HTMLVideoElement) e );
    return div( new HtmlProps().className( "room-lobby" ),
                div( new HtmlProps().className( "local-cam-video" ),
                     ReactElement.createHostElement( "video",
                                                     null,
                                                     localRef,
                                                     JsPropertyMap.of( "autoPlay",
                                                                       true,
                                                                       "muted",
                                                                       true,
                                                                       "style",
                                                                       new CssProps().transform( "scaleX(-1)" ) ) ),
                     null != camStream.getStream() ?
                     div( new HtmlProps().className( "local-cam-video-controls" ),
                          button( new BtnProps().className( "control-btn" ).onClick( e -> camStream.toggleAudio() ),
                                  // TODO: Should generate svg factory methods and props so don't have to ref as img
                                  img( new ImgProps()
                                         .src( camStream.isAudioEnabled() ? "img/mic_on.svg" : "img/mic_off.svg" )
                                         .width( 32 )
                                         .height( 32 ) )
                          ),
                          button( new BtnProps().className( "control-btn" ).onClick( e -> camStream.toggleVideo() ),
                                  // TODO: Should generate svg factory methods and props so don't have to ref as img
                                  img( new ImgProps()
                                         .src( camStream.isVideoEnabled() ? "img/cam_on.svg" : "img/cam_off.svg" )
                                         .width( 32 )
                                         .height( 32 ) )
                          )
                     ) :
                     null
                )
    );
  }
}
