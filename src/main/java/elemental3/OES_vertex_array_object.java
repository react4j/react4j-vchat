package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class OES_vertex_array_object {
  @JsOverlay
  public static final int VERTEX_ARRAY_BINDING_OES = 0x85B5;

  OES_vertex_array_object() {
  }

  public native void bindVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);

  @Nullable
  public native WebGLVertexArrayObjectOES createVertexArrayOES();

  public native void deleteVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);

  public native boolean isVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);
}
