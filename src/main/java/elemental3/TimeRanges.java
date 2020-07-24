package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TimeRanges"
)
public class TimeRanges {
  TimeRanges() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  public native double end(int index);

  public native double start(int index);
}
