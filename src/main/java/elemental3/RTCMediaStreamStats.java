package elemental3;

import elemental2.core.JsArray;
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
public interface RTCMediaStreamStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCMediaStreamStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type) {
    return Js.<RTCMediaStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type );
  }

  @JsProperty
  String getStreamIdentifier();

  @JsProperty
  void setStreamIdentifier(@Nonnull String streamIdentifier);

  @JsOverlay
  @Nonnull
  default RTCMediaStreamStats streamIdentifier(@Nonnull final String streamIdentifier) {
    setStreamIdentifier( streamIdentifier );
    return this;
  }

  @JsProperty
  JsArray<String> getTrackIds();

  @JsProperty
  void setTrackIds(@Nonnull JsArray<String> trackIds);

  @JsOverlay
  @Nonnull
  default RTCMediaStreamStats trackIds(@Nonnull final JsArray<String> trackIds) {
    setTrackIds( trackIds );
    return this;
  }

  @JsOverlay
  default void setTrackIds(@Nonnull final String... trackIds) {
    setTrackIds( JsArray.asJsArray( trackIds ) );
  }

  @JsOverlay
  @Nonnull
  default RTCMediaStreamStats trackIds(@Nonnull final String... trackIds) {
    setTrackIds( trackIds );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCMediaStreamStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCMediaStreamStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCMediaStreamStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
