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
    name = "XRReferenceSpaceEvent"
)
public class XRReferenceSpaceEvent extends Event {
  public XRReferenceSpaceEvent(@Nonnull final String type,
      @Nonnull final XRReferenceSpaceEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "referenceSpace"
  )
  @Nonnull
  public native XRReferenceSpace referenceSpace();

  @JsProperty(
      name = "transform"
  )
  @Nullable
  public native XRRigidTransform transform();
}
