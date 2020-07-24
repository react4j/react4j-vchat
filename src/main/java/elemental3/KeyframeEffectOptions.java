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
public interface KeyframeEffectOptions extends EffectTiming {
  @JsOverlay
  @Nonnull
  static KeyframeEffectOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getComposite();

  @JsProperty
  void setComposite(@Nonnull String composite);

  @JsOverlay
  @Nonnull
  default KeyframeEffectOptions composite(@Nonnull final String composite) {
    setComposite( composite );
    return this;
  }

  @JsProperty
  String getIterationComposite();

  @JsProperty
  void setIterationComposite(@Nonnull String iterationComposite);

  @JsOverlay
  @Nonnull
  default KeyframeEffectOptions iterationComposite(@Nonnull final String iterationComposite) {
    setIterationComposite( iterationComposite );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeEffectOptions delay(final double delay) {
    setDelay( delay );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeEffectOptions direction(@Nonnull final String direction) {
    setDirection( direction );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeEffectOptions duration(final double duration) {
    setDuration( duration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeEffectOptions duration(@Nonnull final String duration) {
    setDuration( duration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeEffectOptions easing(@Nonnull final String easing) {
    setEasing( easing );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeEffectOptions endDelay(final double endDelay) {
    setEndDelay( endDelay );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeEffectOptions fill(@Nonnull final String fill) {
    setFill( fill );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeEffectOptions iterationStart(final double iterationStart) {
    setIterationStart( iterationStart );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeEffectOptions iterations(final double iterations) {
    setIterations( iterations );
    return this;
  }
}
