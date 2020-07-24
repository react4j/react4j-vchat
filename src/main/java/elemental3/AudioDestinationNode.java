package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioDestinationNode"
)
public class AudioDestinationNode extends AudioNode {
  AudioDestinationNode() {
  }

  @JsProperty(
      name = "maxChannelCount"
  )
  public native int maxChannelCount();
}
