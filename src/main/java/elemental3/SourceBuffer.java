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
    name = "SourceBuffer"
)
public class SourceBuffer extends EventTarget {
  public double appendWindowEnd;

  public double appendWindowStart;

  @Nonnull
  public String mode;

  @Nullable
  public EventHandler onabort;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onupdate;

  @Nullable
  public EventHandler onupdateend;

  @Nullable
  public EventHandler onupdatestart;

  public double timestampOffset;

  SourceBuffer() {
  }

  @JsProperty(
      name = "audioTracks"
  )
  @Nonnull
  public native AudioTrackList audioTracks();

  @JsProperty(
      name = "buffered"
  )
  @Nonnull
  public native TimeRanges buffered();

  @JsProperty(
      name = "textTracks"
  )
  @Nonnull
  public native TextTrackList textTracks();

  @JsProperty(
      name = "updating"
  )
  public native boolean updating();

  @JsProperty(
      name = "videoTracks"
  )
  @Nonnull
  public native VideoTrackList videoTracks();

  public native void abort();

  public native void appendBuffer(@Nonnull BufferSource data);

  public native void appendBuffer(@Nonnull ArrayBufferView data);

  public native void appendBuffer(@Nonnull Int8Array data);

  public native void appendBuffer(@Nonnull Int16Array data);

  public native void appendBuffer(@Nonnull Int32Array data);

  public native void appendBuffer(@Nonnull Uint8Array data);

  public native void appendBuffer(@Nonnull Uint16Array data);

  public native void appendBuffer(@Nonnull Uint32Array data);

  public native void appendBuffer(@Nonnull Uint8ClampedArray data);

  public native void appendBuffer(@Nonnull Float32Array data);

  public native void appendBuffer(@Nonnull Float64Array data);

  public native void appendBuffer(@Nonnull DataView data);

  public native void appendBuffer(@Nonnull ArrayBuffer data);

  public native void remove(double start, double end);
}
