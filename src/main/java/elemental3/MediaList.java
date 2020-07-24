package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaList"
)
public class MediaList {
  @Nonnull
  public String mediaText;

  MediaList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  public native void appendMedium(@Nonnull String medium);

  public native void deleteMedium(@Nonnull String medium);
}
