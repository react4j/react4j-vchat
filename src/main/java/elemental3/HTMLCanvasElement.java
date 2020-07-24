package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLCanvasElement"
)
public class HTMLCanvasElement extends HTMLElement {
  public int height;

  public int width;

  public HTMLCanvasElement() {
  }

  @Nullable
  public native RenderingContext getContext(@Nonnull String contextId, @Nullable Any options);

  @Nullable
  public native RenderingContext getContext(@Nonnull String contextId);

  public native void toBlob(@Nonnull BlobCallback _callback, @Nonnull String type,
      @Nullable Any quality);

  public native void toBlob(@Nonnull BlobCallback _callback, @Nonnull String type);

  public native void toBlob(@Nonnull BlobCallback _callback);

  @Nonnull
  public native String toDataURL(@Nonnull String type, @Nullable Any quality);

  @Nonnull
  public native String toDataURL(@Nonnull String type);

  @Nonnull
  public native String toDataURL();

  @Nonnull
  public native OffscreenCanvas transferControlToOffscreen();
}
