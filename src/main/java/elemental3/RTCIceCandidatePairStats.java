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
public interface RTCIceCandidatePairStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCIceCandidatePairStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String localCandidateId,
      @Nonnull final String remoteCandidateId, @Nonnull final String state,
      @Nonnull final String transportId) {
    return Js.<RTCIceCandidatePairStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).localCandidateId( localCandidateId ).remoteCandidateId( remoteCandidateId ).state( state ).transportId( transportId );
  }

  @JsProperty
  double getAvailableIncomingBitrate();

  @JsProperty
  void setAvailableIncomingBitrate(double availableIncomingBitrate);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats availableIncomingBitrate(final double availableIncomingBitrate) {
    setAvailableIncomingBitrate( availableIncomingBitrate );
    return this;
  }

  @JsProperty
  double getAvailableOutgoingBitrate();

  @JsProperty
  void setAvailableOutgoingBitrate(double availableOutgoingBitrate);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats availableOutgoingBitrate(final double availableOutgoingBitrate) {
    setAvailableOutgoingBitrate( availableOutgoingBitrate );
    return this;
  }

  @JsProperty
  int getBytesDiscardedOnSend();

  @JsProperty
  void setBytesDiscardedOnSend(int bytesDiscardedOnSend);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats bytesDiscardedOnSend(final int bytesDiscardedOnSend) {
    setBytesDiscardedOnSend( bytesDiscardedOnSend );
    return this;
  }

  @JsProperty
  int getBytesReceived();

  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats bytesReceived(final int bytesReceived) {
    setBytesReceived( bytesReceived );
    return this;
  }

  @JsProperty
  int getBytesSent();

  @JsProperty
  void setBytesSent(int bytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats bytesSent(final int bytesSent) {
    setBytesSent( bytesSent );
    return this;
  }

  @JsProperty
  int getCircuitBreakerTriggerCount();

  @JsProperty
  void setCircuitBreakerTriggerCount(int circuitBreakerTriggerCount);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats circuitBreakerTriggerCount(
      final int circuitBreakerTriggerCount) {
    setCircuitBreakerTriggerCount( circuitBreakerTriggerCount );
    return this;
  }

  @JsProperty
  double getConsentExpiredTimestamp();

  @JsProperty
  void setConsentExpiredTimestamp(double consentExpiredTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats consentExpiredTimestamp(final double consentExpiredTimestamp) {
    setConsentExpiredTimestamp( consentExpiredTimestamp );
    return this;
  }

  @JsProperty
  int getConsentRequestBytesSent();

  @JsProperty
  void setConsentRequestBytesSent(int consentRequestBytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats consentRequestBytesSent(final int consentRequestBytesSent) {
    setConsentRequestBytesSent( consentRequestBytesSent );
    return this;
  }

  @JsProperty
  int getConsentRequestsSent();

  @JsProperty
  void setConsentRequestsSent(int consentRequestsSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats consentRequestsSent(final int consentRequestsSent) {
    setConsentRequestsSent( consentRequestsSent );
    return this;
  }

  @JsProperty
  double getCurrentRoundTripTime();

  @JsProperty
  void setCurrentRoundTripTime(double currentRoundTripTime);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats currentRoundTripTime(final double currentRoundTripTime) {
    setCurrentRoundTripTime( currentRoundTripTime );
    return this;
  }

  @JsProperty
  double getFirstRequestTimestamp();

  @JsProperty
  void setFirstRequestTimestamp(double firstRequestTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats firstRequestTimestamp(final double firstRequestTimestamp) {
    setFirstRequestTimestamp( firstRequestTimestamp );
    return this;
  }

  @JsProperty
  double getLastPacketReceivedTimestamp();

  @JsProperty
  void setLastPacketReceivedTimestamp(double lastPacketReceivedTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastPacketReceivedTimestamp(
      final double lastPacketReceivedTimestamp) {
    setLastPacketReceivedTimestamp( lastPacketReceivedTimestamp );
    return this;
  }

  @JsProperty
  double getLastPacketSentTimestamp();

  @JsProperty
  void setLastPacketSentTimestamp(double lastPacketSentTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastPacketSentTimestamp(final double lastPacketSentTimestamp) {
    setLastPacketSentTimestamp( lastPacketSentTimestamp );
    return this;
  }

  @JsProperty
  double getLastRequestTimestamp();

  @JsProperty
  void setLastRequestTimestamp(double lastRequestTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastRequestTimestamp(final double lastRequestTimestamp) {
    setLastRequestTimestamp( lastRequestTimestamp );
    return this;
  }

  @JsProperty
  double getLastResponseTimestamp();

  @JsProperty
  void setLastResponseTimestamp(double lastResponseTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastResponseTimestamp(final double lastResponseTimestamp) {
    setLastResponseTimestamp( lastResponseTimestamp );
    return this;
  }

  @JsProperty
  @Nonnull
  String getLocalCandidateId();

  @JsProperty
  void setLocalCandidateId(@Nonnull String localCandidateId);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats localCandidateId(@Nonnull final String localCandidateId) {
    setLocalCandidateId( localCandidateId );
    return this;
  }

  @JsProperty
  boolean isNominated();

  @JsProperty
  void setNominated(boolean nominated);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats nominated(final boolean nominated) {
    setNominated( nominated );
    return this;
  }

  @JsProperty
  int getPacketsDiscardedOnSend();

  @JsProperty
  void setPacketsDiscardedOnSend(int packetsDiscardedOnSend);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats packetsDiscardedOnSend(final int packetsDiscardedOnSend) {
    setPacketsDiscardedOnSend( packetsDiscardedOnSend );
    return this;
  }

  @JsProperty
  int getPacketsReceived();

  @JsProperty
  void setPacketsReceived(int packetsReceived);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  @JsProperty
  int getPacketsSent();

  @JsProperty
  void setPacketsSent(int packetsSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats packetsSent(final int packetsSent) {
    setPacketsSent( packetsSent );
    return this;
  }

  @JsProperty
  @Nonnull
  String getRemoteCandidateId();

  @JsProperty
  void setRemoteCandidateId(@Nonnull String remoteCandidateId);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats remoteCandidateId(@Nonnull final String remoteCandidateId) {
    setRemoteCandidateId( remoteCandidateId );
    return this;
  }

  @JsProperty
  int getRequestBytesSent();

  @JsProperty
  void setRequestBytesSent(int requestBytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats requestBytesSent(final int requestBytesSent) {
    setRequestBytesSent( requestBytesSent );
    return this;
  }

  @JsProperty
  int getRequestsReceived();

  @JsProperty
  void setRequestsReceived(int requestsReceived);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats requestsReceived(final int requestsReceived) {
    setRequestsReceived( requestsReceived );
    return this;
  }

  @JsProperty
  int getRequestsSent();

  @JsProperty
  void setRequestsSent(int requestsSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats requestsSent(final int requestsSent) {
    setRequestsSent( requestsSent );
    return this;
  }

  @JsProperty
  int getResponseBytesSent();

  @JsProperty
  void setResponseBytesSent(int responseBytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats responseBytesSent(final int responseBytesSent) {
    setResponseBytesSent( responseBytesSent );
    return this;
  }

  @JsProperty
  int getResponsesReceived();

  @JsProperty
  void setResponsesReceived(int responsesReceived);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats responsesReceived(final int responsesReceived) {
    setResponsesReceived( responsesReceived );
    return this;
  }

  @JsProperty
  int getResponsesSent();

  @JsProperty
  void setResponsesSent(int responsesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats responsesSent(final int responsesSent) {
    setResponsesSent( responsesSent );
    return this;
  }

  @JsProperty
  int getRetransmissionsReceived();

  @JsProperty
  void setRetransmissionsReceived(int retransmissionsReceived);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats retransmissionsReceived(final int retransmissionsReceived) {
    setRetransmissionsReceived( retransmissionsReceived );
    return this;
  }

  @JsProperty
  int getRetransmissionsSent();

  @JsProperty
  void setRetransmissionsSent(int retransmissionsSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats retransmissionsSent(final int retransmissionsSent) {
    setRetransmissionsSent( retransmissionsSent );
    return this;
  }

  @JsProperty
  @Nonnull
  String getState();

  @JsProperty
  void setState(@Nonnull String state);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats state(@Nonnull final String state) {
    setState( state );
    return this;
  }

  @JsProperty
  double getTotalRoundTripTime();

  @JsProperty
  void setTotalRoundTripTime(double totalRoundTripTime);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats totalRoundTripTime(final double totalRoundTripTime) {
    setTotalRoundTripTime( totalRoundTripTime );
    return this;
  }

  @JsProperty
  @Nonnull
  String getTransportId();

  @JsProperty
  void setTransportId(@Nonnull String transportId);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsProperty
  double getCurrentRtt();

  @JsProperty
  void setCurrentRtt(double currentRtt);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats currentRtt(final double currentRtt) {
    setCurrentRtt( currentRtt );
    return this;
  }

  @JsProperty
  int getPriority();

  @JsProperty
  void setPriority(int priority);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats priority(final int priority) {
    setPriority( priority );
    return this;
  }

  @JsProperty
  double getTotalRtt();

  @JsProperty
  void setTotalRtt(double totalRtt);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats totalRtt(final double totalRtt) {
    setTotalRtt( totalRtt );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCIceCandidatePairStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCIceCandidatePairStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCIceCandidatePairStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
