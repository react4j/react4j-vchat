package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The SpeechRecognition interface of the Web Speech API is the controller interface for the recognition service; this also handles the SpeechRecognitionEvent sent from the recognition service.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition">SpeechRecognition - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechRecognition extends EventTarget {
  /**
   * The continuous property of the SpeechRecognition interface controls whether continuous results are returned for each recognition, or only a single result.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/continuous">SpeechRecognition.continuous - MDN</a>
   */
  public boolean continuous;

  /**
   * The grammars property of the SpeechRecognition interface returns and sets a collection of SpeechGrammar objects that represent the grammars that will be understood by the current SpeechRecognition.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/grammars">SpeechRecognition.grammars - MDN</a>
   */
  @Nonnull
  public SpeechGrammarList grammars;

  /**
   * The interimResults property of the SpeechRecognition interface controls whether interim results should be returned (true) or not (false.) Interim results are results that are not yet final (e.g. the SpeechRecognitionResult.isFinal property is false.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/interimResults">SpeechRecognition.interimResults - MDN</a>
   */
  public boolean interimResults;

  /**
   * The lang property of the SpeechRecognition interface returns and sets the language of the current SpeechRecognition. If not specified, this defaults to the HTML lang attribute value, or the user agent's language setting if that isn't set either.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/lang">SpeechRecognition.lang - MDN</a>
   */
  @Nonnull
  public String lang;

  /**
   * The maxAlternatives property of the SpeechRecognition interface sets the maximum number of SpeechRecognitionAlternatives provided per SpeechRecognitionResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/maxAlternatives">SpeechRecognition.maxAlternatives - MDN</a>
   */
  public int maxAlternatives;

  /**
   * The onaudioend property of the SpeechRecognition interface represents an event handler that will run when the user agent has finished capturing audio (when the audioend event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onaudioend">SpeechRecognition.onaudioend - MDN</a>
   */
  @Nullable
  public EventHandler onaudioend;

  /**
   * The onaudiostart property of the SpeechRecognition interface represents an event handler that will run when the user agent has started to capture audio (when the audiostart event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onaudiostart">SpeechRecognition.onaudiostart - MDN</a>
   */
  @Nullable
  public EventHandler onaudiostart;

  @Nullable
  public EventHandler onend;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onnomatch;

  @Nullable
  public EventHandler onresult;

  @Nullable
  public EventHandler onsoundend;

  @Nullable
  public EventHandler onsoundstart;

  @Nullable
  public EventHandler onspeechend;

  @Nullable
  public EventHandler onspeechstart;

  @Nullable
  public EventHandler onstart;

  public SpeechRecognition() {
  }

  /**
   * The abort() method of the Web Speech API stops the speech recognition service from listening to incoming audio, and doesn't attempt to return a SpeechRecognitionResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/abort">SpeechRecognition.abort - MDN</a>
   */
  public native void abort();

  /**
   * The start() method of the Web Speech API starts the speech recognition service listening to incoming audio with intent to recognize grammars associated with the current SpeechRecognition.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/start">SpeechRecognition.start - MDN</a>
   */
  public native void start();

  /**
   * The stop() method of the Web Speech API stops the speech recognition service from listening to incoming audio, and attempts to return a SpeechRecognitionResult using the audio captured so far.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/stop">SpeechRecognition.stop - MDN</a>
   */
  public native void stop();

  @JsOverlay
  public void addAudioendListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "audioend", Js.cast( callback ), options );
  }

  @JsOverlay
  public void addAudioendListener(@Nonnull final EventListener callback, final boolean options) {
    addEventListener( "audioend", Js.cast( callback ), options );
  }

  @JsOverlay
  public void addAudioendListener(@Nonnull final EventListener callback) {
    addEventListener( "audioend", Js.cast( callback ) );
  }

  @JsOverlay
  public void removeAudioendListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "audioend", Js.cast( callback ), options );
  }

  @JsOverlay
  public void removeAudioendListener(@Nonnull final EventListener callback, final boolean options) {
    removeEventListener( "audioend", Js.cast( callback ), options );
  }

  @JsOverlay
  public void removeAudioendListener(@Nonnull final EventListener callback) {
    removeEventListener( "audioend", Js.cast( callback ) );
  }

  @JsOverlay
  public void addAudiostartListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "audiostart", Js.cast( callback ), options );
  }

  @JsOverlay
  public void addAudiostartListener(@Nonnull final EventListener callback, final boolean options) {
    addEventListener( "audiostart", Js.cast( callback ), options );
  }

  @JsOverlay
  public void addAudiostartListener(@Nonnull final EventListener callback) {
    addEventListener( "audiostart", Js.cast( callback ) );
  }

  @JsOverlay
  public void removeAudiostartListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "audiostart", Js.cast( callback ), options );
  }

  @JsOverlay
  public void removeAudiostartListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "audiostart", Js.cast( callback ), options );
  }

  @JsOverlay
  public void removeAudiostartListener(@Nonnull final EventListener callback) {
    removeEventListener( "audiostart", Js.cast( callback ) );
  }
}
