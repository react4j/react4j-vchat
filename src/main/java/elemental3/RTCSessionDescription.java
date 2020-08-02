package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCSessionDescription interface describes one end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCSessionDescription">RTCSessionDescription - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCSessionDescription"
)
public class RTCSessionDescription {
  public RTCSessionDescription(@Nonnull final RTCSessionDescriptionInit descriptionInitDict) {
  }

  @JsProperty(
      name = "sdp"
  )
  @Nonnull
  public native String sdp();

  /**
   * The property RTCSessionDescription.type is a read-only value of type RTCSdpType which describes the description's type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCSessionDescription/type">RTCSessionDescription.type - MDN</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  /**
   * The RTCSessionDescription.toJSON() method generates a JSON description of the object. Both properties, type and sdp, are contained in the generated JSON.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCSessionDescription/toJSON">RTCSessionDescription.toJSON - MDN</a>
   */
  @Nonnull
  public native Object toJSON();
}
