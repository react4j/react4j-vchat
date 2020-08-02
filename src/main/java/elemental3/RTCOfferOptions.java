package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCOfferOptions extends RTCOfferAnswerOptions {
  @JsOverlay
  @Nonnull
  static RTCOfferOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "iceRestart"
  )
  boolean iceRestart();

  @JsProperty
  void setIceRestart(boolean iceRestart);

  @JsOverlay
  @Nonnull
  default RTCOfferOptions iceRestart(final boolean iceRestart) {
    setIceRestart( iceRestart );
    return this;
  }

  @JsProperty(
      name = "offerToReceiveAudio"
  )
  boolean offerToReceiveAudio();

  @JsProperty
  void setOfferToReceiveAudio(boolean offerToReceiveAudio);

  @JsOverlay
  @Nonnull
  default RTCOfferOptions offerToReceiveAudio(final boolean offerToReceiveAudio) {
    setOfferToReceiveAudio( offerToReceiveAudio );
    return this;
  }

  @JsProperty(
      name = "offerToReceiveVideo"
  )
  boolean offerToReceiveVideo();

  @JsProperty
  void setOfferToReceiveVideo(boolean offerToReceiveVideo);

  @JsOverlay
  @Nonnull
  default RTCOfferOptions offerToReceiveVideo(final boolean offerToReceiveVideo) {
    setOfferToReceiveVideo( offerToReceiveVideo );
    return this;
  }
}
