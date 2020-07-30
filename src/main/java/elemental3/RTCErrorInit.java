package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCErrorInit {
  @JsOverlay
  @Nonnull
  static RTCErrorInit create(@Nonnull final String errorDetail) {
    return Js.<RTCErrorInit>uncheckedCast( JsPropertyMap.of() ).errorDetail( errorDetail );
  }

  @JsProperty
  @Nonnull
  String getErrorDetail();

  @JsProperty
  void setErrorDetail(@Nonnull String errorDetail);

  @JsOverlay
  @Nonnull
  default RTCErrorInit errorDetail(@Nonnull final String errorDetail) {
    setErrorDetail( errorDetail );
    return this;
  }

  @JsProperty
  int getReceivedAlert();

  @JsProperty
  void setReceivedAlert(int receivedAlert);

  @JsOverlay
  @Nonnull
  default RTCErrorInit receivedAlert(final int receivedAlert) {
    setReceivedAlert( receivedAlert );
    return this;
  }

  @JsProperty
  int getSctpCauseCode();

  @JsProperty
  void setSctpCauseCode(int sctpCauseCode);

  @JsOverlay
  @Nonnull
  default RTCErrorInit sctpCauseCode(final int sctpCauseCode) {
    setSctpCauseCode( sctpCauseCode );
    return this;
  }

  @JsProperty
  int getSdpLineNumber();

  @JsProperty
  void setSdpLineNumber(int sdpLineNumber);

  @JsOverlay
  @Nonnull
  default RTCErrorInit sdpLineNumber(final int sdpLineNumber) {
    setSdpLineNumber( sdpLineNumber );
    return this;
  }

  @JsProperty
  int getSentAlert();

  @JsProperty
  void setSentAlert(int sentAlert);

  @JsOverlay
  @Nonnull
  default RTCErrorInit sentAlert(final int sentAlert) {
    setSentAlert( sentAlert );
    return this;
  }
}
