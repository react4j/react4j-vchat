package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRReferenceSpace"
)
public class XRReferenceSpace extends XRSpace {
  @Nullable
  public EventHandler onreset;

  XRReferenceSpace() {
  }

  @Nonnull
  public native XRReferenceSpace getOffsetReferenceSpace(@Nonnull XRRigidTransform originOffset);
}
