package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ImageBitmapRenderingContext"
)
public class ImageBitmapRenderingContext {
  ImageBitmapRenderingContext() {
  }

  @JsProperty(
      name = "canvas"
  )
  @Nonnull
  public native HTMLCanvasElementOrOffscreenCanvasUnion canvas();

  public native void transferFromImageBitmap(@Nullable ImageBitmap bitmap);
}
