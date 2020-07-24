package elemental3;

import elemental2.core.JsArray;
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
    name = "Performance"
)
public class Performance extends EventTarget {
  @Nullable
  public EventHandler onresourcetimingbufferfull;

  Performance() {
  }

  @JsProperty(
      name = "timeOrigin"
  )
  public native double timeOrigin();

  @JsProperty(
      name = "navigation"
  )
  @Nonnull
  public native PerformanceNavigation navigation();

  @JsProperty(
      name = "timing"
  )
  @Nonnull
  public native PerformanceTiming timing();

  public native double now();

  @Nonnull
  public native Object toJSON();

  @Nonnull
  public native JsArray<PerformanceEntry> getEntries();

  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByName(@Nonnull String name,
      @Nonnull String type);

  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByName(@Nonnull String name);

  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByType(@Nonnull String type);

  public native void clearResourceTimings();

  public native void setResourceTimingBufferSize(int maxSize);

  public native void clearMarks(@Nonnull String markName);

  public native void clearMarks();

  public native void clearMeasures(@Nonnull String measureName);

  public native void clearMeasures();

  public native void mark(@Nonnull String markName);

  public native void measure(@Nonnull String measureName, @Nonnull String startMark,
      @Nonnull String endMark);

  public native void measure(@Nonnull String measureName, @Nonnull String startMark);

  public native void measure(@Nonnull String measureName);
}
