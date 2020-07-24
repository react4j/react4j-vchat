package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLMediaElement"
)
public class HTMLMediaElement extends HTMLElement {
  @JsOverlay
  public static final int HAVE_CURRENT_DATA = 2;

  @JsOverlay
  public static final int HAVE_ENOUGH_DATA = 4;

  @JsOverlay
  public static final int HAVE_FUTURE_DATA = 3;

  @JsOverlay
  public static final int HAVE_METADATA = 1;

  @JsOverlay
  public static final int HAVE_NOTHING = 0;

  @JsOverlay
  public static final int NETWORK_EMPTY = 0;

  @JsOverlay
  public static final int NETWORK_IDLE = 1;

  @JsOverlay
  public static final int NETWORK_LOADING = 2;

  @JsOverlay
  public static final int NETWORK_NO_SOURCE = 3;

  public boolean autoplay;

  public boolean controls;

  @Nullable
  public String crossOrigin;

  public double currentTime;

  public boolean defaultMuted;

  public double defaultPlaybackRate;

  public boolean loop;

  public boolean muted;

  public double playbackRate;

  @Nonnull
  public String preload;

  @Nonnull
  public String src;

  @Nullable
  public MediaProvider srcObject;

  public double volume;

  @Nullable
  public EventHandler onencrypted;

  @Nullable
  public EventHandler onwaitingforkey;

  HTMLMediaElement() {
  }

  @JsProperty(
      name = "audioTracks"
  )
  @Nonnull
  public native AudioTrackList audioTracks();

  @JsProperty(
      name = "buffered"
  )
  @Nonnull
  public native TimeRanges buffered();

  @JsProperty(
      name = "currentSrc"
  )
  @Nonnull
  public native String currentSrc();

  @JsProperty(
      name = "duration"
  )
  public native double duration();

  @JsProperty(
      name = "ended"
  )
  public native boolean ended();

  @JsProperty(
      name = "error"
  )
  @Nullable
  public native MediaError error();

  @JsProperty(
      name = "networkState"
  )
  public native int networkState();

  @JsProperty(
      name = "paused"
  )
  public native boolean paused();

  @JsProperty(
      name = "played"
  )
  @Nonnull
  public native TimeRanges played();

  @JsProperty(
      name = "readyState"
  )
  public native int readyState();

  @JsProperty(
      name = "seekable"
  )
  @Nonnull
  public native TimeRanges seekable();

  @JsProperty(
      name = "seeking"
  )
  public native boolean seeking();

  @JsProperty(
      name = "textTracks"
  )
  @Nonnull
  public native TextTrackList textTracks();

  @JsProperty(
      name = "videoTracks"
  )
  @Nonnull
  public native VideoTrackList videoTracks();

  @JsProperty(
      name = "mediaKeys"
  )
  @Nullable
  public native MediaKeys mediaKeys();

  @Nonnull
  public native TextTrack addTextTrack(
      @MagicConstant(stringValues = {"captions", "chapters", "descriptions", "metadata", "subtitles"}) @Nonnull String kind,
      @Nonnull String label, @Nonnull String language);

  @Nonnull
  public native TextTrack addTextTrack(
      @MagicConstant(stringValues = {"captions", "chapters", "descriptions", "metadata", "subtitles"}) @Nonnull String kind,
      @Nonnull String label);

  @Nonnull
  public native TextTrack addTextTrack(
      @MagicConstant(stringValues = {"captions", "chapters", "descriptions", "metadata", "subtitles"}) @Nonnull String kind);

  @Nonnull
  public native String canPlayType(@Nonnull String type);

  public native void fastSeek(double time);

  @Nonnull
  public native Object getStartDate();

  public native void load();

  public native void pause();

  @Nonnull
  public native Promise<Void> play();

  @Nonnull
  public native Promise<Void> setMediaKeys(@Nullable MediaKeys mediaKeys);
}
