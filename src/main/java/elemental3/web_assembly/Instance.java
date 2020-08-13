package elemental3.web_assembly;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.Instance"
)
public class Instance {
  public Instance(@Nonnull final Module module, @Nonnull final Object importObject) {
  }

  public Instance(@Nonnull final Module module) {
  }

  @JsProperty(
      name = "exports"
  )
  @Nonnull
  public native Object exports();
}
