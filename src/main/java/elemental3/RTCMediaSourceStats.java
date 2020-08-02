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
public interface RTCMediaSourceStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCMediaSourceStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind,
      @Nonnull final String trackIdentifier) {
    return Js.<RTCMediaSourceStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).trackIdentifier( trackIdentifier );
  }

  @JsProperty(
      name = "kind"
  )
  @Nonnull
  String kind();

  @JsProperty
  void setKind(@Nonnull String kind);

  @JsOverlay
  @Nonnull
  default RTCMediaSourceStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsProperty(
      name = "relayedSource"
  )
  boolean relayedSource();

  @JsProperty
  void setRelayedSource(boolean relayedSource);

  @JsOverlay
  @Nonnull
  default RTCMediaSourceStats relayedSource(final boolean relayedSource) {
    setRelayedSource( relayedSource );
    return this;
  }

  @JsProperty(
      name = "trackIdentifier"
  )
  @Nonnull
  String trackIdentifier();

  @JsProperty
  void setTrackIdentifier(@Nonnull String trackIdentifier);

  @JsOverlay
  @Nonnull
  default RTCMediaSourceStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCMediaSourceStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCMediaSourceStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCMediaSourceStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
