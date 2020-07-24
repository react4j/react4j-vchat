package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioWorkletNode"
)
public class AudioWorkletNode extends AudioNode {
  @Nullable
  public EventHandler onprocessorerror;

  public AudioWorkletNode(@Nonnull final BaseAudioContext context, @Nonnull final String name,
      @Nonnull final AudioWorkletNodeOptions options) {
  }

  public AudioWorkletNode(@Nonnull final BaseAudioContext context, @Nonnull final String name) {
  }

  @JsProperty(
      name = "parameters"
  )
  @Nonnull
  public native AudioParamMap parameters();

  @JsProperty(
      name = "port"
  )
  @Nonnull
  public native MessagePort port();
}
