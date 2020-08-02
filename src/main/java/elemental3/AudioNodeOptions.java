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
public interface AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static AudioNodeOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "channelCount"
  )
  int channelCount();

  @JsProperty
  void setChannelCount(int channelCount);

  @JsOverlay
  @Nonnull
  default AudioNodeOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsProperty(
      name = "channelCountMode"
  )
  String channelCountMode();

  @JsProperty
  void setChannelCountMode(@Nonnull String channelCountMode);

  @JsOverlay
  @Nonnull
  default AudioNodeOptions channelCountMode(@Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsProperty(
      name = "channelInterpretation"
  )
  String channelInterpretation();

  @JsProperty
  void setChannelInterpretation(@Nonnull String channelInterpretation);

  @JsOverlay
  @Nonnull
  default AudioNodeOptions channelInterpretation(@Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
