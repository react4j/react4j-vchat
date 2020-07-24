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
    name = "PerformanceResourceTiming"
)
public class PerformanceResourceTiming extends PerformanceEntry {
  PerformanceResourceTiming() {
  }

  @JsProperty(
      name = "connectEnd"
  )
  public native double connectEnd();

  @JsProperty(
      name = "connectStart"
  )
  public native double connectStart();

  @JsProperty(
      name = "decodedBodySize"
  )
  public native int decodedBodySize();

  @JsProperty(
      name = "domainLookupEnd"
  )
  public native double domainLookupEnd();

  @JsProperty(
      name = "domainLookupStart"
  )
  public native double domainLookupStart();

  @JsProperty(
      name = "encodedBodySize"
  )
  public native int encodedBodySize();

  @JsProperty(
      name = "fetchStart"
  )
  public native double fetchStart();

  @JsProperty(
      name = "initiatorType"
  )
  @Nonnull
  public native String initiatorType();

  @JsProperty(
      name = "nextHopProtocol"
  )
  @Nonnull
  public native String nextHopProtocol();

  @JsProperty(
      name = "redirectEnd"
  )
  public native double redirectEnd();

  @JsProperty(
      name = "redirectStart"
  )
  public native double redirectStart();

  @JsProperty(
      name = "requestStart"
  )
  public native double requestStart();

  @JsProperty(
      name = "responseEnd"
  )
  public native double responseEnd();

  @JsProperty(
      name = "responseStart"
  )
  public native double responseStart();

  @JsProperty(
      name = "secureConnectionStart"
  )
  public native double secureConnectionStart();

  @JsProperty(
      name = "transferSize"
  )
  public native int transferSize();

  @JsProperty(
      name = "workerStart"
  )
  public native double workerStart();

  @Nonnull
  public native Object toJSON();
}
