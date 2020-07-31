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
public interface RTCTransportStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCTransportStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String dtlsState) {
    return Js.<RTCTransportStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).dtlsState( dtlsState );
  }

  @JsProperty
  int getBytesReceived();

  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsOverlay
  @Nonnull
  default RTCTransportStats bytesReceived(final int bytesReceived) {
    setBytesReceived( bytesReceived );
    return this;
  }

  @JsProperty
  int getBytesSent();

  @JsProperty
  void setBytesSent(int bytesSent);

  @JsOverlay
  @Nonnull
  default RTCTransportStats bytesSent(final int bytesSent) {
    setBytesSent( bytesSent );
    return this;
  }

  @JsProperty
  String getDtlsCipher();

  @JsProperty
  void setDtlsCipher(@Nonnull String dtlsCipher);

  @JsOverlay
  @Nonnull
  default RTCTransportStats dtlsCipher(@Nonnull final String dtlsCipher) {
    setDtlsCipher( dtlsCipher );
    return this;
  }

  @JsProperty
  @Nonnull
  String getDtlsState();

  @JsProperty
  void setDtlsState(@Nonnull String dtlsState);

  @JsOverlay
  @Nonnull
  default RTCTransportStats dtlsState(@Nonnull final String dtlsState) {
    setDtlsState( dtlsState );
    return this;
  }

  @JsProperty
  String getIceLocalUsernameFragment();

  @JsProperty
  void setIceLocalUsernameFragment(@Nonnull String iceLocalUsernameFragment);

  @JsOverlay
  @Nonnull
  default RTCTransportStats iceLocalUsernameFragment(
      @Nonnull final String iceLocalUsernameFragment) {
    setIceLocalUsernameFragment( iceLocalUsernameFragment );
    return this;
  }

  @JsProperty
  String getIceRole();

  @JsProperty
  void setIceRole(@Nonnull String iceRole);

  @JsOverlay
  @Nonnull
  default RTCTransportStats iceRole(@Nonnull final String iceRole) {
    setIceRole( iceRole );
    return this;
  }

  @JsProperty
  String getIceState();

  @JsProperty
  void setIceState(@Nonnull String iceState);

  @JsOverlay
  @Nonnull
  default RTCTransportStats iceState(@Nonnull final String iceState) {
    setIceState( iceState );
    return this;
  }

  @JsProperty
  String getLocalCertificateId();

  @JsProperty
  void setLocalCertificateId(@Nonnull String localCertificateId);

  @JsOverlay
  @Nonnull
  default RTCTransportStats localCertificateId(@Nonnull final String localCertificateId) {
    setLocalCertificateId( localCertificateId );
    return this;
  }

  @JsProperty
  int getPacketsReceived();

  @JsProperty
  void setPacketsReceived(int packetsReceived);

  @JsOverlay
  @Nonnull
  default RTCTransportStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  @JsProperty
  int getPacketsSent();

  @JsProperty
  void setPacketsSent(int packetsSent);

  @JsOverlay
  @Nonnull
  default RTCTransportStats packetsSent(final int packetsSent) {
    setPacketsSent( packetsSent );
    return this;
  }

  @JsProperty
  String getRemoteCertificateId();

  @JsProperty
  void setRemoteCertificateId(@Nonnull String remoteCertificateId);

  @JsOverlay
  @Nonnull
  default RTCTransportStats remoteCertificateId(@Nonnull final String remoteCertificateId) {
    setRemoteCertificateId( remoteCertificateId );
    return this;
  }

  @JsProperty
  String getRtcpTransportStatsId();

  @JsProperty
  void setRtcpTransportStatsId(@Nonnull String rtcpTransportStatsId);

  @JsOverlay
  @Nonnull
  default RTCTransportStats rtcpTransportStatsId(@Nonnull final String rtcpTransportStatsId) {
    setRtcpTransportStatsId( rtcpTransportStatsId );
    return this;
  }

  @JsProperty
  int getSelectedCandidatePairChanges();

  @JsProperty
  void setSelectedCandidatePairChanges(int selectedCandidatePairChanges);

  @JsOverlay
  @Nonnull
  default RTCTransportStats selectedCandidatePairChanges(final int selectedCandidatePairChanges) {
    setSelectedCandidatePairChanges( selectedCandidatePairChanges );
    return this;
  }

  @JsProperty
  String getSelectedCandidatePairId();

  @JsProperty
  void setSelectedCandidatePairId(@Nonnull String selectedCandidatePairId);

  @JsOverlay
  @Nonnull
  default RTCTransportStats selectedCandidatePairId(@Nonnull final String selectedCandidatePairId) {
    setSelectedCandidatePairId( selectedCandidatePairId );
    return this;
  }

  @JsProperty
  String getSrtpCipher();

  @JsProperty
  void setSrtpCipher(@Nonnull String srtpCipher);

  @JsOverlay
  @Nonnull
  default RTCTransportStats srtpCipher(@Nonnull final String srtpCipher) {
    setSrtpCipher( srtpCipher );
    return this;
  }

  @JsProperty
  String getTlsGroup();

  @JsProperty
  void setTlsGroup(@Nonnull String tlsGroup);

  @JsOverlay
  @Nonnull
  default RTCTransportStats tlsGroup(@Nonnull final String tlsGroup) {
    setTlsGroup( tlsGroup );
    return this;
  }

  @JsProperty
  String getTlsVersion();

  @JsProperty
  void setTlsVersion(@Nonnull String tlsVersion);

  @JsOverlay
  @Nonnull
  default RTCTransportStats tlsVersion(@Nonnull final String tlsVersion) {
    setTlsVersion( tlsVersion );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCTransportStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCTransportStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCTransportStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}