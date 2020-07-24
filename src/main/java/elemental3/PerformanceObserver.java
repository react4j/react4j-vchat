package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceObserver"
)
public class PerformanceObserver {
  public PerformanceObserver(@Nonnull final PerformanceObserverCallback callback) {
  }

  @JsProperty(
      name = "supportedEntryTypes"
  )
  @Nonnull
  public native JsArray<String> supportedEntryTypes();

  public native void disconnect();

  public native void observe(@Nonnull PerformanceObserverInit options);

  public native void observe();

  @Nonnull
  public native JsArray<PerformanceEntry> takeRecords();
}
