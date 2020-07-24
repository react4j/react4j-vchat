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
    name = "CaretPosition"
)
public class CaretPosition {
  CaretPosition() {
  }

  @JsProperty(
      name = "offset"
  )
  public native int offset();

  @JsProperty(
      name = "offsetNode"
  )
  @Nonnull
  public native Node offsetNode();

  @Nullable
  public native DOMRect getClientRect();
}
