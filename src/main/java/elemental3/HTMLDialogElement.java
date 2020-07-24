package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLDialogElement"
)
public class HTMLDialogElement extends HTMLElement {
  public boolean open;

  @Nonnull
  public String returnValue;

  public HTMLDialogElement() {
  }

  public native void close(@Nonnull String returnValue);

  public native void close();

  public native void show();

  public native void showModal();
}
