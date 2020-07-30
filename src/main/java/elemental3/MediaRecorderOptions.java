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
public interface MediaRecorderOptions {
  @JsOverlay
  @Nonnull
  static MediaRecorderOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getAudioBitrateMode();

  @JsProperty
  void setAudioBitrateMode(@Nonnull String audioBitrateMode);

  @JsOverlay
  @Nonnull
  default MediaRecorderOptions audioBitrateMode(@Nonnull final String audioBitrateMode) {
    setAudioBitrateMode( audioBitrateMode );
    return this;
  }

  @JsProperty
  int getAudioBitsPerSecond();

  @JsProperty
  void setAudioBitsPerSecond(int audioBitsPerSecond);

  @JsOverlay
  @Nonnull
  default MediaRecorderOptions audioBitsPerSecond(final int audioBitsPerSecond) {
    setAudioBitsPerSecond( audioBitsPerSecond );
    return this;
  }

  @JsProperty
  int getBitsPerSecond();

  @JsProperty
  void setBitsPerSecond(int bitsPerSecond);

  @JsOverlay
  @Nonnull
  default MediaRecorderOptions bitsPerSecond(final int bitsPerSecond) {
    setBitsPerSecond( bitsPerSecond );
    return this;
  }

  @JsProperty
  String getMimeType();

  @JsProperty
  void setMimeType(@Nonnull String mimeType);

  @JsOverlay
  @Nonnull
  default MediaRecorderOptions mimeType(@Nonnull final String mimeType) {
    setMimeType( mimeType );
    return this;
  }

  @JsProperty
  int getVideoBitsPerSecond();

  @JsProperty
  void setVideoBitsPerSecond(int videoBitsPerSecond);

  @JsOverlay
  @Nonnull
  default MediaRecorderOptions videoBitsPerSecond(final int videoBitsPerSecond) {
    setVideoBitsPerSecond( videoBitsPerSecond );
    return this;
  }
}
