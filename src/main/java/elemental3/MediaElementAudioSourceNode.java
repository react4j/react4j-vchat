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
    name = "MediaElementAudioSourceNode"
)
public class MediaElementAudioSourceNode extends AudioNode {
  public MediaElementAudioSourceNode(@Nonnull final AudioContext context,
      @Nonnull final MediaElementAudioSourceOptions options) {
  }

  @JsProperty(
      name = "mediaElement"
  )
  @Nonnull
  public native HTMLMediaElement mediaElement();
}
