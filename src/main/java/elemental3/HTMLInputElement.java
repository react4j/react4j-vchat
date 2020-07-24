package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLInputElement"
)
public class HTMLInputElement extends HTMLElement {
  @Nonnull
  public String accept;

  @Nonnull
  public String alt;

  @Nonnull
  public String autocomplete;

  public boolean checked;

  public boolean defaultChecked;

  @Nonnull
  public String defaultValue;

  @Nonnull
  public String dirName;

  public boolean disabled;

  @Nullable
  public FileList files;

  @Nonnull
  public String formAction;

  @Nonnull
  public String formEnctype;

  @Nonnull
  public String formMethod;

  public boolean formNoValidate;

  @Nonnull
  public String formTarget;

  public int height;

  public boolean indeterminate;

  @Nonnull
  public String max;

  public int maxLength;

  @Nonnull
  public String min;

  public int minLength;

  public boolean multiple;

  @Nonnull
  public String name;

  @Nonnull
  public String pattern;

  @Nonnull
  public String placeholder;

  public boolean readOnly;

  public boolean required;

  @Nullable
  public String selectionDirection;

  @Nullable
  public Double selectionEnd;

  @Nullable
  public Double selectionStart;

  public int size;

  @Nonnull
  public String src;

  @Nonnull
  public String step;

  @Nonnull
  public String type;

  @Nonnull
  public String value;

  @Nullable
  public Object valueAsDate;

  public double valueAsNumber;

  public int width;

  @Nonnull
  public String align;

  @Nonnull
  public String useMap;

  public HTMLInputElement() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  @JsProperty(
      name = "labels"
  )
  @Nullable
  public native NodeList labels();

  @JsProperty(
      name = "list"
  )
  @Nullable
  public native HTMLElement list();

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

  public native boolean reportValidity();

  public native void select();

  public native void setCustomValidity(@Nonnull String error);

  public native void setRangeText(@Nonnull String replacement);

  public native void setRangeText(@Nonnull String replacement, int start, int end,
      @MagicConstant(stringValues = {"end", "preserve", "select", "start"}) @Nonnull String selectionMode);

  public native void setRangeText(@Nonnull String replacement, int start, int end);

  public native void setSelectionRange(int start, int end, @Nonnull String direction);

  public native void setSelectionRange(int start, int end);

  public native void stepDown(int n);

  public native void stepDown();

  public native void stepUp(int n);

  public native void stepUp();
}
