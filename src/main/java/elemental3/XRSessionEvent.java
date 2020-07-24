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
    name = "XRSessionEvent"
)
public class XRSessionEvent extends Event {
  public XRSessionEvent(@Nonnull final String type,
      @Nonnull final XRSessionEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "session"
  )
  @Nonnull
  public native XRSession session();
}
