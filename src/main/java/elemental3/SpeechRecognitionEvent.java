package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechRecognitionEvent interface of the Web Speech API represents the event object for the result and nomatch events, and contains all the data associated with an interim or final speech recognition result.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionEvent">SpeechRecognitionEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechRecognitionEvent extends Event {
  public SpeechRecognitionEvent(@Nonnull final String type,
      @Nonnull final SpeechRecognitionEventInit eventInitDict) {
    super( null );
  }

  /**
   * The resultIndex read-only property of the SpeechRecognitionEvent interface returns the lowest index value result in the SpeechRecognitionResultList "array" that has actually changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionEvent/resultIndex">SpeechRecognitionEvent.resultIndex - MDN</a>
   */
  @JsProperty(
      name = "resultIndex"
  )
  public native int resultIndex();

  /**
   * The results read-only property of the SpeechRecognitionEvent interface returns a SpeechRecognitionResultList object representing all the speech recognition results for the current session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionEvent/results">SpeechRecognitionEvent.results - MDN</a>
   */
  @JsProperty(
      name = "results"
  )
  @Nonnull
  public native SpeechRecognitionResultList results();
}
