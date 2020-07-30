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
public interface RTCSctpTransportStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCSctpTransportStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type) {
    return Js.<RTCSctpTransportStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type );
  }

  @JsProperty
  int getCongestionWindow();

  @JsProperty
  void setCongestionWindow(int congestionWindow);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats congestionWindow(final int congestionWindow) {
    setCongestionWindow( congestionWindow );
    return this;
  }

  @JsProperty
  int getMtu();

  @JsProperty
  void setMtu(int mtu);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats mtu(final int mtu) {
    setMtu( mtu );
    return this;
  }

  @JsProperty
  int getReceiverWindow();

  @JsProperty
  void setReceiverWindow(int receiverWindow);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats receiverWindow(final int receiverWindow) {
    setReceiverWindow( receiverWindow );
    return this;
  }

  @JsProperty
  double getSmoothedRoundTripTime();

  @JsProperty
  void setSmoothedRoundTripTime(double smoothedRoundTripTime);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats smoothedRoundTripTime(final double smoothedRoundTripTime) {
    setSmoothedRoundTripTime( smoothedRoundTripTime );
    return this;
  }

  @JsProperty
  int getUnackData();

  @JsProperty
  void setUnackData(int unackData);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats unackData(final int unackData) {
    setUnackData( unackData );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSctpTransportStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSctpTransportStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSctpTransportStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
