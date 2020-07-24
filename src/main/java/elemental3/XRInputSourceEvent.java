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
    name = "XRInputSourceEvent"
)
public class XRInputSourceEvent extends Event {
  public XRInputSourceEvent(@Nonnull final String type,
      @Nonnull final XRInputSourceEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "frame"
  )
  @Nonnull
  public native XRFrame frame();

  @JsProperty(
      name = "inputSource"
  )
  @Nonnull
  public native XRInputSource inputSource();
}
