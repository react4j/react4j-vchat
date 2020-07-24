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
public interface PannerOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static PannerOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  double getConeInnerAngle();

  @JsProperty
  void setConeInnerAngle(double coneInnerAngle);

  @JsOverlay
  @Nonnull
  default PannerOptions coneInnerAngle(final double coneInnerAngle) {
    setConeInnerAngle( coneInnerAngle );
    return this;
  }

  @JsProperty
  double getConeOuterAngle();

  @JsProperty
  void setConeOuterAngle(double coneOuterAngle);

  @JsOverlay
  @Nonnull
  default PannerOptions coneOuterAngle(final double coneOuterAngle) {
    setConeOuterAngle( coneOuterAngle );
    return this;
  }

  @JsProperty
  double getConeOuterGain();

  @JsProperty
  void setConeOuterGain(double coneOuterGain);

  @JsOverlay
  @Nonnull
  default PannerOptions coneOuterGain(final double coneOuterGain) {
    setConeOuterGain( coneOuterGain );
    return this;
  }

  @JsProperty
  String getDistanceModel();

  @JsProperty
  void setDistanceModel(@Nonnull String distanceModel);

  @JsOverlay
  @Nonnull
  default PannerOptions distanceModel(@Nonnull final String distanceModel) {
    setDistanceModel( distanceModel );
    return this;
  }

  @JsProperty
  double getMaxDistance();

  @JsProperty
  void setMaxDistance(double maxDistance);

  @JsOverlay
  @Nonnull
  default PannerOptions maxDistance(final double maxDistance) {
    setMaxDistance( maxDistance );
    return this;
  }

  @JsProperty
  float getOrientationX();

  @JsProperty
  void setOrientationX(float orientationX);

  @JsOverlay
  @Nonnull
  default PannerOptions orientationX(final float orientationX) {
    setOrientationX( orientationX );
    return this;
  }

  @JsProperty
  float getOrientationY();

  @JsProperty
  void setOrientationY(float orientationY);

  @JsOverlay
  @Nonnull
  default PannerOptions orientationY(final float orientationY) {
    setOrientationY( orientationY );
    return this;
  }

  @JsProperty
  float getOrientationZ();

  @JsProperty
  void setOrientationZ(float orientationZ);

  @JsOverlay
  @Nonnull
  default PannerOptions orientationZ(final float orientationZ) {
    setOrientationZ( orientationZ );
    return this;
  }

  @JsProperty
  String getPanningModel();

  @JsProperty
  void setPanningModel(@Nonnull String panningModel);

  @JsOverlay
  @Nonnull
  default PannerOptions panningModel(@Nonnull final String panningModel) {
    setPanningModel( panningModel );
    return this;
  }

  @JsProperty
  float getPositionX();

  @JsProperty
  void setPositionX(float positionX);

  @JsOverlay
  @Nonnull
  default PannerOptions positionX(final float positionX) {
    setPositionX( positionX );
    return this;
  }

  @JsProperty
  float getPositionY();

  @JsProperty
  void setPositionY(float positionY);

  @JsOverlay
  @Nonnull
  default PannerOptions positionY(final float positionY) {
    setPositionY( positionY );
    return this;
  }

  @JsProperty
  float getPositionZ();

  @JsProperty
  void setPositionZ(float positionZ);

  @JsOverlay
  @Nonnull
  default PannerOptions positionZ(final float positionZ) {
    setPositionZ( positionZ );
    return this;
  }

  @JsProperty
  double getRefDistance();

  @JsProperty
  void setRefDistance(double refDistance);

  @JsOverlay
  @Nonnull
  default PannerOptions refDistance(final double refDistance) {
    setRefDistance( refDistance );
    return this;
  }

  @JsProperty
  double getRolloffFactor();

  @JsProperty
  void setRolloffFactor(double rolloffFactor);

  @JsOverlay
  @Nonnull
  default PannerOptions rolloffFactor(final double rolloffFactor) {
    setRolloffFactor( rolloffFactor );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PannerOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PannerOptions channelCountMode(@Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PannerOptions channelInterpretation(@Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
