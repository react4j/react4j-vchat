package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaError"
)
public class MediaError {
  @JsOverlay
  public static final int MEDIA_ERR_ABORTED = 1;

  @JsOverlay
  public static final int MEDIA_ERR_DECODE = 3;

  @JsOverlay
  public static final int MEDIA_ERR_NETWORK = 2;

  @JsOverlay
  public static final int MEDIA_ERR_SRC_NOT_SUPPORTED = 4;

  MediaError() {
  }

  @JsProperty(
      name = "code"
  )
  public native int code();

  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();
}
