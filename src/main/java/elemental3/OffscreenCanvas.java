package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OffscreenCanvas"
)
public class OffscreenCanvas extends EventTarget {
  public int height;

  public int width;

  public OffscreenCanvas(final int width, final int height) {
  }

  @Nonnull
  public native Promise<Blob> convertToBlob(@Nonnull ImageEncodeOptions options);

  @Nonnull
  public native Promise<Blob> convertToBlob();

  @Nullable
  public native OffscreenRenderingContext getContext(
      @MagicConstant(stringValues = {"2d", "bitmaprenderer", "webgl", "webgl2"}) @Nonnull String contextId,
      @Nullable Any options);

  @Nullable
  public native OffscreenRenderingContext getContext(
      @MagicConstant(stringValues = {"2d", "bitmaprenderer", "webgl", "webgl2"}) @Nonnull String contextId);

  @Nonnull
  public native ImageBitmap transferToImageBitmap();
}
