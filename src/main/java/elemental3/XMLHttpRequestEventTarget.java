package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XMLHttpRequestEventTarget"
)
public class XMLHttpRequestEventTarget extends EventTarget {
  @Nullable
  public EventHandler onabort;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onload;

  @Nullable
  public EventHandler onloadend;

  @Nullable
  public EventHandler onloadstart;

  @Nullable
  public EventHandler onprogress;

  @Nullable
  public EventHandler ontimeout;

  XMLHttpRequestEventTarget() {
  }
}
