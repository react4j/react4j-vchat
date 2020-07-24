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
    name = "SVGPolygonElement"
)
public class SVGPolygonElement extends SVGGeometryElement {
  SVGPolygonElement() {
  }

  @JsProperty(
      name = "animatedPoints"
  )
  @Nonnull
  public native SVGPointList animatedPoints();

  @JsProperty(
      name = "points"
  )
  @Nonnull
  public native SVGPointList points();
}
