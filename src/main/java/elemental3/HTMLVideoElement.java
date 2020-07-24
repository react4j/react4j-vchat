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
    name = "HTMLVideoElement"
)
public class HTMLVideoElement extends HTMLMediaElement {
  public int height;

  public boolean playsInline;

  @Nonnull
  public String poster;

  public int width;

  public HTMLVideoElement() {
  }

  @JsProperty(
      name = "videoHeight"
  )
  public native int videoHeight();

  @JsProperty(
      name = "videoWidth"
  )
  public native int videoWidth();
}
