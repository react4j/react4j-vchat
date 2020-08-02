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
public interface KeyframeAnimationOptions extends KeyframeEffectOptions {
  @JsOverlay
  @Nonnull
  static KeyframeAnimationOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "id"
  )
  String id();

  @JsProperty
  void setId(@Nonnull String id);

  @JsOverlay
  @Nonnull
  default KeyframeAnimationOptions id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions composite(@Nonnull final String composite) {
    setComposite( composite );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions iterationComposite(@Nonnull final String iterationComposite) {
    setIterationComposite( iterationComposite );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions delay(final double delay) {
    setDelay( delay );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions direction(@Nonnull final String direction) {
    setDirection( direction );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions duration(final double duration) {
    setDuration( duration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions duration(@Nonnull final String duration) {
    setDuration( duration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions easing(@Nonnull final String easing) {
    setEasing( easing );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions endDelay(final double endDelay) {
    setEndDelay( endDelay );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions fill(@Nonnull final String fill) {
    setFill( fill );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions iterationStart(final double iterationStart) {
    setIterationStart( iterationStart );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyframeAnimationOptions iterations(final double iterations) {
    setIterations( iterations );
    return this;
  }
}
