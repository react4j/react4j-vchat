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
    name = "Plugin"
)
public class Plugin {
  Plugin() {
  }

  @JsProperty(
      name = "description"
  )
  @Nonnull
  public native String description();

  @JsProperty(
      name = "filename"
  )
  @Nonnull
  public native String filename();

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();
}
