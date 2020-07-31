package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface RTCIceCandidateStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCIceCandidateStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String candidateType,
      @Nonnull final String transportId) {
    return Js.<RTCIceCandidateStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).candidateType( candidateType ).transportId( transportId );
  }

  @JsProperty
  @Nullable
  String getAddress();

  @JsProperty
  void setAddress(@Nullable String address);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats address(@Nullable final String address) {
    setAddress( address );
    return this;
  }

  @JsProperty
  @Nonnull
  String getCandidateType();

  @JsProperty
  void setCandidateType(@Nonnull String candidateType);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats candidateType(@Nonnull final String candidateType) {
    setCandidateType( candidateType );
    return this;
  }

  @JsProperty
  int getPort();

  @JsProperty
  void setPort(int port);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats port(final int port) {
    setPort( port );
    return this;
  }

  @JsProperty
  int getPriority();

  @JsProperty
  void setPriority(int priority);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats priority(final int priority) {
    setPriority( priority );
    return this;
  }

  @JsProperty
  String getProtocol();

  @JsProperty
  void setProtocol(@Nonnull String protocol);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats protocol(@Nonnull final String protocol) {
    setProtocol( protocol );
    return this;
  }

  @JsProperty
  String getRelayProtocol();

  @JsProperty
  void setRelayProtocol(@Nonnull String relayProtocol);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats relayProtocol(@Nonnull final String relayProtocol) {
    setRelayProtocol( relayProtocol );
    return this;
  }

  @JsProperty
  @Nonnull
  String getTransportId();

  @JsProperty
  void setTransportId(@Nonnull String transportId);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsProperty
  String getUrl();

  @JsProperty
  void setUrl(@Nonnull String url);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats url(@Nonnull final String url) {
    setUrl( url );
    return this;
  }

  @JsProperty
  boolean isDeleted();

  @JsProperty
  void setDeleted(boolean deleted);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats deleted(final boolean deleted) {
    setDeleted( deleted );
    return this;
  }

  @JsProperty
  boolean isIsRemote();

  @JsProperty
  void setIsRemote(boolean isRemote);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats isRemote(final boolean isRemote) {
    setIsRemote( isRemote );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCIceCandidateStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCIceCandidateStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCIceCandidateStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}