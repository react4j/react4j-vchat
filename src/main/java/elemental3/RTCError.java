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
    name = "RTCError"
)
public class RTCError extends DOMException {
  public RTCError(@Nonnull final RTCErrorInit init, @Nonnull final String message) {
  }

  public RTCError(@Nonnull final RTCErrorInit init) {
  }

  @JsProperty(
      name = "errorDetail"
  )
  @Nonnull
  public native String errorDetail();

  @JsProperty(
      name = "receivedAlert"
  )
  @Nullable
  public native Double receivedAlert();

  @JsProperty(
      name = "sctpCauseCode"
  )
  @Nullable
  public native Double sctpCauseCode();

  @JsProperty(
      name = "sdpLineNumber"
  )
  @Nullable
  public native Double sdpLineNumber();

  @JsProperty(
      name = "sentAlert"
  )
  @Nullable
  public native Double sentAlert();
}
