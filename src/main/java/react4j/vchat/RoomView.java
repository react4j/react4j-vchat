package react4j.vchat;

import elemental3.HTMLVideoElement;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.JsPropertyMap;
import react4j.ReactElement;
import react4j.ReactNode;
import react4j.annotations.Input;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.events.MouseEvent;
import react4j.dom.proptypes.html.BtnProps;
import react4j.dom.proptypes.html.HtmlProps;
import react4j.dom.proptypes.html.ImgProps;
import react4j.dom.proptypes.html.RefConsumer;
import static react4j.dom.DOM.*;

@View( type = View.Type.TRACKING )
abstract class RoomView
{
  @Nullable
  private HTMLVideoElement _localVideo;
  @Nullable
  private HTMLVideoElement _remoteVideo;

  @Input( immutable = true )
  @Nonnull
  abstract RoomConnection connection();

  @Nonnull
  @Render
  ReactNode render()
  {
    final RoomConnection connection = connection();
    final RefConsumer localRef = e -> _localVideo = (HTMLVideoElement) e;
    final RefConsumer removeRef = e -> _remoteVideo = (HTMLVideoElement) e;
    return div( new HtmlProps().className( "video-wrapper" ),
                div( new HtmlProps().className( "local-video-wrapper" ),
                     ReactElement.createHostElement( "video",
                                                     null,
                                                     localRef,
                                                     JsPropertyMap.of( "autoPlay", true,
                                                                       "muted", "",
                                                                       "id", "localVideo" ) ),
                     ReactElement.createHostElement( "video",
                                                     null,
                                                     removeRef,
                                                     JsPropertyMap.of( "autoPlay",
                                                                       true,
                                                                       "className",
                                                                       connection.isConnecting() ||
                                                                       connection.isWaiting() ? "hide" : "",
                                                                       "id",
                                                                       "remoteVideo" ) ),
                     div( new HtmlProps().className( "controls" ),
                          button( new BtnProps().className( "control-btn" ).onClick( this::shareScreen ),
                                  // TODO: Should generate svg factory methods and props so don't have to ref as img
                                  img( new ImgProps().src( "img/shared_screen.svg" ).width( 32 ).height( 32 ) )
                          ),
                          button( new BtnProps().className( "control-btn" ).onClick( this::toggleAudio ),
                                  // TODO: Should generate svg factory methods and props so don't have to ref as img
                                  img( new ImgProps()
                                         .src( connection.isAudioEnabled() ? "img/mic_on.svg" : "img/mic_off.svg" )
                                         .width( 32 )
                                         .height( 32 ) )
                          ),
                          button( new BtnProps().className( "control-btn" ).onClick( this::toggleVideo ),
                                  // TODO: Should generate svg factory methods and props so don't have to ref as img
                                  img( new ImgProps()
                                         .src( connection.isVideoEnabled() ? "img/cam_on.svg" : "img/cam_off.svg" )
                                         .width( 32 )
                                         .height( 32 ) )
                          )
                     ),
                     connection.isConnecting() ?
                     div( new HtmlProps().className( "status" ), p( "Establishing connection..." ) ) :
                     null,
                     connection.isWaiting() ?
                     div( new HtmlProps().className( "status" ), p( "Waiting for someone..." ) ) :
                     null
                )
    );
  }

  private void toggleVideo( @Nonnull final MouseEvent event )
  {
    connection().toggleVideo();
  }

  private void toggleAudio( @Nonnull final MouseEvent event )
  {
    connection().toggleAudio();
  }

  private void shareScreen( @Nonnull final MouseEvent event )
  {
  }
}
