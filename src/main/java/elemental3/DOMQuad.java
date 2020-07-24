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
    name = "DOMQuad"
)
public class DOMQuad {
  DOMQuad() {
  }

  @JsProperty(
      name = "p1"
  )
  @Nonnull
  public native DOMPoint p1();

  @JsProperty(
      name = "p2"
  )
  @Nonnull
  public native DOMPoint p2();

  @JsProperty(
      name = "p3"
  )
  @Nonnull
  public native DOMPoint p3();

  @JsProperty(
      name = "p4"
  )
  @Nonnull
  public native DOMPoint p4();

  @Nonnull
  public static native DOMQuad fromQuad(@Nonnull DOMQuadInit other);

  @Nonnull
  public static native DOMQuad fromQuad();

  @Nonnull
  public static native DOMQuad fromRect(@Nonnull DOMRectInit other);

  @Nonnull
  public static native DOMQuad fromRect();

  @Nonnull
  public native DOMRect getBounds();

  @Nonnull
  public native Object toJSON();
}
