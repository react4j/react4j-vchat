package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStream"
)
public class MediaStream extends EventTarget {
  @Nullable
  public EventHandler onaddtrack;

  @Nullable
  public EventHandler onremovetrack;

  public MediaStream() {
  }

  public MediaStream(@Nonnull final MediaStream stream) {
  }

  public MediaStream(@Nonnull final JsArray<MediaStreamTrack> tracks) {
  }

  public MediaStream(@Nonnull final MediaStreamTrack[] tracks) {
  }

  @JsProperty(
      name = "active"
  )
  public native boolean active();

  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  public native void addTrack(@Nonnull MediaStreamTrack track);

  @JsMethod(
      name = "clone"
  )
  @Nonnull
  public native MediaStream clone_();

  @Nonnull
  public native JsArray<MediaStreamTrack> getAudioTracks();

  @Nullable
  public native MediaStreamTrack getTrackById(@Nonnull String trackId);

  @Nonnull
  public native JsArray<MediaStreamTrack> getTracks();

  @Nonnull
  public native JsArray<MediaStreamTrack> getVideoTracks();

  public native void removeTrack(@Nonnull MediaStreamTrack track);
}
