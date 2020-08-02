package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCDTMFToneChangeEvent interface represents events sent to indicate that DTMF tones have started or finished playing. This interface is used by the tonechange event.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDTMFToneChangeEvent">RTCDTMFToneChangeEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCDTMFToneChangeEvent"
)
public class RTCDTMFToneChangeEvent extends Event {
  public RTCDTMFToneChangeEvent(@Nonnull final String type,
      @Nonnull final RTCDTMFToneChangeEventInit eventInitDict) {
    super( null );
  }

  public RTCDTMFToneChangeEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The read-only property RTCDTMFToneChangeEvent.tone returns the DTMF character which has just begun to play, or an empty string (""). if all queued tones have finished playing (that is, RTCDTMFSender.toneBuffer is empty).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDTMFToneChangeEvent/tone">RTCDTMFToneChangeEvent.tone - MDN</a>
   */
  @JsProperty(
      name = "tone"
  )
  @Nonnull
  public native String tone();
}
