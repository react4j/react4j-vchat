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
public interface ImageBitmapOptions {
  @JsOverlay
  @Nonnull
  static ImageBitmapOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getColorSpaceConversion();

  @JsProperty
  void setColorSpaceConversion(@Nonnull String colorSpaceConversion);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions colorSpaceConversion(@Nonnull final String colorSpaceConversion) {
    setColorSpaceConversion( colorSpaceConversion );
    return this;
  }

  @JsProperty
  String getImageOrientation();

  @JsProperty
  void setImageOrientation(@Nonnull String imageOrientation);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions imageOrientation(@Nonnull final String imageOrientation) {
    setImageOrientation( imageOrientation );
    return this;
  }

  @JsProperty
  String getPremultiplyAlpha();

  @JsProperty
  void setPremultiplyAlpha(@Nonnull String premultiplyAlpha);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions premultiplyAlpha(@Nonnull final String premultiplyAlpha) {
    setPremultiplyAlpha( premultiplyAlpha );
    return this;
  }

  @JsProperty
  int getResizeHeight();

  @JsProperty
  void setResizeHeight(int resizeHeight);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions resizeHeight(final int resizeHeight) {
    setResizeHeight( resizeHeight );
    return this;
  }

  @JsProperty
  String getResizeQuality();

  @JsProperty
  void setResizeQuality(@Nonnull String resizeQuality);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions resizeQuality(@Nonnull final String resizeQuality) {
    setResizeQuality( resizeQuality );
    return this;
  }

  @JsProperty
  int getResizeWidth();

  @JsProperty
  void setResizeWidth(int resizeWidth);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions resizeWidth(final int resizeWidth) {
    setResizeWidth( resizeWidth );
    return this;
  }
}
