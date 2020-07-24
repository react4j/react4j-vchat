package elemental3;

import elemental2.core.JsArray;
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
public interface JsonWebKey {
  @JsOverlay
  @Nonnull
  static JsonWebKey create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getAlg();

  @JsProperty
  void setAlg(@Nonnull String alg);

  @JsOverlay
  @Nonnull
  default JsonWebKey alg(@Nonnull final String alg) {
    setAlg( alg );
    return this;
  }

  @JsProperty
  String getCrv();

  @JsProperty
  void setCrv(@Nonnull String crv);

  @JsOverlay
  @Nonnull
  default JsonWebKey crv(@Nonnull final String crv) {
    setCrv( crv );
    return this;
  }

  @JsProperty
  String getD();

  @JsProperty
  void setD(@Nonnull String d);

  @JsOverlay
  @Nonnull
  default JsonWebKey d(@Nonnull final String d) {
    setD( d );
    return this;
  }

  @JsProperty
  String getDp();

  @JsProperty
  void setDp(@Nonnull String dp);

  @JsOverlay
  @Nonnull
  default JsonWebKey dp(@Nonnull final String dp) {
    setDp( dp );
    return this;
  }

  @JsProperty
  String getDq();

  @JsProperty
  void setDq(@Nonnull String dq);

  @JsOverlay
  @Nonnull
  default JsonWebKey dq(@Nonnull final String dq) {
    setDq( dq );
    return this;
  }

  @JsProperty
  String getE();

  @JsProperty
  void setE(@Nonnull String e);

  @JsOverlay
  @Nonnull
  default JsonWebKey e(@Nonnull final String e) {
    setE( e );
    return this;
  }

  @JsProperty
  boolean isExt();

  @JsProperty
  void setExt(boolean ext);

  @JsOverlay
  @Nonnull
  default JsonWebKey ext(final boolean ext) {
    setExt( ext );
    return this;
  }

  @JsProperty
  String getK();

  @JsProperty
  void setK(@Nonnull String k);

  @JsOverlay
  @Nonnull
  default JsonWebKey k(@Nonnull final String k) {
    setK( k );
    return this;
  }

  @JsProperty
  JsArray<String> getKey_ops();

  @JsProperty
  void setKey_ops(@Nonnull JsArray<String> key_ops);

  @JsOverlay
  @Nonnull
  default JsonWebKey key_ops(@Nonnull final JsArray<String> key_ops) {
    setKey_ops( key_ops );
    return this;
  }

  @JsOverlay
  default void setKey_ops(@Nonnull final String... key_ops) {
    setKey_ops( JsArray.asJsArray( key_ops ) );
  }

  @JsOverlay
  @Nonnull
  default JsonWebKey key_ops(@Nonnull final String... key_ops) {
    setKey_ops( key_ops );
    return this;
  }

  @JsProperty
  String getKty();

  @JsProperty
  void setKty(@Nonnull String kty);

  @JsOverlay
  @Nonnull
  default JsonWebKey kty(@Nonnull final String kty) {
    setKty( kty );
    return this;
  }

  @JsProperty
  String getN();

  @JsProperty
  void setN(@Nonnull String n);

  @JsOverlay
  @Nonnull
  default JsonWebKey n(@Nonnull final String n) {
    setN( n );
    return this;
  }

  @JsProperty
  JsArray<RsaOtherPrimesInfo> getOth();

  @JsProperty
  void setOth(@Nonnull JsArray<RsaOtherPrimesInfo> oth);

  @JsOverlay
  @Nonnull
  default JsonWebKey oth(@Nonnull final JsArray<RsaOtherPrimesInfo> oth) {
    setOth( oth );
    return this;
  }

  @JsOverlay
  default void setOth(@Nonnull final RsaOtherPrimesInfo... oth) {
    setOth( JsArray.asJsArray( oth ) );
  }

  @JsOverlay
  @Nonnull
  default JsonWebKey oth(@Nonnull final RsaOtherPrimesInfo... oth) {
    setOth( oth );
    return this;
  }

  @JsProperty
  String getP();

  @JsProperty
  void setP(@Nonnull String p);

  @JsOverlay
  @Nonnull
  default JsonWebKey p(@Nonnull final String p) {
    setP( p );
    return this;
  }

  @JsProperty
  String getQ();

  @JsProperty
  void setQ(@Nonnull String q);

  @JsOverlay
  @Nonnull
  default JsonWebKey q(@Nonnull final String q) {
    setQ( q );
    return this;
  }

  @JsProperty
  String getQi();

  @JsProperty
  void setQi(@Nonnull String qi);

  @JsOverlay
  @Nonnull
  default JsonWebKey qi(@Nonnull final String qi) {
    setQi( qi );
    return this;
  }

  @JsProperty
  String getUse();

  @JsProperty
  void setUse(@Nonnull String use);

  @JsOverlay
  @Nonnull
  default JsonWebKey use(@Nonnull final String use) {
    setUse( use );
    return this;
  }

  @JsProperty
  String getX();

  @JsProperty
  void setX(@Nonnull String x);

  @JsOverlay
  @Nonnull
  default JsonWebKey x(@Nonnull final String x) {
    setX( x );
    return this;
  }

  @JsProperty
  String getY();

  @JsProperty
  void setY(@Nonnull String y);

  @JsOverlay
  @Nonnull
  default JsonWebKey y(@Nonnull final String y) {
    setY( y );
    return this;
  }
}
