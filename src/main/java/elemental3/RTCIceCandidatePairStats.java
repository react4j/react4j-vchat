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

  @JsProperty(
      name = "availableIncomingBitrate"
  )
  double availableIncomingBitrate();

  @JsProperty
  void setAvailableIncomingBitrate(double availableIncomingBitrate);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats availableIncomingBitrate(final double availableIncomingBitrate) {
    setAvailableIncomingBitrate( availableIncomingBitrate );
    return this;
  }

  @JsProperty(
      name = "availableOutgoingBitrate"
  )
  double availableOutgoingBitrate();

  @JsProperty
  void setAvailableOutgoingBitrate(double availableOutgoingBitrate);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats availableOutgoingBitrate(final double availableOutgoingBitrate) {
    setAvailableOutgoingBitrate( availableOutgoingBitrate );
    return this;
  }

  @JsProperty(
      name = "bytesDiscardedOnSend"
  )
  int bytesDiscardedOnSend();

  @JsProperty
  void setBytesDiscardedOnSend(int bytesDiscardedOnSend);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats bytesDiscardedOnSend(final int bytesDiscardedOnSend) {
    setBytesDiscardedOnSend( bytesDiscardedOnSend );
    return this;
  }

  @JsProperty(
      name = "bytesReceived"
  )
  int bytesReceived();

  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats bytesReceived(final int bytesReceived) {
    setBytesReceived( bytesReceived );
    return this;
  }

  @JsProperty(
      name = "bytesSent"
  )
  int bytesSent();

  @JsProperty
  void setBytesSent(int bytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats bytesSent(final int bytesSent) {
    setBytesSent( bytesSent );
    return this;
  }

  @JsProperty(
      name = "circuitBreakerTriggerCount"
  )
  int circuitBreakerTriggerCount();

  @JsProperty
  void setCircuitBreakerTriggerCount(int circuitBreakerTriggerCount);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats circuitBreakerTriggerCount(
      final int circuitBreakerTriggerCount) {
    setCircuitBreakerTriggerCount( circuitBreakerTriggerCount );
    return this;
  }

  @JsProperty(
      name = "consentExpiredTimestamp"
  )
  double consentExpiredTimestamp();

  @JsProperty
  void setConsentExpiredTimestamp(double consentExpiredTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats consentExpiredTimestamp(final double consentExpiredTimestamp) {
    setConsentExpiredTimestamp( consentExpiredTimestamp );
    return this;
  }

  @JsProperty(
      name = "consentRequestBytesSent"
  )
  int consentRequestBytesSent();

  @JsProperty
  void setConsentRequestBytesSent(int consentRequestBytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats consentRequestBytesSent(final int consentRequestBytesSent) {
    setConsentRequestBytesSent( consentRequestBytesSent );
    return this;
  }

  @JsProperty(
      name = "consentRequestsSent"
  )
  int consentRequestsSent();

  @JsProperty
  void setConsentRequestsSent(int consentRequestsSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats consentRequestsSent(final int consentRequestsSent) {
    setConsentRequestsSent( consentRequestsSent );
    return this;
  }

  @JsProperty(
      name = "currentRoundTripTime"
  )
  double currentRoundTripTime();

  @JsProperty
  void setCurrentRoundTripTime(double currentRoundTripTime);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats currentRoundTripTime(final double currentRoundTripTime) {
    setCurrentRoundTripTime( currentRoundTripTime );
    return this;
  }

  @JsProperty(
      name = "firstRequestTimestamp"
  )
  double firstRequestTimestamp();

  @JsProperty
  void setFirstRequestTimestamp(double firstRequestTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats firstRequestTimestamp(final double firstRequestTimestamp) {
    setFirstRequestTimestamp( firstRequestTimestamp );
    return this;
  }

  @JsProperty(
      name = "lastPacketReceivedTimestamp"
  )
  double lastPacketReceivedTimestamp();

  @JsProperty
  void setLastPacketReceivedTimestamp(double lastPacketReceivedTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastPacketReceivedTimestamp(
      final double lastPacketReceivedTimestamp) {
    setLastPacketReceivedTimestamp( lastPacketReceivedTimestamp );
    return this;
  }

  @JsProperty(
      name = "lastPacketSentTimestamp"
  )
  double lastPacketSentTimestamp();

  @JsProperty
  void setLastPacketSentTimestamp(double lastPacketSentTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastPacketSentTimestamp(final double lastPacketSentTimestamp) {
    setLastPacketSentTimestamp( lastPacketSentTimestamp );
    return this;
  }

  @JsProperty(
      name = "lastRequestTimestamp"
  )
  double lastRequestTimestamp();

  @JsProperty
  void setLastRequestTimestamp(double lastRequestTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastRequestTimestamp(final double lastRequestTimestamp) {
    setLastRequestTimestamp( lastRequestTimestamp );
    return this;
  }

  @JsProperty(
      name = "lastResponseTimestamp"
  )
  double lastResponseTimestamp();

  @JsProperty
  void setLastResponseTimestamp(double lastResponseTimestamp);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastResponseTimestamp(final double lastResponseTimestamp) {
    setLastResponseTimestamp( lastResponseTimestamp );
    return this;
  }

  @JsProperty(
      name = "localCandidateId"
  )
  @Nonnull
  String localCandidateId();

  @JsProperty
  void setLocalCandidateId(@Nonnull String localCandidateId);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats localCandidateId(@Nonnull final String localCandidateId) {
    setLocalCandidateId( localCandidateId );
    return this;
  }

  @JsProperty(
      name = "nominated"
  )
  boolean nominated();

  @JsProperty
  void setNominated(boolean nominated);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats nominated(final boolean nominated) {
    setNominated( nominated );
    return this;
  }

  @JsProperty(
      name = "packetsDiscardedOnSend"
  )
  int packetsDiscardedOnSend();

  @JsProperty
  void setPacketsDiscardedOnSend(int packetsDiscardedOnSend);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats packetsDiscardedOnSend(final int packetsDiscardedOnSend) {
    setPacketsDiscardedOnSend( packetsDiscardedOnSend );
    return this;
  }

  @JsProperty(
      name = "packetsReceived"
  )
  int packetsReceived();

  @JsProperty
  void setPacketsReceived(int packetsReceived);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  @JsProperty(
      name = "packetsSent"
  )
  int packetsSent();

  @JsProperty
  void setPacketsSent(int packetsSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats packetsSent(final int packetsSent) {
    setPacketsSent( packetsSent );
    return this;
  }

  @JsProperty(
      name = "remoteCandidateId"
  )
  @Nonnull
  String remoteCandidateId();

  @JsProperty
  void setRemoteCandidateId(@Nonnull String remoteCandidateId);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats remoteCandidateId(@Nonnull final String remoteCandidateId) {
    setRemoteCandidateId( remoteCandidateId );
    return this;
  }

  @JsProperty(
      name = "requestBytesSent"
  )
  int requestBytesSent();

  @JsProperty
  void setRequestBytesSent(int requestBytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats requestBytesSent(final int requestBytesSent) {
    setRequestBytesSent( requestBytesSent );
    return this;
  }

  @JsProperty(
      name = "requestsReceived"
  )
  int requestsReceived();

  @JsProperty
  void setRequestsReceived(int requestsReceived);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats requestsReceived(final int requestsReceived) {
    setRequestsReceived( requestsReceived );
    return this;
  }

  @JsProperty(
      name = "requestsSent"
  )
  int requestsSent();

  @JsProperty
  void setRequestsSent(int requestsSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats requestsSent(final int requestsSent) {
    setRequestsSent( requestsSent );
    return this;
  }

  @JsProperty(
      name = "responseBytesSent"
  )
  int responseBytesSent();

  @JsProperty
  void setResponseBytesSent(int responseBytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats responseBytesSent(final int responseBytesSent) {
    setResponseBytesSent( responseBytesSent );
    return this;
  }

  @JsProperty(
      name = "responsesReceived"
  )
  int responsesReceived();

  @JsProperty
  void setResponsesReceived(int responsesReceived);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats responsesReceived(final int responsesReceived) {
    setResponsesReceived( responsesReceived );
    return this;
  }

  @JsProperty(
      name = "responsesSent"
  )
  int responsesSent();

  @JsProperty
  void setResponsesSent(int responsesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats responsesSent(final int responsesSent) {
    setResponsesSent( responsesSent );
    return this;
  }

  @JsProperty(
      name = "retransmissionsReceived"
  )
  int retransmissionsReceived();

  @JsProperty
  void setRetransmissionsReceived(int retransmissionsReceived);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats retransmissionsReceived(final int retransmissionsReceived) {
    setRetransmissionsReceived( retransmissionsReceived );
    return this;
  }

  @JsProperty(
      name = "retransmissionsSent"
  )
  int retransmissionsSent();

  @JsProperty
  void setRetransmissionsSent(int retransmissionsSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats retransmissionsSent(final int retransmissionsSent) {
    setRetransmissionsSent( retransmissionsSent );
    return this;
  }

  @JsProperty(
      name = "state"
  )
  @Nonnull
  String state();

  @JsProperty
  void setState(@Nonnull String state);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats state(@Nonnull final String state) {
    setState( state );
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
  default RTCIceCandidatePairStats totalRoundTripTime(final double totalRoundTripTime) {
    setTotalRoundTripTime( totalRoundTripTime );
    return this;
  }

  @JsProperty(
      name = "transportId"
  )
  @Nonnull
  String transportId();

  @JsProperty
  void setTransportId(@Nonnull String transportId);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsProperty(
      name = "currentRtt"
  )
  double currentRtt();

  @JsProperty
  void setCurrentRtt(double currentRtt);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats currentRtt(final double currentRtt) {
    setCurrentRtt( currentRtt );
    return this;
  }

  @JsProperty(
      name = "priority"
  )
  int priority();

  @JsProperty
  void setPriority(int priority);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats priority(final int priority) {
    setPriority( priority );
    return this;
  }

  @JsProperty(
      name = "totalRtt"
  )
  double totalRtt();

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
