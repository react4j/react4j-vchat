package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
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
public interface RsaOaepParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static RsaOaepParams create(@Nonnull final String name) {
    return Js.<RsaOaepParams>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty
  BufferSource getLabel();

  @JsProperty
  void setLabel(@Nonnull BufferSource label);

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final BufferSource label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final ArrayBufferView label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final ArrayBufferView label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final Int8Array label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final Int8Array label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final Int16Array label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final Int16Array label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final Int32Array label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final Int32Array label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final Uint8Array label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final Uint8Array label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final Uint16Array label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final Uint16Array label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final Uint32Array label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final Uint32Array label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final Uint8ClampedArray label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final Uint8ClampedArray label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final Float32Array label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final Float32Array label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final Float64Array label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final Float64Array label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final DataView label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final DataView label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  default void setLabel(@Nonnull final ArrayBuffer label) {
    setLabel( BufferSource.of( label ) );
  }

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final ArrayBuffer label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RsaOaepParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
