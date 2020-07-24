package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStreamAudioDestinationNode"
)
public class MediaStreamAudioDestinationNode extends AudioNode {
  public MediaStreamAudioDestinationNode(@Nonnull final AudioContext context,
      @Nonnull final AudioNodeOptions options) {
  }

  public MediaStreamAudioDestinationNode(@Nonnull final AudioContext context) {
  }

  @JsProperty(
      name = "stream"
  )
  @Nonnull
  public native MediaStream stream();
}
