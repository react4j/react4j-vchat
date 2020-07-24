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
    name = "SVGTextPositioningElement"
)
public class SVGTextPositioningElement extends SVGTextContentElement {
  SVGTextPositioningElement() {
  }

  @JsProperty(
      name = "dx"
  )
  @Nonnull
  public native SVGAnimatedLengthList dx();

  @JsProperty(
      name = "dy"
  )
  @Nonnull
  public native SVGAnimatedLengthList dy();

  @JsProperty(
      name = "rotate"
  )
  @Nonnull
  public native SVGAnimatedNumberList rotate();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLengthList x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLengthList y();
}
