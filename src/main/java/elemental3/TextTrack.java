package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextTrack"
)
public class TextTrack extends EventTarget {
  @Nonnull
  public String mode;

  @Nullable
  public EventHandler oncuechange;

  TextTrack() {
  }

  @JsProperty(
      name = "activeCues"
  )
  @Nullable
  public native TextTrackCueList activeCues();

  @JsProperty(
      name = "cues"
  )
  @Nullable
  public native TextTrackCueList cues();

  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  @JsProperty(
      name = "inBandMetadataTrackDispatchType"
  )
  @Nonnull
  public native String inBandMetadataTrackDispatchType();

  @JsProperty(
      name = "kind"
  )
  @Nonnull
  public native String kind();

  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  @JsProperty(
      name = "language"
  )
  @Nonnull
  public native String language();

  @JsProperty(
      name = "sourceBuffer"
  )
  @Nullable
  public native SourceBuffer sourceBuffer();

  public native void addCue(@Nonnull TextTrackCue cue);

  public native void removeCue(@Nonnull TextTrackCue cue);
}
