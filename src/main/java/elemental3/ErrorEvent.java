package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ErrorEvent"
)
public class ErrorEvent extends Event {
  public ErrorEvent(@Nonnull final String type, @Nonnull final ErrorEventInit eventInitDict) {
    super( null );
  }

  public ErrorEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "colno"
  )
  public native int colno();

  @JsProperty(
      name = "error"
  )
  @Nullable
  public native Any error();

  @JsProperty(
      name = "filename"
  )
  @Nonnull
  public native String filename();

  @JsProperty(
      name = "lineno"
  )
  public native int lineno();

  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();
}
