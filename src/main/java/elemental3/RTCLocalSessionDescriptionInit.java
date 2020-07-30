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
public interface RTCLocalSessionDescriptionInit {
  @JsOverlay
  @Nonnull
  static RTCLocalSessionDescriptionInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getSdp();

  @JsProperty
  void setSdp(@Nonnull String sdp);

  @JsOverlay
  @Nonnull
  default RTCLocalSessionDescriptionInit sdp(@Nonnull final String sdp) {
    setSdp( sdp );
    return this;
  }

  @JsProperty
  String getType();

  @JsProperty
  void setType(@Nonnull String type);

  @JsOverlay
  @Nonnull
  default RTCLocalSessionDescriptionInit type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
