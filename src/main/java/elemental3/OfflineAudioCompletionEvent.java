package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OfflineAudioCompletionEvent"
)
public class OfflineAudioCompletionEvent extends Event {
  public OfflineAudioCompletionEvent(@Nonnull final String type,
      @Nonnull final OfflineAudioCompletionEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "renderedBuffer"
  )
  @Nonnull
  public native AudioBuffer renderedBuffer();
}
