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
public interface HmacKeyGenParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static HmacKeyGenParams create(@Nonnull final String name,
      @Nonnull final AlgorithmIdentifier hash) {
    return Js.<HmacKeyGenParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash );
  }

  @JsOverlay
  @Nonnull
  static HmacKeyGenParams create(@Nonnull final String name, @Nonnull final Object hash) {
    return Js.<HmacKeyGenParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash );
  }

  @JsOverlay
  @Nonnull
  static HmacKeyGenParams create(@Nonnull final String name, @Nonnull final String hash) {
    return Js.<HmacKeyGenParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash );
  }

  @JsProperty
  @Nonnull
  AlgorithmIdentifier getHash();

  @JsProperty
  void setHash(@Nonnull AlgorithmIdentifier hash);

  @JsOverlay
  @Nonnull
  default HmacKeyGenParams hash(@Nonnull final AlgorithmIdentifier hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  default void setHash(@Nonnull final Object hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  @Nonnull
  default HmacKeyGenParams hash(@Nonnull final Object hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  default void setHash(@Nonnull final String hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  @Nonnull
  default HmacKeyGenParams hash(@Nonnull final String hash) {
    setHash( hash );
    return this;
  }

  @JsProperty
  int getLength();

  @JsProperty
  void setLength(int length);

  @JsOverlay
  @Nonnull
  default HmacKeyGenParams length(final int length) {
    setLength( length );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default HmacKeyGenParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
