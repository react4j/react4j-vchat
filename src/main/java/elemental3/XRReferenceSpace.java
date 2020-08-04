package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API's XRReferenceSpace interface describes the coordinate system for a specific tracked entity or object within the virtual world using a specified tracking behavior.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpace">XRReferenceSpace - MDN</a>
 */
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

  /**
   * The XRReferenceSpace interface's getOffsetReferenceSpace() method returns a new reference space object which describes the relative difference in position between the object on which the method is called and a given point in 3D space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpace/getOffsetReferenceSpace">XRReferenceSpace.getOffsetReferenceSpace - MDN</a>
   */
  @Nonnull
  public native XRReferenceSpace getOffsetReferenceSpace(@Nonnull XRRigidTransform originOffset);
}
