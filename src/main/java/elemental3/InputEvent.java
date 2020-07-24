package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "InputEvent"
)
public class InputEvent extends UIEvent {
  InputEvent() {
  }

  @JsProperty(
      name = "data"
  )
  @Nullable
  public native String data();

  @JsProperty(
      name = "inputType"
  )
  @Nonnull
  public native String inputType();

  @JsProperty(
      name = "isComposing"
  )
  public native boolean isComposing();
}
