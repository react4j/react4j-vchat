package elemental3;

import elemental2.core.ArrayBuffer;
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
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaKeyStatusMap"
)
public class MediaKeyStatusMap {
  MediaKeyStatusMap() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  @Nullable
  public native Any get(@Nonnull BufferSource keyId);

  @Nullable
  public native Any get(@Nonnull ArrayBufferView keyId);

  @Nullable
  public native Any get(@Nonnull Int8Array keyId);

  @Nullable
  public native Any get(@Nonnull Int16Array keyId);

  @Nullable
  public native Any get(@Nonnull Int32Array keyId);

  @Nullable
  public native Any get(@Nonnull Uint8Array keyId);

  @Nullable
  public native Any get(@Nonnull Uint16Array keyId);

  @Nullable
  public native Any get(@Nonnull Uint32Array keyId);

  @Nullable
  public native Any get(@Nonnull Uint8ClampedArray keyId);

  @Nullable
  public native Any get(@Nonnull Float32Array keyId);

  @Nullable
  public native Any get(@Nonnull Float64Array keyId);

  @Nullable
  public native Any get(@Nonnull DataView keyId);

  @Nullable
  public native Any get(@Nonnull ArrayBuffer keyId);

  public native boolean has(@Nonnull BufferSource keyId);

  public native boolean has(@Nonnull ArrayBufferView keyId);

  public native boolean has(@Nonnull Int8Array keyId);

  public native boolean has(@Nonnull Int16Array keyId);

  public native boolean has(@Nonnull Int32Array keyId);

  public native boolean has(@Nonnull Uint8Array keyId);

  public native boolean has(@Nonnull Uint16Array keyId);

  public native boolean has(@Nonnull Uint32Array keyId);

  public native boolean has(@Nonnull Uint8ClampedArray keyId);

  public native boolean has(@Nonnull Float32Array keyId);

  public native boolean has(@Nonnull Float64Array keyId);

  public native boolean has(@Nonnull DataView keyId);

  public native boolean has(@Nonnull ArrayBuffer keyId);
}
