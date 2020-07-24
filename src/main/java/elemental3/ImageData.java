package elemental3;

import elemental2.core.Uint8ClampedArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ImageData"
)
public class ImageData {
  public ImageData(final int sw, final int sh) {
  }

  public ImageData(@Nonnull final Uint8ClampedArray data, final int sw, final int sh) {
  }

  public ImageData(@Nonnull final Uint8ClampedArray data, final int sw) {
  }

  @JsProperty(
      name = "data"
  )
  @Nonnull
  public native Uint8ClampedArray data();

  @JsProperty(
      name = "height"
  )
  public native int height();

  @JsProperty(
      name = "width"
  )
  public native int width();
}
