package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLScriptElement"
)
public class HTMLScriptElement extends HTMLElement {
  public boolean async;

  @Nullable
  public String crossOrigin;

  public boolean defer;

  @Nonnull
  public String integrity;

  public boolean noModule;

  @Nonnull
  public String referrerPolicy;

  @Nonnull
  public String src;

  @Nonnull
  public String text;

  @Nonnull
  public String type;

  @Nonnull
  public String charset;

  @Nonnull
  public String event;

  @Nonnull
  public String htmlFor;

  public HTMLScriptElement() {
  }
}
