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
    name = "CloseEvent"
)
public class CloseEvent extends Event {
  public CloseEvent(@Nonnull final String type, @Nonnull final CloseEventInit eventInitDict) {
    super( null );
  }

  public CloseEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "code"
  )
  public native int code();

  @JsProperty(
      name = "reason"
  )
  @Nonnull
  public native String reason();

  @JsProperty(
      name = "wasClean"
  )
  public native boolean wasClean();
}
