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
    name = "AbortController"
)
public class AbortController {
  public AbortController() {
  }

  @JsProperty(
      name = "signal"
  )
  @Nonnull
  public native AbortSignal signal();

  public native void abort();
}
