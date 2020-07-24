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
    name = "HTMLAnchorElement"
)
public class HTMLAnchorElement extends HTMLElement {
  @Nonnull
  public String download;

  @Nonnull
  public String hreflang;

  @Nonnull
  public String ping;

  @Nonnull
  public String referrerPolicy;

  @Nonnull
  public String rel;

  @Nonnull
  public String target;

  @Nonnull
  public String text;

  @Nonnull
  public String type;

  @Nonnull
  public String charset;

  @Nonnull
  public String coords;

  @Nonnull
  public String name;

  @Nonnull
  public String rev;

  @Nonnull
  public String shape;

  @Nonnull
  public String hash;

  @Nonnull
  public String host;

  @Nonnull
  public String hostname;

  @Nonnull
  public String password;

  @Nonnull
  public String pathname;

  @Nonnull
  public String port;

  @Nonnull
  public String protocol;

  @Nonnull
  public String search;

  @Nonnull
  public String username;

  @Nonnull
  public String href;

  public HTMLAnchorElement() {
  }

  @JsProperty(
      name = "relList"
  )
  @Nonnull
  public native DOMTokenList relList();

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();
}
