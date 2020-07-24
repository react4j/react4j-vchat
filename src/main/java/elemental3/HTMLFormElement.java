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
    name = "HTMLFormElement"
)
public class HTMLFormElement extends HTMLElement {
  @Nonnull
  public String acceptCharset;

  @Nonnull
  public String action;

  @Nonnull
  public String autocomplete;

  @Nonnull
  public String encoding;

  @Nonnull
  public String enctype;

  @Nonnull
  public String method;

  @Nonnull
  public String name;

  public boolean noValidate;

  @Nonnull
  public String rel;

  @Nonnull
  public String target;

  public HTMLFormElement() {
  }

  @JsProperty(
      name = "elements"
  )
  @Nonnull
  public native HTMLFormControlsCollection elements();

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "relList"
  )
  @Nonnull
  public native DOMTokenList relList();

  public native boolean checkValidity();

  public native boolean reportValidity();

  public native void requestSubmit(@Nullable HTMLElement submitter);

  public native void requestSubmit();

  public native void reset();

  public native void submit();
}
