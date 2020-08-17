package elemental3;

import elemental2.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The IIRFilterNode interface of the Web Audio API is a AudioNode processor which implements a general infinite impulse response (IIR)  filter; this type of filter can be used to implement tone control devices and graphic equalizers as well. It lets the parameters of the filter response be specified, so that it can be tuned as needed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IIRFilterNode">IIRFilterNode - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IIRFilterNode"
)
public class IIRFilterNode extends AudioNode {
  /**
   * The IIRFilterNode() constructor of the Web Audio API creates a new IIRFilterNode object which an AudioNode processor which implements a general infinite impulse response filter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IIRFilterNode/IIRFilterNode">IIRFilterNode.IIRFilterNode - MDN</a>
   */
  public IIRFilterNode(@Nonnull final BaseAudioContext context,
      @Nonnull final IIRFilterOptions options) {
  }

  public native void getFrequencyResponse(@Nonnull Float32Array frequencyHz,
      @Nonnull Float32Array magResponse, @Nonnull Float32Array phaseResponse);
}
