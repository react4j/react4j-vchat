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
public interface ImageEncodeOptions {
  @JsOverlay
  @Nonnull
  static ImageEncodeOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  double getQuality();

  @JsProperty
  void setQuality(double quality);

  @JsOverlay
  @Nonnull
  default ImageEncodeOptions quality(final double quality) {
    setQuality( quality );
    return this;
  }

  @JsProperty
  String getType();

  @JsProperty
  void setType(@Nonnull String type);

  @JsOverlay
  @Nonnull
  default ImageEncodeOptions type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
