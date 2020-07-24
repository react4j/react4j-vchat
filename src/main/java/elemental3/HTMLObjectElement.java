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
    name = "HTMLObjectElement"
)
public class HTMLObjectElement extends HTMLElement {
  @Nonnull
  public String data;

  @Nonnull
  public String height;

  @Nonnull
  public String name;

  @Nonnull
  public String type;

  @Nonnull
  public String useMap;

  @Nonnull
  public String width;

  @Nonnull
  public String align;

  @Nonnull
  public String archive;

  @Nonnull
  public String border;

  @Nonnull
  public String code;

  @Nonnull
  public String codeBase;

  @Nonnull
  public String codeType;

  public boolean declare;

  public int hspace;

  @Nonnull
  public String standby;

  public int vspace;

  public HTMLObjectElement() {
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
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  @JsProperty(
      name = "validationMessage"
  )
  @Nonnull
  public native String validationMessage();

  @JsProperty(
      name = "validity"
  )
  @Nonnull
  public native ValidityState validity();

  @JsProperty(
      name = "willValidate"
  )
  public native boolean willValidate();

  public native boolean checkValidity();

  @Nullable
  public native Document getSVGDocument();

  public native boolean reportValidity();

  public native void setCustomValidity(@Nonnull String error);
}
