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
public interface CollectedClientData {
  @JsOverlay
  @Nonnull
  static CollectedClientData create(@Nonnull final String challenge, @Nonnull final String origin,
      @Nonnull final String type) {
    return Js.<CollectedClientData>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).origin( origin ).type( type );
  }

  @JsProperty
  @Nonnull
  String getChallenge();

  @JsProperty
  void setChallenge(@Nonnull String challenge);

  @JsOverlay
  @Nonnull
  default CollectedClientData challenge(@Nonnull final String challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsProperty
  @Nonnull
  String getOrigin();

  @JsProperty
  void setOrigin(@Nonnull String origin);

  @JsOverlay
  @Nonnull
  default CollectedClientData origin(@Nonnull final String origin) {
    setOrigin( origin );
    return this;
  }

  @JsProperty
  TokenBinding getTokenBinding();

  @JsProperty
  void setTokenBinding(@Nonnull TokenBinding tokenBinding);

  @JsOverlay
  @Nonnull
  default CollectedClientData tokenBinding(@Nonnull final TokenBinding tokenBinding) {
    setTokenBinding( tokenBinding );
    return this;
  }

  @JsProperty
  @Nonnull
  String getType();

  @JsProperty
  void setType(@Nonnull String type);

  @JsOverlay
  @Nonnull
  default CollectedClientData type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
