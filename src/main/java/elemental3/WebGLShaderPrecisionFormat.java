package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebGLShaderPrecisionFormat"
)
public class WebGLShaderPrecisionFormat {
  WebGLShaderPrecisionFormat() {
  }

  @JsProperty(
      name = "precision"
  )
  public native int precision();

  @JsProperty(
      name = "rangeMax"
  )
  public native int rangeMax();

  @JsProperty(
      name = "rangeMin"
  )
  public native int rangeMin();
}
