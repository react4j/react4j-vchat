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
public interface AudioParamDescriptor {
  @JsOverlay
  @Nonnull
  static AudioParamDescriptor create(@Nonnull final String name) {
    return Js.<AudioParamDescriptor>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty
  String getAutomationRate();

  @JsProperty
  void setAutomationRate(@Nonnull String automationRate);

  @JsOverlay
  @Nonnull
  default AudioParamDescriptor automationRate(@Nonnull final String automationRate) {
    setAutomationRate( automationRate );
    return this;
  }

  @JsProperty
  float getDefaultValue();

  @JsProperty
  void setDefaultValue(float defaultValue);

  @JsOverlay
  @Nonnull
  default AudioParamDescriptor defaultValue(final float defaultValue) {
    setDefaultValue( defaultValue );
    return this;
  }

  @JsProperty
  float getMaxValue();

  @JsProperty
  void setMaxValue(float maxValue);

  @JsOverlay
  @Nonnull
  default AudioParamDescriptor maxValue(final float maxValue) {
    setMaxValue( maxValue );
    return this;
  }

  @JsProperty
  float getMinValue();

  @JsProperty
  void setMinValue(float minValue);

  @JsOverlay
  @Nonnull
  default AudioParamDescriptor minValue(final float minValue) {
    setMinValue( minValue );
    return this;
  }

  @JsProperty
  @Nonnull
  String getName();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default AudioParamDescriptor name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
