package elemental3.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebGLShaderPrecisionFormat interface is part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getShaderPrecisionFormat() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLShaderPrecisionFormat">WebGLShaderPrecisionFormat - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebGLShaderPrecisionFormat"
)
public class WebGLShaderPrecisionFormat {
  protected WebGLShaderPrecisionFormat() {
  }

  /**
   * The read-only WebGLShaderPrecisionFormat.precision property returns the number of bits of precision that can be represented.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLShaderPrecisionFormat/precision">WebGLShaderPrecisionFormat.precision - MDN</a>
   */
  @JsProperty(
      name = "precision"
  )
  public native int precision();

  /**
   * The read-only WebGLShaderPrecisionFormat.rangeMax property returns the base 2 log of the absolute value of the maximum value that can be represented.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLShaderPrecisionFormat/rangeMax">WebGLShaderPrecisionFormat.rangeMax - MDN</a>
   */
  @JsProperty(
      name = "rangeMax"
  )
  public native int rangeMax();

  /**
   * The read-only WebGLShaderPrecisionFormat.rangeMin property returns the base 2 log of the absolute value of the minimum value that can be represented.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLShaderPrecisionFormat/rangeMin">WebGLShaderPrecisionFormat.rangeMin - MDN</a>
   */
  @JsProperty(
      name = "rangeMin"
  )
  public native int rangeMin();
}