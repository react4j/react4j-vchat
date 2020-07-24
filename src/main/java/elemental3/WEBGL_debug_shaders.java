package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_debug_shaders {
  WEBGL_debug_shaders() {
  }

  @Nonnull
  public native String getTranslatedShaderSource(@Nonnull WebGLShader shader);
}
