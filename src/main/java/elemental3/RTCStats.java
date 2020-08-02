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
public interface RTCStats {
  @JsOverlay
  @Nonnull
  static RTCStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type) {
    return Js.<RTCStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type );
  }

  @JsProperty(
      name = "id"
  )
  @Nonnull
  String id();

  @JsProperty
  void setId(@Nonnull String id);

  @JsOverlay
  @Nonnull
  default RTCStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsProperty(
      name = "timestamp"
  )
  double timestamp();

  @JsProperty
  void setTimestamp(double timestamp);

  @JsOverlay
  @Nonnull
  default RTCStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @Nonnull
  String type();

  @JsProperty
  void setType(@Nonnull String type);

  @JsOverlay
  @Nonnull
  default RTCStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
