package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ScriptProcessorNode interface allows the generation, processing, or analyzing of audio using JavaScript.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScriptProcessorNode">ScriptProcessorNode - MDN</a>
 */
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

  /**
   * The following example shows basic usage of a ScriptProcessorNode to take a track loaded via AudioContext.decodeAudioData(), process it, adding a bit of white noise to each audio sample of the input track (buffer) and play it through the AudioDestinationNode. For each channel and each sample frame, the scriptNode.onaudioprocess function takes the associated audioProcessingEvent and uses it to loop through each channel of the input buffer, and each sample in each channel, and add a small amount of white noise, before setting that result to be the output sample in each case.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScriptProcessorNode/bufferSize">ScriptProcessorNode.bufferSize - MDN</a>
   */
  @JsProperty(
      name = "bufferSize"
  )
  public native int bufferSize();
}
