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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCDataChannel"
)
public class RTCDataChannel extends EventTarget {
  @Nonnull
  public String binaryType;

  public int bufferedAmountLowThreshold;

  @Nullable
  public EventHandler onbufferedamountlow;

  @Nullable
  public EventHandler onclose;

  @Nullable
  public EventHandler onclosing;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onmessage;

  @Nullable
  public EventHandler onopen;

  RTCDataChannel() {
  }

  @JsProperty(
      name = "bufferedAmount"
  )
  public native int bufferedAmount();

  @JsProperty(
      name = "id"
  )
  @Nullable
  public native Double id();

  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  @JsProperty(
      name = "maxPacketLifeTime"
  )
  @Nullable
  public native Double maxPacketLifeTime();

  @JsProperty(
      name = "maxRetransmits"
  )
  @Nullable
  public native Double maxRetransmits();

  @JsProperty(
      name = "negotiated"
  )
  public native boolean negotiated();

  @JsProperty(
      name = "ordered"
  )
  public native boolean ordered();

  @JsProperty(
      name = "protocol"
  )
  @Nonnull
  public native String protocol();

  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  public native String readyState();

  @JsProperty(
      name = "priority"
  )
  @Nonnull
  public native String priority();

  public native void close();

  public native void send(@Nonnull String data);

  public native void send(@Nonnull Blob data);

  public native void send(@Nonnull ArrayBuffer data);

  public native void send(@Nonnull ArrayBufferView data);

  public native void send(@Nonnull Int8Array data);

  public native void send(@Nonnull Int16Array data);

  public native void send(@Nonnull Int32Array data);

  public native void send(@Nonnull Uint8Array data);

  public native void send(@Nonnull Uint16Array data);

  public native void send(@Nonnull Uint32Array data);

  public native void send(@Nonnull Uint8ClampedArray data);

  public native void send(@Nonnull Float32Array data);

  public native void send(@Nonnull Float64Array data);

  public native void send(@Nonnull DataView data);
}
