package elemental3;

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
    name = "RTCSctpTransport"
)
public class RTCSctpTransport extends EventTarget {
  @Nullable
  public EventHandler onstatechange;

  RTCSctpTransport() {
  }

  @JsProperty(
      name = "maxChannels"
  )
  @Nullable
  public native Double maxChannels();

  @JsProperty(
      name = "maxMessageSize"
  )
  public native double maxMessageSize();

  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  @JsProperty(
      name = "transport"
  )
  @Nonnull
  public native RTCDtlsTransport transport();
}
