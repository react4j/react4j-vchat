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
  WebGLContextEvent() {
    super( null );
  }

  @JsProperty(
      name = "statusMessage"
  )
  @Nonnull
  public native String statusMessage();
}
