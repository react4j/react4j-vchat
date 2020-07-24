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
    name = "SVGGraphicsElement"
)
public class SVGGraphicsElement extends SVGElement {
  SVGGraphicsElement() {
  }

  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native SVGAnimatedTransformList transform();

  @JsProperty(
      name = "requiredExtensions"
  )
  @Nonnull
  public native SVGStringList requiredExtensions();

  @JsProperty(
      name = "systemLanguage"
  )
  @Nonnull
  public native SVGStringList systemLanguage();

  @Nonnull
  public native DOMRect getBBox(@Nonnull SVGBoundingBoxOptions options);

  @Nonnull
  public native DOMRect getBBox();

  @Nullable
  public native DOMMatrix getCTM();

  @Nullable
  public native DOMMatrix getScreenCTM();
}
