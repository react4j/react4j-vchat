package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechRecognitionResult interface of the Web Speech API represents a single recognition match, which may contain multiple SpeechRecognitionAlternative objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResult">SpeechRecognitionResult - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechRecognitionResult {
  SpeechRecognitionResult() {
  }

  /**
   * The isFinal read-only property of the SpeechRecognitionResult interface is a Boolean that states whether this result is final (true) or not (false) — if so, then this is the final time this result will be returned; if not, then this result is an interim result, and may be updated later on.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResult/isFinal">SpeechRecognitionResult.isFinal - MDN</a>
   */
  @JsProperty(
      name = "isFinal"
  )
  public native boolean isFinal();

  /**
   * The length read-only property of the SpeechRecognitionResult interface returns the length of the "array" — the number of SpeechRecognitionAlternative objects contained in the result (also referred to as "n-best alternatives".)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResult/length">SpeechRecognitionResult.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();
}
