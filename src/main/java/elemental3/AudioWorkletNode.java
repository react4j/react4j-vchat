package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioWorkletNode interface of the Web Audio API represents a base class for a user-defined AudioNode, which can be connected to an audio routing graph along with other nodes. It has an associated AudioWorkletProcessor, which does the actual audio processing in a Web Audio rendering thread.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNode">AudioWorkletNode - MDN</a>
 */
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

  /**
   * The read-only parameters property of the AudioWorkletNode interface returns the associated AudioParamMap — that is, a Map-like collection of AudioParam objects. They are instantiated during creation of the underlying AudioWorkletProcessor according to its parameterDescriptors static getter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNode/parameters">AudioWorkletNode.parameters - MDN</a>
   */
  @JsProperty(
      name = "parameters"
  )
  @Nonnull
  public native AudioParamMap parameters();

  /**
   * The read-only port property of the AudioWorkletNode interface returns the associated MessagePort. It can be used to communicate between the node and its associated AudioWorkletProcessor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNode/port">AudioWorkletNode.port - MDN</a>
   */
  @JsProperty(
      name = "port"
  )
  @Nonnull
  public native MessagePort port();
}
