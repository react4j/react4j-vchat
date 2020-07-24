package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEDisplacementMapElement"
)
public class SVGFEDisplacementMapElement extends SVGElement {
  @JsOverlay
  public static final int SVG_CHANNEL_A = 4;

  @JsOverlay
  public static final int SVG_CHANNEL_B = 3;

  @JsOverlay
  public static final int SVG_CHANNEL_G = 2;

  @JsOverlay
  public static final int SVG_CHANNEL_R = 1;

  @JsOverlay
  public static final int SVG_CHANNEL_UNKNOWN = 0;

  SVGFEDisplacementMapElement() {
  }

  @JsProperty(
      name = "in1"
  )
  @Nonnull
  public native SVGAnimatedString in1();

  @JsProperty(
      name = "in2"
  )
  @Nonnull
  public native SVGAnimatedString in2();

  @JsProperty(
      name = "scale"
  )
  @Nonnull
  public native SVGAnimatedNumber scale();

  @JsProperty(
      name = "xChannelSelector"
  )
  @Nonnull
  public native SVGAnimatedEnumeration xChannelSelector();

  @JsProperty(
      name = "yChannelSelector"
  )
  @Nonnull
  public native SVGAnimatedEnumeration yChannelSelector();

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "result"
  )
  @Nonnull
  public native SVGAnimatedString result();

  @JsProperty(
      name = "width"
  )
  @Nonnull
  public native SVGAnimatedLength width();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLength x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLength y();
}
