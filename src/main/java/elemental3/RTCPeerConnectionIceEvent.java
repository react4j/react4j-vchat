package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCPeerConnectionIceEvent interface represents events that occurs in relation to ICE candidates with the target, usually an RTCPeerConnection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnectionIceEvent">RTCPeerConnectionIceEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCPeerConnectionIceEvent"
)
public class RTCPeerConnectionIceEvent extends Event {
  public RTCPeerConnectionIceEvent(@Nonnull final String type,
      @Nonnull final RTCPeerConnectionIceEventInit eventInitDict) {
    super( null );
  }

  public RTCPeerConnectionIceEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The read-only candidate property of the RTCPeerConnectionIceEvent interface returns the RTCIceCandidate associated with the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnectionIceEvent/candidate">RTCPeerConnectionIceEvent.candidate - MDN</a>
   */
  @JsProperty(
      name = "candidate"
  )
  @Nullable
  public native RTCIceCandidate candidate();

  @JsProperty(
      name = "url"
  )
  @Nullable
  public native String url();
}
