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
public interface DynamicsCompressorOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static DynamicsCompressorOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  float getAttack();

  @JsProperty
  void setAttack(float attack);

  @JsOverlay
  @Nonnull
  default DynamicsCompressorOptions attack(final float attack) {
    setAttack( attack );
    return this;
  }

  @JsProperty
  float getKnee();

  @JsProperty
  void setKnee(float knee);

  @JsOverlay
  @Nonnull
  default DynamicsCompressorOptions knee(final float knee) {
    setKnee( knee );
    return this;
  }

  @JsProperty
  float getRatio();

  @JsProperty
  void setRatio(float ratio);

  @JsOverlay
  @Nonnull
  default DynamicsCompressorOptions ratio(final float ratio) {
    setRatio( ratio );
    return this;
  }

  @JsProperty
  float getRelease();

  @JsProperty
  void setRelease(float release);

  @JsOverlay
  @Nonnull
  default DynamicsCompressorOptions release(final float release) {
    setRelease( release );
    return this;
  }

  @JsProperty
  float getThreshold();

  @JsProperty
  void setThreshold(float threshold);

  @JsOverlay
  @Nonnull
  default DynamicsCompressorOptions threshold(final float threshold) {
    setThreshold( threshold );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DynamicsCompressorOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DynamicsCompressorOptions channelCountMode(@Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DynamicsCompressorOptions channelInterpretation(
      @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
