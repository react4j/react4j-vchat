package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioScheduledSourceNode"
)
public class AudioScheduledSourceNode extends AudioNode {
  @Nullable
  public EventHandler onended;

  AudioScheduledSourceNode() {
  }

  public native void start(double when);

  public native void start();

  public native void stop(double when);

  public native void stop();
}
