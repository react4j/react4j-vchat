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
    name = "IntersectionObserver"
)
public class IntersectionObserver {
  public IntersectionObserver(@Nonnull final IntersectionObserverCallback callback,
      @Nonnull final IntersectionObserverInit options) {
  }

  public IntersectionObserver(@Nonnull final IntersectionObserverCallback callback) {
  }

  @JsProperty(
      name = "root"
  )
  @Nullable
  public native Element root();

  @JsProperty(
      name = "rootMargin"
  )
  @Nonnull
  public native String rootMargin();

  @JsProperty(
      name = "thresholds"
  )
  @Nonnull
  public native JsArray<Double> thresholds();

  public native void disconnect();

  public native void observe(@Nonnull Element target);

  @Nonnull
  public native JsArray<IntersectionObserverEntry> takeRecords();

  public native void unobserve(@Nonnull Element target);
}
