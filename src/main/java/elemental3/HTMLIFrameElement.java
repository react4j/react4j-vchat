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
    name = "HTMLIFrameElement"
)
public class HTMLIFrameElement extends HTMLElement {
  @Nonnull
  public String allow;

  public boolean allowFullscreen;

  public boolean allowPaymentRequest;

  @Nonnull
  public String height;

  @Nonnull
  public String loading;

  @Nonnull
  public String name;

  @Nonnull
  public String referrerPolicy;

  @Nonnull
  public String src;

  @Nonnull
  public String srcdoc;

  @Nonnull
  public String width;

  @Nonnull
  public String align;

  @Nonnull
  public String frameBorder;

  @Nonnull
  public String longDesc;

  @Nonnull
  public String marginHeight;

  @Nonnull
  public String marginWidth;

  @Nonnull
  public String scrolling;

  public HTMLIFrameElement() {
  }

  @JsProperty(
      name = "contentDocument"
  )
  @Nullable
  public native Document contentDocument();

  @JsProperty(
      name = "contentWindow"
  )
  @Nullable
  public native Window contentWindow();

  @JsProperty(
      name = "sandbox"
  )
  @Nonnull
  public native DOMTokenList sandbox();

  @Nullable
  public native Document getSVGDocument();
}
