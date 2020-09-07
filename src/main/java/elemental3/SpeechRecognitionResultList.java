package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechRecognitionResultList interface of the Web Speech API represents a list of SpeechRecognitionResult objects, or a single one if results are being captured in continuous mode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResultList">SpeechRecognitionResultList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechRecognitionResultList {
  SpeechRecognitionResultList() {
  }

  /**
   * The length read-only property of the SpeechRecognitionResultList interface returns the length of the &quot;array&quot; &mdash; the number of SpeechRecognitionResult objects in the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResultList/length">SpeechRecognitionResultList.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The item getter of the SpeechRecognitionResultList interface is a standard getter &mdash; it allows SpeechRecognitionResult objects in the list to be accessed via array syntax.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResultList/item">SpeechRecognitionResultList.item - MDN</a>
   */
  @Nonnull
  public native SpeechRecognitionResult item(int index);
}
