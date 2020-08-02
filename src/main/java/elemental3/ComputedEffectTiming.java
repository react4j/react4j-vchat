package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ComputedEffectTiming extends EffectTiming {
  @JsOverlay
  @Nonnull
  static ComputedEffectTiming create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "activeDuration"
  )
  double activeDuration();

  @JsProperty
  void setActiveDuration(double activeDuration);

  @JsOverlay
  @Nonnull
  default ComputedEffectTiming activeDuration(final double activeDuration) {
    setActiveDuration( activeDuration );
    return this;
  }

  @JsProperty(
      name = "currentIteration"
  )
  @Nullable
  Double currentIteration();

  @JsProperty
  void setCurrentIteration(@Nullable Double currentIteration);

  @JsOverlay
  @Nonnull
  default ComputedEffectTiming currentIteration(@Nullable final Double currentIteration) {
    setCurrentIteration( currentIteration );
    return this;
  }

  @JsProperty(
      name = "endTime"
  )
  double endTime();

  @JsProperty
  void setEndTime(double endTime);

  @JsOverlay
  @Nonnull
  default ComputedEffectTiming endTime(final double endTime) {
    setEndTime( endTime );
    return this;
  }

  @JsProperty(
      name = "localTime"
  )
  @Nullable
  Double localTime();

  @JsProperty
  void setLocalTime(@Nullable Double localTime);

  @JsOverlay
  @Nonnull
  default ComputedEffectTiming localTime(@Nullable final Double localTime) {
    setLocalTime( localTime );
    return this;
  }

  @JsProperty(
      name = "progress"
  )
  @Nullable
  Double progress();

  @JsProperty
  void setProgress(@Nullable Double progress);

  @JsOverlay
  @Nonnull
  default ComputedEffectTiming progress(@Nullable final Double progress) {
    setProgress( progress );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ComputedEffectTiming delay(final double delay) {
    setDelay( delay );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ComputedEffectTiming direction(@Nonnull final String direction) {
    setDirection( direction );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ComputedEffectTiming duration(final double duration) {
    setDuration( duration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ComputedEffectTiming duration(@Nonnull final String duration) {
    setDuration( duration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ComputedEffectTiming easing(@Nonnull final String easing) {
    setEasing( easing );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ComputedEffectTiming endDelay(final double endDelay) {
    setEndDelay( endDelay );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ComputedEffectTiming fill(@Nonnull final String fill) {
    setFill( fill );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ComputedEffectTiming iterationStart(final double iterationStart) {
    setIterationStart( iterationStart );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ComputedEffectTiming iterations(final double iterations) {
    setIterations( iterations );
    return this;
  }
}
