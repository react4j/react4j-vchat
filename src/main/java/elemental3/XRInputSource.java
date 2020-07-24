package elemental3;

import elemental2.core.JsArray;
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
    name = "XRInputSource"
)
public class XRInputSource {
  XRInputSource() {
  }

  @JsProperty(
      name = "gripSpace"
  )
  @Nullable
  public native XRSpace gripSpace();

  @JsProperty(
      name = "handedness"
  )
  @Nonnull
  public native String handedness();

  @JsProperty(
      name = "profiles"
  )
  @Nonnull
  public native JsArray<String> profiles();

  @JsProperty(
      name = "targetRayMode"
  )
  @Nonnull
  public native String targetRayMode();

  @JsProperty(
      name = "targetRaySpace"
  )
  @Nonnull
  public native XRSpace targetRaySpace();
}
