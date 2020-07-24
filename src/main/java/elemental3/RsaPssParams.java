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
public interface RsaPssParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static RsaPssParams create(@Nonnull final String name, final int saltLength) {
    return Js.<RsaPssParams>uncheckedCast( JsPropertyMap.of() ).name( name ).saltLength( saltLength );
  }

  @JsProperty
  int getSaltLength();

  @JsProperty
  void setSaltLength(int saltLength);

  @JsOverlay
  @Nonnull
  default RsaPssParams saltLength(final int saltLength) {
    setSaltLength( saltLength );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RsaPssParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
