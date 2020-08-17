package elemental3.web_assembly;

import elemental3.GlobalDescriptor;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * A WebAssembly.Global object represents a global variable instance, accessible from both JavaScript and importable/exportable across one or more WebAssembly.Module instances. This allows dynamic linking of multiple modules.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Global">WebAssembly.Global - MDN</a>
 */
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
