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
    name = "HTMLLinkElement"
)
public class HTMLLinkElement extends HTMLElement {
  @Nonnull
  public String as;

  @Nullable
  public String crossOrigin;

  public boolean disabled;

  @Nonnull
  public String href;

  @Nonnull
  public String hreflang;

  @Nonnull
  public String imageSizes;

  @Nonnull
  public String imageSrcset;

  @Nonnull
  public String integrity;

  @Nonnull
  public String media;

  @Nonnull
  public String referrerPolicy;

  @Nonnull
  public String rel;

  @Nonnull
  public String type;

  @Nonnull
  public String charset;

  @Nonnull
  public String rev;

  @Nonnull
  public String target;

  public HTMLLinkElement() {
  }

  @JsProperty(
      name = "relList"
  )
  @Nonnull
  public native DOMTokenList relList();

  @JsProperty(
      name = "sizes"
  )
  @Nonnull
  public native DOMTokenList sizes();

  @JsProperty(
      name = "sheet"
  )
  @Nullable
  public native CSSStyleSheet sheet();
}
