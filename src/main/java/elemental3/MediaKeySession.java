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
import elemental2.promise.Promise;
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
    name = "MediaKeySession"
)
public class MediaKeySession extends EventTarget {
  @Nullable
  public EventHandler onkeystatuseschange;

  @Nullable
  public EventHandler onmessage;

  MediaKeySession() {
  }

  @JsProperty(
      name = "closed"
  )
  @Nonnull
  public native Promise<Void> closed();

  @JsProperty(
      name = "expiration"
  )
  public native double expiration();

  @JsProperty(
      name = "keyStatuses"
  )
  @Nonnull
  public native MediaKeyStatusMap keyStatuses();

  @JsProperty(
      name = "sessionId"
  )
  @Nonnull
  public native String sessionId();

  @Nonnull
  public native Promise<Void> close();

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull BufferSource initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull ArrayBufferView initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Int8Array initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Int16Array initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Int32Array initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Uint8Array initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Uint16Array initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Uint32Array initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Uint8ClampedArray initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Float32Array initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Float64Array initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull DataView initData);

  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull ArrayBuffer initData);

  @Nonnull
  public native Promise<Boolean> load(@Nonnull String sessionId);

  @Nonnull
  public native Promise<Void> remove();

  @Nonnull
  public native Promise<Void> update(@Nonnull BufferSource response);

  @Nonnull
  public native Promise<Void> update(@Nonnull ArrayBufferView response);

  @Nonnull
  public native Promise<Void> update(@Nonnull Int8Array response);

  @Nonnull
  public native Promise<Void> update(@Nonnull Int16Array response);

  @Nonnull
  public native Promise<Void> update(@Nonnull Int32Array response);

  @Nonnull
  public native Promise<Void> update(@Nonnull Uint8Array response);

  @Nonnull
  public native Promise<Void> update(@Nonnull Uint16Array response);

  @Nonnull
  public native Promise<Void> update(@Nonnull Uint32Array response);

  @Nonnull
  public native Promise<Void> update(@Nonnull Uint8ClampedArray response);

  @Nonnull
  public native Promise<Void> update(@Nonnull Float32Array response);

  @Nonnull
  public native Promise<Void> update(@Nonnull Float64Array response);

  @Nonnull
  public native Promise<Void> update(@Nonnull DataView response);

  @Nonnull
  public native Promise<Void> update(@Nonnull ArrayBuffer response);
}
