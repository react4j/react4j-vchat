package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCPeerConnection"
)
public class RTCPeerConnection extends EventTarget {
  @Nullable
  public EventHandler onconnectionstatechange;

  @Nullable
  public EventHandler onicecandidate;

  @Nullable
  public EventHandler onicecandidateerror;

  @Nullable
  public EventHandler oniceconnectionstatechange;

  @Nullable
  public EventHandler onicegatheringstatechange;

  @Nullable
  public EventHandler onnegotiationneeded;

  @Nullable
  public EventHandler onsignalingstatechange;

  @Nullable
  public EventHandler ontrack;

  @Nullable
  public EventHandler ondatachannel;

  public RTCPeerConnection(@Nonnull final RTCConfiguration configuration) {
  }

  public RTCPeerConnection() {
  }

  @JsProperty(
      name = "canTrickleIceCandidates"
  )
  @Nullable
  public native Boolean canTrickleIceCandidates();

  @JsProperty(
      name = "connectionState"
  )
  @Nonnull
  public native String connectionState();

  @JsProperty(
      name = "currentLocalDescription"
  )
  @Nullable
  public native RTCSessionDescription currentLocalDescription();

  @JsProperty(
      name = "currentRemoteDescription"
  )
  @Nullable
  public native RTCSessionDescription currentRemoteDescription();

  @JsProperty(
      name = "iceConnectionState"
  )
  @Nonnull
  public native String iceConnectionState();

  @JsProperty(
      name = "iceGatheringState"
  )
  @Nonnull
  public native String iceGatheringState();

  @JsProperty(
      name = "localDescription"
  )
  @Nullable
  public native RTCSessionDescription localDescription();

  @JsProperty(
      name = "pendingLocalDescription"
  )
  @Nullable
  public native RTCSessionDescription pendingLocalDescription();

  @JsProperty(
      name = "pendingRemoteDescription"
  )
  @Nullable
  public native RTCSessionDescription pendingRemoteDescription();

  @JsProperty(
      name = "remoteDescription"
  )
  @Nullable
  public native RTCSessionDescription remoteDescription();

  @JsProperty(
      name = "signalingState"
  )
  @Nonnull
  public native String signalingState();

  @JsProperty(
      name = "sctp"
  )
  @Nullable
  public native RTCSctpTransport sctp();

  @Nonnull
  public native Promise<Void> addIceCandidate(@Nonnull RTCIceCandidateInit candidate);

  @Nonnull
  public native Promise<Void> addIceCandidate();

  @Nonnull
  public native Promise<Void> addIceCandidate(@Nonnull RTCIceCandidateInit candidate,
      @Nonnull VoidFunction successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback);

  public native void close();

  @Nonnull
  public native Promise<RTCSessionDescriptionInit> createAnswer(@Nonnull RTCAnswerOptions options);

  @Nonnull
  public native Promise<RTCSessionDescriptionInit> createAnswer();

  @Nonnull
  public native Promise<Void> createAnswer(@Nonnull RTCSessionDescriptionCallback successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback);

  @Nonnull
  public native Promise<RTCSessionDescriptionInit> createOffer(@Nonnull RTCOfferOptions options);

  @Nonnull
  public native Promise<RTCSessionDescriptionInit> createOffer();

  @Nonnull
  public native Promise<Void> createOffer(@Nonnull RTCSessionDescriptionCallback successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback, @Nonnull RTCOfferOptions options);

  @Nonnull
  public native Promise<Void> createOffer(@Nonnull RTCSessionDescriptionCallback successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback);

  @Nonnull
  public native RTCConfiguration getConfiguration();

  public native void restartIce();

  public native void setConfiguration(@Nonnull RTCConfiguration configuration);

  public native void setConfiguration();

  @Nonnull
  public native Promise<Void> setLocalDescription(
      @Nonnull RTCLocalSessionDescriptionInit description);

  @Nonnull
  public native Promise<Void> setLocalDescription();

  @Nonnull
  public native Promise<Void> setLocalDescription(
      @Nonnull RTCLocalSessionDescriptionInit description, @Nonnull VoidFunction successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback);

  @Nonnull
  public native Promise<Void> setLocalDescription(
      @Nonnull RTCLocalSessionDescriptionInit description, @Nonnull VoidFunction successCallback);

  @Nonnull
  public native Promise<Void> setRemoteDescription(@Nonnull RTCSessionDescriptionInit description);

  @Nonnull
  public native Promise<Void> setRemoteDescription(@Nonnull RTCSessionDescriptionInit description,
      @Nonnull VoidFunction successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback);

  @Nonnull
  public static native Promise<RTCCertificate> generateCertificate(
      @Nonnull AlgorithmIdentifier keygenAlgorithm);

  @Nonnull
  public static native Promise<RTCCertificate> generateCertificate(@Nonnull Object keygenAlgorithm);

  @Nonnull
  public static native Promise<RTCCertificate> generateCertificate(@Nonnull String keygenAlgorithm);

  @Nonnull
  public native RTCRtpSender addTrack(@Nonnull MediaStreamTrack track,
      @Nonnull MediaStream... streams);

  @Nonnull
  public native RTCRtpTransceiver addTransceiver(@Nonnull MediaStreamTrack trackOrKind,
      @Nonnull RTCRtpTransceiverInit init);

  @Nonnull
  public native RTCRtpTransceiver addTransceiver(@Nonnull String trackOrKind,
      @Nonnull RTCRtpTransceiverInit init);

  @Nonnull
  public native RTCRtpTransceiver addTransceiver(@Nonnull MediaStreamTrack trackOrKind);

  @Nonnull
  public native RTCRtpTransceiver addTransceiver(@Nonnull String trackOrKind);

  @Nonnull
  public native JsArray<RTCRtpReceiver> getReceivers();

  @Nonnull
  public native JsArray<RTCRtpSender> getSenders();

  @Nonnull
  public native JsArray<RTCRtpTransceiver> getTransceivers();

  public native void removeTrack(@Nonnull RTCRtpSender sender);

  @Nonnull
  public native RTCDataChannel createDataChannel(@Nonnull String label,
      @Nonnull RTCDataChannelInit dataChannelDict);

  @Nonnull
  public native RTCDataChannel createDataChannel(@Nonnull String label);

  @Nonnull
  public native Promise<RTCStatsReport> getStats(@Nullable MediaStreamTrack selector);

  @Nonnull
  public native Promise<RTCStatsReport> getStats();
}
