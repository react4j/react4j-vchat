package elemental3.web_assembly;

import elemental2.core.ArrayBuffer;
import elemental3.MemoryDescriptor;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.Memory"
)
public class Memory {
  public Memory(@Nonnull final MemoryDescriptor descriptor) {
  }

  @JsProperty(
      name = "buffer"
  )
  @Nonnull
  public native ArrayBuffer buffer();

  public native int grow(int delta);
}
