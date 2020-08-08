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
    name = "WebGLContextEvent"
)
public class WebGLContextEvent extends Event {
  public WebGLContextEvent(@Nonnull final String type,
      @Nonnull final WebGLContextEventInit eventInit) {
    super( null );
  }

  public WebGLContextEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "statusMessage"
  )
  @Nonnull
  public native String statusMessage();
}
