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
    name = "HTMLSelectElement"
)
public class HTMLSelectElement extends HTMLElement {
  @Nonnull
  public String autocomplete;

  public boolean disabled;

  public int length;

  public boolean multiple;

  @Nonnull
  public String name;

  public boolean required;

  public int selectedIndex;

  public int size;

  @Nonnull
  public String value;

  public HTMLSelectElement() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();

  @JsProperty(
      name = "options"
  )
  @Nonnull
  public native HTMLOptionsCollection options();

  @JsProperty(
      name = "selectedOptions"
  )
  @Nonnull
  public native HTMLCollection selectedOptions();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

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

  public native void add(@Nonnull HTMLOptionElement element, @Nonnull HTMLElement before);

  public native void add(@Nonnull HTMLOptGroupElement element, @Nonnull HTMLElement before);

  public native void add(@Nonnull HTMLOptionElement element, int before);

  public native void add(@Nonnull HTMLOptGroupElement element, int before);

  public native void add(@Nonnull HTMLOptionElement element);

  public native void add(@Nonnull HTMLOptGroupElement element);

  public native boolean checkValidity();

  @Nullable
  public native HTMLOptionElement namedItem(@Nonnull String name);

  public native void remove();

  public native void remove(int index);

  public native boolean reportValidity();

  public native void setCustomValidity(@Nonnull String error);
}
