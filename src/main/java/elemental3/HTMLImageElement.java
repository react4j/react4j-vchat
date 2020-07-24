package elemental3;

import elemental2.promise.Promise;
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
    name = "HTMLImageElement"
)
public class HTMLImageElement extends HTMLElement {
  @Nonnull
  public String alt;

  @Nullable
  public String crossOrigin;

  @Nonnull
  public String decoding;

  public int height;

  public boolean isMap;

  @Nonnull
  public String loading;

  @Nonnull
  public String referrerPolicy;

  @Nonnull
  public String sizes;

  @Nonnull
  public String src;

  @Nonnull
  public String srcset;

  @Nonnull
  public String useMap;

  public int width;

  @Nonnull
  public String align;

  @Nonnull
  public String border;

  public int hspace;

  @Nonnull
  public String longDesc;

  @Nonnull
  public String lowsrc;

  @Nonnull
  public String name;

  public int vspace;

  public HTMLImageElement() {
  }

  @JsProperty(
      name = "complete"
  )
  public native boolean complete();

  @JsProperty(
      name = "currentSrc"
  )
  @Nonnull
  public native String currentSrc();

  @JsProperty(
      name = "naturalHeight"
  )
  public native int naturalHeight();

  @JsProperty(
      name = "naturalWidth"
  )
  public native int naturalWidth();

  @JsProperty(
      name = "x"
  )
  public native int x();

  @JsProperty(
      name = "y"
  )
  public native int y();

  @Nonnull
  public native Promise<Void> decode();
}
