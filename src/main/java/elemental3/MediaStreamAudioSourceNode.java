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
    name = "MediaStreamAudioSourceNode"
)
public class MediaStreamAudioSourceNode extends AudioNode {
  public MediaStreamAudioSourceNode(@Nonnull final AudioContext context,
      @Nonnull final MediaStreamAudioSourceOptions options) {
  }

  @JsProperty(
      name = "mediaStream"
  )
  @Nonnull
  public native MediaStream mediaStream();
}
