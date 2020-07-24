package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechRecognition extends EventTarget {
  public boolean continuous;

  @Nonnull
  public SpeechGrammarList grammars;

  public boolean interimResults;

  @Nonnull
  public String lang;

  public int maxAlternatives;

  @Nullable
  public EventHandler onaudioend;

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

  public native void abort();

  public native void start();

  public native void stop();
}
