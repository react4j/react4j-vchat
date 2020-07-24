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
public interface EcKeyImportParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static EcKeyImportParams create(@Nonnull final String name, @Nonnull final String namedCurve) {
    return Js.<EcKeyImportParams>uncheckedCast( JsPropertyMap.of() ).name( name ).namedCurve( namedCurve );
  }

  @JsProperty
  @Nonnull
  String getNamedCurve();

  @JsProperty
  void setNamedCurve(@Nonnull String namedCurve);

  @JsOverlay
  @Nonnull
  default EcKeyImportParams namedCurve(@Nonnull final String namedCurve) {
    setNamedCurve( namedCurve );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default EcKeyImportParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
