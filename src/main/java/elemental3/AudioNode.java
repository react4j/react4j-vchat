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
    name = "AudioNode"
)
public class AudioNode extends EventTarget {
  public int channelCount;

  @Nonnull
  public String channelCountMode;

  @Nonnull
  public String channelInterpretation;

  AudioNode() {
  }

  @JsProperty(
      name = "context"
  )
  @Nonnull
  public native BaseAudioContext context();

  @JsProperty(
      name = "numberOfInputs"
  )
  public native int numberOfInputs();

  @JsProperty(
      name = "numberOfOutputs"
  )
  public native int numberOfOutputs();

  @Nonnull
  public native AudioNode connect(@Nonnull AudioNode destinationNode, int output, int input);

  @Nonnull
  public native AudioNode connect(@Nonnull AudioNode destinationNode, int output);

  @Nonnull
  public native AudioNode connect(@Nonnull AudioNode destinationNode);

  public native void connect(@Nonnull AudioParam destinationParam, int output);

  public native void connect(@Nonnull AudioParam destinationParam);

  public native void disconnect();

  public native void disconnect(int output);

  public native void disconnect(@Nonnull AudioNode destinationNode);

  public native void disconnect(@Nonnull AudioNode destinationNode, int output);

  public native void disconnect(@Nonnull AudioNode destinationNode, int output, int input);

  public native void disconnect(@Nonnull AudioParam destinationParam);

  public native void disconnect(@Nonnull AudioParam destinationParam, int output);
}
