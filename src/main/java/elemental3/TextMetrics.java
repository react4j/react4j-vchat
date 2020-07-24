package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextMetrics"
)
public class TextMetrics {
  TextMetrics() {
  }

  @JsProperty(
      name = "actualBoundingBoxAscent"
  )
  public native double actualBoundingBoxAscent();

  @JsProperty(
      name = "actualBoundingBoxDescent"
  )
  public native double actualBoundingBoxDescent();

  @JsProperty(
      name = "actualBoundingBoxLeft"
  )
  public native double actualBoundingBoxLeft();

  @JsProperty(
      name = "actualBoundingBoxRight"
  )
  public native double actualBoundingBoxRight();

  @JsProperty(
      name = "alphabeticBaseline"
  )
  public native double alphabeticBaseline();

  @JsProperty(
      name = "emHeightAscent"
  )
  public native double emHeightAscent();

  @JsProperty(
      name = "emHeightDescent"
  )
  public native double emHeightDescent();

  @JsProperty(
      name = "fontBoundingBoxAscent"
  )
  public native double fontBoundingBoxAscent();

  @JsProperty(
      name = "fontBoundingBoxDescent"
  )
  public native double fontBoundingBoxDescent();

  @JsProperty(
      name = "hangingBaseline"
  )
  public native double hangingBaseline();

  @JsProperty(
      name = "ideographicBaseline"
  )
  public native double ideographicBaseline();

  @JsProperty(
      name = "width"
  )
  public native double width();
}
