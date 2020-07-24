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
    name = "DocumentFragment"
)
public class DocumentFragment extends Node {
  public DocumentFragment() {
  }

  @JsProperty(
      name = "childElementCount"
  )
  public native int childElementCount();

  @JsProperty(
      name = "children"
  )
  @Nonnull
  public native HTMLCollection children();

  @JsProperty(
      name = "firstElementChild"
  )
  @Nullable
  public native Element firstElementChild();

  @JsProperty(
      name = "lastElementChild"
  )
  @Nullable
  public native Element lastElementChild();

  public native void append(@Nonnull Node... nodes);

  public native void append(@Nonnull String... nodes);

  public native void prepend(@Nonnull Node... nodes);

  public native void prepend(@Nonnull String... nodes);

  @Nullable
  public native Element querySelector(@Nonnull String selectors);

  @Nonnull
  public native NodeList querySelectorAll(@Nonnull String selectors);

  public native void replaceChildren(@Nonnull Node... nodes);

  public native void replaceChildren(@Nonnull String... nodes);

  @Nullable
  public native Element getElementById(@Nonnull String elementId);
}
