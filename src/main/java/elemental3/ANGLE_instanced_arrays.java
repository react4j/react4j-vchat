package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class ANGLE_instanced_arrays {
  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = 0x88FE;

  ANGLE_instanced_arrays() {
  }

  public native void drawArraysInstancedANGLE(int mode, int first, int count, int primcount);

  public native void drawElementsInstancedANGLE(int mode, int count, int type, int offset,
      int primcount);

  public native void vertexAttribDivisorANGLE(int index, int divisor);
}
