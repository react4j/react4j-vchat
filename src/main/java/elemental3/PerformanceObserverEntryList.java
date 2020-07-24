package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceObserverEntryList"
)
public class PerformanceObserverEntryList {
  PerformanceObserverEntryList() {
  }

  @Nonnull
  public native JsArray<PerformanceEntry> getEntries();

  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByName(@Nonnull String name,
      @Nonnull String type);

  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByName(@Nonnull String name);

  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByType(@Nonnull String type);
}
