package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechRecognitionResult {
  SpeechRecognitionResult() {
  }

  @JsProperty(
      name = "isFinal"
  )
  public native boolean isFinal();

  @JsProperty(
      name = "length"
  )
  public native int length();
}
