package elemental3.web_assembly;

import elemental3.GlobalDescriptor;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.Global"
)
public class Global {
  @Nullable
  public Any value;

  public Global(@Nonnull final GlobalDescriptor descriptor, @Nullable final Any v) {
  }

  public Global(@Nonnull final GlobalDescriptor descriptor) {
  }

  @Nullable
  public native Any valueOf();
}
