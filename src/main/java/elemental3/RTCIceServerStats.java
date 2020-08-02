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
public interface RTCIceServerStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCIceServerStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String url) {
    return Js.<RTCIceServerStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).url( url );
  }

  @JsProperty(
      name = "port"
  )
  int port();

  @JsProperty
  void setPort(int port);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats port(final int port) {
    setPort( port );
    return this;
  }

  @JsProperty(
      name = "relayProtocol"
  )
  String relayProtocol();

  @JsProperty
  void setRelayProtocol(@Nonnull String relayProtocol);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats relayProtocol(@Nonnull final String relayProtocol) {
    setRelayProtocol( relayProtocol );
    return this;
  }

  @JsProperty(
      name = "totalRequestsSent"
  )
  int totalRequestsSent();

  @JsProperty
  void setTotalRequestsSent(int totalRequestsSent);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats totalRequestsSent(final int totalRequestsSent) {
    setTotalRequestsSent( totalRequestsSent );
    return this;
  }

  @JsProperty(
      name = "totalResponsesReceived"
  )
  int totalResponsesReceived();

  @JsProperty
  void setTotalResponsesReceived(int totalResponsesReceived);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats totalResponsesReceived(final int totalResponsesReceived) {
    setTotalResponsesReceived( totalResponsesReceived );
    return this;
  }

  @JsProperty(
      name = "totalRoundTripTime"
  )
  double totalRoundTripTime();

  @JsProperty
  void setTotalRoundTripTime(double totalRoundTripTime);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats totalRoundTripTime(final double totalRoundTripTime) {
    setTotalRoundTripTime( totalRoundTripTime );
    return this;
  }

  @JsProperty(
      name = "url"
  )
  @Nonnull
  String url();

  @JsProperty
  void setUrl(@Nonnull String url);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats url(@Nonnull final String url) {
    setUrl( url );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCIceServerStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCIceServerStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCIceServerStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
