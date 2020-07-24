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
    name = "PerformanceEntry"
)
public class PerformanceEntry {
  PerformanceEntry() {
  }

  @JsProperty(
      name = "duration"
  )
  public native double duration();

  @JsProperty(
      name = "entryType"
  )
  @Nonnull
  public native String entryType();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @JsProperty(
      name = "startTime"
  )
  public native double startTime();

  @Nonnull
  public native Object toJSON();
}
