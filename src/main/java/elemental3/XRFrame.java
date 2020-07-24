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
    name = "XRFrame"
)
public class XRFrame {
  XRFrame() {
  }

  @JsProperty(
      name = "session"
  )
  @Nonnull
  public native XRSession session();

  @Nullable
  public native XRPose getPose(@Nonnull XRSpace space, @Nonnull XRSpace baseSpace);

  @Nullable
  public native XRViewerPose getViewerPose(@Nonnull XRReferenceSpace referenceSpace);
}
