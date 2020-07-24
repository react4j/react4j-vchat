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
    name = "XRInputSourcesChangeEvent"
)
public class XRInputSourcesChangeEvent extends Event {
  public XRInputSourcesChangeEvent(@Nonnull final String type,
      @Nonnull final XRInputSourcesChangeEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "added"
  )
  @Nonnull
  public native JsArray<XRInputSource> added();

  @JsProperty(
      name = "removed"
  )
  @Nonnull
  public native JsArray<XRInputSource> removed();

  @JsProperty(
      name = "session"
  )
  @Nonnull
  public native XRSession session();
}
