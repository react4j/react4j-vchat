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
    name = "RTCCertificate"
)
public class RTCCertificate {
  RTCCertificate() {
  }

  @JsProperty(
      name = "expires"
  )
  public native int expires();

  @Nonnull
  public native JsArray<RTCDtlsFingerprint> getFingerprints();
}
