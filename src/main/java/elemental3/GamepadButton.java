package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GamepadButton"
)
public class GamepadButton {
  GamepadButton() {
  }

  @JsProperty(
      name = "pressed"
  )
  public native boolean pressed();

  @JsProperty(
      name = "touched"
  )
  public native boolean touched();

  @JsProperty(
      name = "value"
  )
  public native double value();
}
