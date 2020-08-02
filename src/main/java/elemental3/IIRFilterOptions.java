package elemental3;

import elemental2.core.JsArray;
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
public interface IIRFilterOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static IIRFilterOptions create(@Nonnull final JsArray<Double> feedback,
      @Nonnull final JsArray<Double> feedforward) {
    return Js.<IIRFilterOptions>uncheckedCast( JsPropertyMap.of() ).feedback( feedback ).feedforward( feedforward );
  }

  @JsOverlay
  @Nonnull
  static IIRFilterOptions create(@Nonnull final Double[] feedback,
      @Nonnull final JsArray<Double> feedforward) {
    return Js.<IIRFilterOptions>uncheckedCast( JsPropertyMap.of() ).feedback( feedback ).feedforward( feedforward );
  }

  @JsOverlay
  @Nonnull
  static IIRFilterOptions create(@Nonnull final JsArray<Double> feedback,
      @Nonnull final Double[] feedforward) {
    return Js.<IIRFilterOptions>uncheckedCast( JsPropertyMap.of() ).feedback( feedback ).feedforward( feedforward );
  }

  @JsOverlay
  @Nonnull
  static IIRFilterOptions create(@Nonnull final Double[] feedback,
      @Nonnull final Double[] feedforward) {
    return Js.<IIRFilterOptions>uncheckedCast( JsPropertyMap.of() ).feedback( feedback ).feedforward( feedforward );
  }

  @JsProperty(
      name = "feedback"
  )
  @Nonnull
  JsArray<Double> feedback();

  @JsProperty
  void setFeedback(@Nonnull JsArray<Double> feedback);

  @JsOverlay
  @Nonnull
  default IIRFilterOptions feedback(@Nonnull final JsArray<Double> feedback) {
    setFeedback( feedback );
    return this;
  }

  @JsOverlay
  default void setFeedback(@Nonnull final Double... feedback) {
    setFeedback( JsArray.asJsArray( feedback ) );
  }

  @JsOverlay
  @Nonnull
  default IIRFilterOptions feedback(@Nonnull final Double... feedback) {
    setFeedback( feedback );
    return this;
  }

  @JsProperty(
      name = "feedforward"
  )
  @Nonnull
  JsArray<Double> feedforward();

  @JsProperty
  void setFeedforward(@Nonnull JsArray<Double> feedforward);

  @JsOverlay
  @Nonnull
  default IIRFilterOptions feedforward(@Nonnull final JsArray<Double> feedforward) {
    setFeedforward( feedforward );
    return this;
  }

  @JsOverlay
  default void setFeedforward(@Nonnull final Double... feedforward) {
    setFeedforward( JsArray.asJsArray( feedforward ) );
  }

  @JsOverlay
  @Nonnull
  default IIRFilterOptions feedforward(@Nonnull final Double... feedforward) {
    setFeedforward( feedforward );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default IIRFilterOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default IIRFilterOptions channelCountMode(@Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default IIRFilterOptions channelInterpretation(@Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
