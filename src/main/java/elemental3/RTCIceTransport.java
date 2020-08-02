package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCIceTransport interface provides access to information about the ICE transport layer over which the data is being sent and received.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport">RTCIceTransport - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIceTransport"
)
public class RTCIceTransport extends EventTarget {
  @Nullable
  public EventHandler ongatheringstatechange;

  @Nullable
  public EventHandler onselectedcandidatepairchange;

  @Nullable
  public EventHandler onstatechange;

  RTCIceTransport() {
  }

  /**
   * The read-only RTCIceTransport property component specifies whether the object is serving to transport RTP or RTCP. The value is one of the strings in RTCIceComponent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/component">RTCIceTransport.component - MDN</a>
   */
  @JsProperty(
      name = "component"
  )
  @Nonnull
  public native String component();

  /**
   * The read-only RTCIceTransport property gatheringState returns a DOMString from the enumerated type RTCIceGathererState that indicates what gathering state the ICE agent is currently in: "new", "gathering", or "complete".
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/gatheringState">RTCIceTransport.gatheringState - MDN</a>
   */
  @JsProperty(
      name = "gatheringState"
  )
  @Nonnull
  public native String gatheringState();

  /**
   * The read-only RTCIceTransport property role indicates which ICE role the transport is fulfilling: that of the controlling agent, or the agent that is being controlled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/role">RTCIceTransport.role - MDN</a>
   */
  @JsProperty(
      name = "role"
  )
  @Nonnull
  public native String role();

  /**
   * The read-only RTCIceTransport property state returns the current state of the ICE transport, so you can determine the state of ICE gathering in which the ICE agent currently is operating.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/state">RTCIceTransport.state - MDN</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  /**
   * The RTCIceTransport method getLocalCandidates() returns an array of RTCIceCandidate objects, one for each of the candidates that have been gathered by the local device during the current ICE agent session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/getLocalCandidates">RTCIceTransport.getLocalCandidates - MDN</a>
   */
  @Nonnull
  public native JsArray<RTCIceCandidate> getLocalCandidates();

  /**
   * The RTCIceTransport method getLocalParameters() returns an RTCIceParameters object which provides information uniquely identifying the local peer for the duration of the ICE session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/getLocalParameters">RTCIceTransport.getLocalParameters - MDN</a>
   */
  @Nullable
  public native RTCIceParameters getLocalParameters();

  /**
   * The RTCIceTransport method getRemoteCandidates() returns an array which contains one RTCIceCandidate for each of the candidates that have been received from the remote peer so far during the current ICE gathering session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/getRemoteCandidates">RTCIceTransport.getRemoteCandidates - MDN</a>
   */
  @Nonnull
  public native JsArray<RTCIceCandidate> getRemoteCandidates();

  /**
   * The RTCIceTransport method getRemoteParameters() returns an RTCIceParameters object which provides information uniquely identifying the remote peer for the duration of the ICE session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/getRemoteParameters">RTCIceTransport.getRemoteParameters - MDN</a>
   */
  @Nullable
  public native RTCIceParameters getRemoteParameters();

  /**
   * The RTCIceTransport method getSelectedCandidatePair() returns an RTCIceCandidatePair object containing the current best-choice pair of ICE candidates describing the configuration of the endpoints of the transport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/getSelectedCandidatePair">RTCIceTransport.getSelectedCandidatePair - MDN</a>
   */
  @Nullable
  public native RTCIceCandidatePair getSelectedCandidatePair();
}
