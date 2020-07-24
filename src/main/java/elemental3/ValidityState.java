package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ValidityState"
)
public class ValidityState {
  ValidityState() {
  }

  @JsProperty(
      name = "badInput"
  )
  public native boolean badInput();

  @JsProperty(
      name = "customError"
  )
  public native boolean customError();

  @JsProperty(
      name = "patternMismatch"
  )
  public native boolean patternMismatch();

  @JsProperty(
      name = "rangeOverflow"
  )
  public native boolean rangeOverflow();

  @JsProperty(
      name = "rangeUnderflow"
  )
  public native boolean rangeUnderflow();

  @JsProperty(
      name = "stepMismatch"
  )
  public native boolean stepMismatch();

  @JsProperty(
      name = "tooLong"
  )
  public native boolean tooLong();

  @JsProperty(
      name = "tooShort"
  )
  public native boolean tooShort();

  @JsProperty(
      name = "typeMismatch"
  )
  public native boolean typeMismatch();

  @JsProperty(
      name = "valid"
  )
  public native boolean valid();

  @JsProperty(
      name = "valueMissing"
  )
  public native boolean valueMissing();
}
