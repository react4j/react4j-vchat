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
    name = "SVGLengthList"
)
public class SVGLengthList {
  SVGLengthList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "numberOfItems"
  )
  public native int numberOfItems();

  @Nonnull
  public native SVGLength appendItem(@Nonnull SVGLength newItem);

  public native void clear();

  @Nonnull
  public native SVGLength initialize(@Nonnull SVGLength newItem);

  @Nonnull
  public native SVGLength insertItemBefore(@Nonnull SVGLength newItem, int index);

  @Nonnull
  public native SVGLength removeItem(int index);

  @Nonnull
  public native SVGLength replaceItem(@Nonnull SVGLength newItem, int index);
}
