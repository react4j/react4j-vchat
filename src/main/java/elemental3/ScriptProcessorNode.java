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
    name = "ScriptProcessorNode"
)
public class ScriptProcessorNode extends AudioNode {
  @Nullable
  public EventHandler onaudioprocess;

  ScriptProcessorNode() {
  }

  @JsProperty(
      name = "bufferSize"
  )
  public native int bufferSize();
}
