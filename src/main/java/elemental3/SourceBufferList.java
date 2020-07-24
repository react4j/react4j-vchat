package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SourceBufferList"
)
public class SourceBufferList extends EventTarget {
  @Nullable
  public EventHandler onaddsourcebuffer;

  @Nullable
  public EventHandler onremovesourcebuffer;

  SourceBufferList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();
}
