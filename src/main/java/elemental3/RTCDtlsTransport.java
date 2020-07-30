package elemental3;

import elemental2.core.ArrayBuffer;
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
    name = "RTCDtlsTransport"
)
public class RTCDtlsTransport extends EventTarget {
  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onstatechange;

  RTCDtlsTransport() {
  }

  @JsProperty(
      name = "iceTransport"
  )
  @Nonnull
  public native RTCIceTransport iceTransport();

  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  @Nonnull
  public native JsArray<ArrayBuffer> getRemoteCertificates();
}
