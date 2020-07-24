package elemental3;

import elemental2.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRView"
)
public class XRView {
  XRView() {
  }

  @JsProperty(
      name = "eye"
  )
  @Nonnull
  public native String eye();

  @JsProperty(
      name = "projectionMatrix"
  )
  @Nonnull
  public native Float32Array projectionMatrix();

  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native XRRigidTransform transform();
}
