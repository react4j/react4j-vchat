package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioParam"
)
public class AudioParam {
  @Nonnull
  public String automationRate;

  public float value;

  AudioParam() {
  }

  @JsProperty(
      name = "defaultValue"
  )
  public native float defaultValue();

  @JsProperty(
      name = "maxValue"
  )
  public native float maxValue();

  @JsProperty(
      name = "minValue"
  )
  public native float minValue();

  @Nonnull
  public native AudioParam cancelAndHoldAtTime(double cancelTime);

  @Nonnull
  public native AudioParam cancelScheduledValues(double cancelTime);

  @Nonnull
  public native AudioParam exponentialRampToValueAtTime(float value, double endTime);

  @Nonnull
  public native AudioParam linearRampToValueAtTime(float value, double endTime);

  @Nonnull
  public native AudioParam setTargetAtTime(float target, double startTime, float timeConstant);

  @Nonnull
  public native AudioParam setValueAtTime(float value, double startTime);

  @Nonnull
  public native AudioParam setValueCurveAtTime(@Nonnull JsArray<Double> values, double startTime,
      double duration);

  @Nonnull
  public native AudioParam setValueCurveAtTime(@Nonnull Double[] values, double startTime,
      double duration);
}
