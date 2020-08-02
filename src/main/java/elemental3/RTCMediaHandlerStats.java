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
public interface RTCMediaHandlerStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCMediaHandlerStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCMediaHandlerStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty(
      name = "ended"
  )
  boolean ended();

  @JsProperty
  void setEnded(boolean ended);

  @JsOverlay
  @Nonnull
  default RTCMediaHandlerStats ended(final boolean ended) {
    setEnded( ended );
    return this;
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
  default RTCMediaHandlerStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsProperty(
      name = "trackIdentifier"
  )
  String trackIdentifier();

  @JsProperty
  void setTrackIdentifier(@Nonnull String trackIdentifier);

  @JsOverlay
  @Nonnull
  default RTCMediaHandlerStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsProperty(
      name = "priority"
  )
  String priority();

  @JsProperty
  void setPriority(@Nonnull String priority);

  @JsOverlay
  @Nonnull
  default RTCMediaHandlerStats priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsProperty(
      name = "remoteSource"
  )
  boolean remoteSource();

  @JsProperty
  void setRemoteSource(boolean remoteSource);

  @JsOverlay
  @Nonnull
  default RTCMediaHandlerStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCMediaHandlerStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCMediaHandlerStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCMediaHandlerStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
