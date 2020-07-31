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
public interface RTCDtlsFingerprint {
  @JsOverlay
  @Nonnull
  static RTCDtlsFingerprint create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getAlgorithm();

  @JsProperty
  void setAlgorithm(@Nonnull String algorithm);

  @JsOverlay
  @Nonnull
  default RTCDtlsFingerprint algorithm(@Nonnull final String algorithm) {
    setAlgorithm( algorithm );
    return this;
  }

  @JsProperty
  String getValue();

  @JsProperty
  void setValue(@Nonnull String value);

  @JsOverlay
  @Nonnull
  default RTCDtlsFingerprint value(@Nonnull final String value) {
    setValue( value );
    return this;
  }
}