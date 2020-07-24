package elemental3;

import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Crypto"
)
public class Crypto {
  Crypto() {
  }

  @JsProperty(
      name = "subtle"
  )
  @Nonnull
  public native SubtleCrypto subtle();

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull ArrayBufferView array);

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Int8Array array);

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Int16Array array);

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Int32Array array);

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Uint8Array array);

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Uint16Array array);

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Uint32Array array);

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Uint8ClampedArray array);

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Float32Array array);

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Float64Array array);

  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull DataView array);
}
