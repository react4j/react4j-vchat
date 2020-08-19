package react4j.vchat;

import arez.annotations.PreDispose;
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
import react4j.dom.proptypes.html.HtmlProps;
import react4j.dom.proptypes.html.ImgProps;
import react4j.dom.proptypes.html.RefConsumer;
import static react4j.dom.DOM.*;

@View( type = View.Type.TRACKING )
abstract class OldRoomView
{
  @Input( immutable = true )
  @Nonnull
  abstract MediaStreamConnection camStream();

  @Input( immutable = true )
  @Nonnull
  abstract MediaStreamConnection screenShareStream();

  @PostMount
  void postMount()
  {
    camStream().setEnabled( true );
  }

  @PreDispose
  void preDispose()
  {
    camStream().setEnabled( false );
    screenShareStream().setEnabled( false );
  }

  @Nonnull
  @Render
  ReactNode render()
  {
    final MediaStreamConnection camStream = camStream();
    final MediaStreamConnection screenShareStream = screenShareStream();
    final RefConsumer localRef = e -> camStream.setVideoElement( (HTMLVideoElement) e );
    final RefConsumer screenShareRef = e -> screenShareStream.setVideoElement( (HTMLVideoElement) e );
    return div( new HtmlProps().className( "video-wrapper" ),
                div( new HtmlProps().className( "local-video-wrapper" ),
                     ReactElement.createHostElement( "video",
                                                     null,
                                                     localRef,
                                                     JsPropertyMap.of( "autoPlay",
                                                                       true,
                                                                       "muted",
                                                                       true,
                                                                       "id",
                                                                       "localVideo" ) ),
                     screenShareStream.isEnabled() ?
                     ReactElement.createHostElement( "video",
                                                     null,
                                                     screenShareRef,
                                                     JsPropertyMap.of( "autoPlay",
                                                                       true,
                                                                       "muted",
                                                                       true,
                                                                       "id",
                                                                       "screenShareVideo" ) ) :
                     null
                ),
                ReactElement.createHostElement( "video",
                                                null,
                                                null,
                                                JsPropertyMap.of( "autoPlay",
                                                                  true,
                                                                  "id",
                                                                  "remoteVideo" ) ),
                div( new HtmlProps().className( "controls" ),
                     button( new BtnProps().className( "control-btn" )
                               .onClick( e -> screenShareStream.toggleEnabled() ),
                             // TODO: Should generate svg factory methods and props so don't have to ref as img
                             img( new ImgProps()
                                    .src( screenShareStream.isEnabled() ?
                                          "img/screen_share_on.svg" :
                                          "img/screen_share_off.svg" )
                                    .width( 32 )
                                    .height( 32 ) )
                     ),
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
                )
    );
  }
}
