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
    name = "HTMLMeterElement"
)
public class HTMLMeterElement extends HTMLElement {
  public double high;

  public double low;

  public double max;

  public double min;

  public double optimum;

  public double value;

  public HTMLMeterElement() {
  }

  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();
}
