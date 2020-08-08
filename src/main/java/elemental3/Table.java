package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.Table"
)
public class Table {
  public Table(@Nonnull final TableDescriptor descriptor) {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native Function get(int index);

  public native int grow(int delta);

  public native void set(int index, @Nullable Function value);
}
