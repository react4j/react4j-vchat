package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The SpeechGrammar interface of the Web Speech API represents a set of words or patterns of words that we want the recognition service to recognize.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammar">SpeechGrammar - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechGrammar {
  /**
   * The src property of the SpeechGrammar interface sets and returns a string containing the grammar from within in the SpeechGrammar object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammar/src">SpeechGrammar.src - MDN</a>
   */
  @Nonnull
  public String src;

  /**
   * The optional weight property of the SpeechGrammar interface sets and returns the weight of the SpeechGrammar object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammar/weight">SpeechGrammar.weight - MDN</a>
   */
  public float weight;

  SpeechGrammar() {
  }
}
