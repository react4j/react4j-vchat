package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
public interface EffectTiming {
  @JsOverlay
  @Nonnull
  static EffectTiming create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "delay"
  )
  double delay();

  @JsProperty
  void setDelay(double delay);

  @JsOverlay
  @Nonnull
  default EffectTiming delay(final double delay) {
    setDelay( delay );
    return this;
  }

  @JsProperty(
      name = "direction"
  )
  String direction();

  @JsProperty
  void setDirection(@Nonnull String direction);

  @JsOverlay
  @Nonnull
  default EffectTiming direction(@Nonnull final String direction) {
    setDirection( direction );
    return this;
  }

  @JsProperty(
      name = "duration"
  )
  UnrestrictedDoubleOrStringUnion duration();

  @JsProperty
  void setDuration(@Nonnull UnrestrictedDoubleOrStringUnion duration);

  @JsOverlay
  default void setDuration(final double duration) {
    setDuration( UnrestrictedDoubleOrStringUnion.of( duration ) );
  }

  @JsOverlay
  @Nonnull
  default EffectTiming duration(final double duration) {
    setDuration( duration );
    return this;
  }

  @JsOverlay
  default void setDuration(@Nonnull final String duration) {
    setDuration( UnrestrictedDoubleOrStringUnion.of( duration ) );
  }

  @JsOverlay
  @Nonnull
  default EffectTiming duration(@Nonnull final String duration) {
    setDuration( duration );
    return this;
  }

  @JsProperty(
      name = "easing"
  )
  String easing();

  @JsProperty
  void setEasing(@Nonnull String easing);

  @JsOverlay
  @Nonnull
  default EffectTiming easing(@Nonnull final String easing) {
    setEasing( easing );
    return this;
  }

  @JsProperty(
      name = "endDelay"
  )
  double endDelay();

  @JsProperty
  void setEndDelay(double endDelay);

  @JsOverlay
  @Nonnull
  default EffectTiming endDelay(final double endDelay) {
    setEndDelay( endDelay );
    return this;
  }

  @JsProperty(
      name = "fill"
  )
  String fill();

  @JsProperty
  void setFill(@Nonnull String fill);

  @JsOverlay
  @Nonnull
  default EffectTiming fill(@Nonnull final String fill) {
    setFill( fill );
    return this;
  }

  @JsProperty(
      name = "iterationStart"
  )
  double iterationStart();

  @JsProperty
  void setIterationStart(double iterationStart);

  @JsOverlay
  @Nonnull
  default EffectTiming iterationStart(final double iterationStart) {
    setIterationStart( iterationStart );
    return this;
  }

  @JsProperty(
      name = "iterations"
  )
  double iterations();

  @JsProperty
  void setIterations(double iterations);

  @JsOverlay
  @Nonnull
  default EffectTiming iterations(final double iterations) {
    setIterations( iterations );
    return this;
  }
}
