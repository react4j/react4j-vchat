package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class Position {
  Position() {
  }

  @JsProperty(
      name = "coords"
  )
  @Nonnull
  public native Coordinates coords();

  @JsProperty(
      name = "timestamp"
  )
  public native int timestamp();
}
