package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRBoundedReferenceSpace"
)
public class XRBoundedReferenceSpace extends XRReferenceSpace {
  XRBoundedReferenceSpace() {
  }

  @JsProperty(
      name = "boundsGeometry"
  )
  @Nonnull
  public native JsArray<DOMPointReadOnly> boundsGeometry();
}
