package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceNavigationTiming"
)
public class PerformanceNavigationTiming extends PerformanceResourceTiming {
  PerformanceNavigationTiming() {
  }

  @JsProperty(
      name = "domComplete"
  )
  public native double domComplete();

  @JsProperty(
      name = "domContentLoadedEventEnd"
  )
  public native double domContentLoadedEventEnd();

  @JsProperty(
      name = "domContentLoadedEventStart"
  )
  public native double domContentLoadedEventStart();

  @JsProperty(
      name = "domInteractive"
  )
  public native double domInteractive();

  @JsProperty(
      name = "loadEventEnd"
  )
  public native double loadEventEnd();

  @JsProperty(
      name = "loadEventStart"
  )
  public native double loadEventStart();

  @JsProperty(
      name = "redirectCount"
  )
  public native int redirectCount();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @JsProperty(
      name = "unloadEventEnd"
  )
  public native double unloadEventEnd();

  @JsProperty(
      name = "unloadEventStart"
  )
  public native double unloadEventStart();

  @Nonnull
  public native Object toJSON();
}
