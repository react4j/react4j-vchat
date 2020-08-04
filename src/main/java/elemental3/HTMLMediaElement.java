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

/**
 * The HTMLMediaElement interface adds to HTMLElement the properties and methods needed to support basic media-related capabilities that are common to audio and video.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement">HTMLMediaElement - MDN</a>
 */
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

  /**
   * The HTMLMediaElement.autoplay property reflects the autoplay HTML attribute, indicating whether playback should automatically begin as soon as enough media is available to do so without interruption.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/autoplay">HTMLMediaElement.autoplay - MDN</a>
   */
  public boolean autoplay;

  /**
   * The HTMLMediaElement.controls property reflects the controls HTML attribute, which controls whether user interface controls for playing the media item will be displayed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/controls">HTMLMediaElement.controls - MDN</a>
   */
  public boolean controls;

  /**
   * The HTMLMediaElement.crossOrigin property is the CORS setting for this image element. See CORS settings attributes for details.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/crossOrigin">HTMLMediaElement.crossOrigin - MDN</a>
   */
  @Nullable
  public String crossOrigin;

  /**
   * The HTMLMediaElement interface's currentTime property specifies the current playback time in seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/currentTime">HTMLMediaElement.currentTime - MDN</a>
   */
  public double currentTime;

  /**
   * The HTMLMediaElement.defaultMuted property reflects the muted HTML attribute, which indicates whether the media element's audio output should be muted by default. This property has no dynamic effect. To mute and unmute the audio output, use the muted property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/defaultMuted">HTMLMediaElement.defaultMuted - MDN</a>
   */
  public boolean defaultMuted;

  /**
   * The HTMLMediaElement.defaultPlaybackRate property indicates the default playback rate for the media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/defaultPlaybackRate">HTMLMediaElement.defaultPlaybackRate - MDN</a>
   */
  public double defaultPlaybackRate;

  /**
   * The HTMLMediaElement.loop property reflects the loop HTML attribute, which controls whether the media element should start over when it reaches the end.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/loop">HTMLMediaElement.loop - MDN</a>
   */
  public boolean loop;

  /**
   * The HTMLMediaElement.muted indicates whether the media element muted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/muted">HTMLMediaElement.muted - MDN</a>
   */
  public boolean muted;

  /**
   * The HTMLMediaElement.playbackRate property sets the rate at which the media is being played back. This is used to implement user controls for fast forward, slow motion, and so forth. The normal playback rate is multiplied by this value to obtain the current rate, so a value of 1.0 indicates normal speed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/playbackRate">HTMLMediaElement.playbackRate - MDN</a>
   */
  public double playbackRate;

  @Nonnull
  public String preload;

  /**
   * The HTMLMediaElement.src property reflects the value of the HTML media element's src attribute, which indicates the URL of a media resource to use in the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/src">HTMLMediaElement.src - MDN</a>
   */
  @Nonnull
  public String src;

  /**
   * The srcObject property of the HTMLMediaElement interface sets or returns the object which serves as the source of the media associated with the HTMLMediaElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/srcObject">HTMLMediaElement.srcObject - MDN</a>
   */
  @Nullable
  public MediaProvider srcObject;

  /**
   * The HTMLMediaElement.volume property sets the volume at which the media will be played.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/volume">HTMLMediaElement.volume - MDN</a>
   */
  public double volume;

  @Nullable
  public EventHandler onencrypted;

  @Nullable
  public EventHandler onwaitingforkey;

  HTMLMediaElement() {
  }

  /**
   * The read-only audioTracks property on HTMLMediaElement objects returns an AudioTrackList object listing all of the  AudioTrack objects representing the media element's audio tracks.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/audioTracks">HTMLMediaElement.audioTracks - MDN</a>
   */
  @JsProperty(
      name = "audioTracks"
  )
  @Nonnull
  public native AudioTrackList audioTracks();

  /**
   * The HTMLMediaElement.buffered read-only property returns a new TimeRanges object that indicates the ranges of the media source that the browser has buffered (if any) at the moment the buffered property is accessed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/buffered">HTMLMediaElement.buffered - MDN</a>
   */
  @JsProperty(
      name = "buffered"
  )
  @Nonnull
  public native TimeRanges buffered();

  /**
   * The HTMLMediaElement.currentSrc property contains the absolute URL of the chosen media resource. This could happen, for example, if the web server selects a media file based on the resolution of the user's display. The value is an empty string if the networkState property is EMPTY.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/currentSrc">HTMLMediaElement.currentSrc - MDN</a>
   */
  @JsProperty(
      name = "currentSrc"
  )
  @Nonnull
  public native String currentSrc();

  /**
   * The read-only HTMLMediaElement property duration indicates the length of the element's media in seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/duration">HTMLMediaElement.duration - MDN</a>
   */
  @JsProperty(
      name = "duration"
  )
  public native double duration();

  /**
   * The HTMLMediaElement.ended indicates whether the media element has ended playback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/ended">HTMLMediaElement.ended - MDN</a>
   */
  @JsProperty(
      name = "ended"
  )
  public native boolean ended();

  /**
   * The HTMLMediaElement.error is the MediaError object for the most recent error, or null if there has not been an error. When an error event is received by the element, you can determine details about what happened by examining this object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/error">HTMLMediaElement.error - MDN</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nullable
  public native MediaError error();

  /**
   * The HTMLMediaElement.networkState property indicates the current state of the fetching of media over the network.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/networkState">HTMLMediaElement.networkState - MDN</a>
   */
  @JsProperty(
      name = "networkState"
  )
  public native int networkState();

  /**
   * The read-only HTMLMediaElement.paused property tells whether the media element is paused.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/paused">HTMLMediaElement.paused - MDN</a>
   */
  @JsProperty(
      name = "paused"
  )
  public native boolean paused();

  @JsProperty(
      name = "played"
  )
  @Nonnull
  public native TimeRanges played();

  /**
   * The HTMLMediaElement.readyState property indicates the readiness state of the media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/readyState">HTMLMediaElement.readyState - MDN</a>
   */
  @JsProperty(
      name = "readyState"
  )
  public native int readyState();

  /**
   * The seekable read-only property of the HTMLMediaElement returns a TimeRanges object that contains the time ranges that the user is able to seek to, if any.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/seekable">HTMLMediaElement.seekable - MDN</a>
   */
  @JsProperty(
      name = "seekable"
  )
  @Nonnull
  public native TimeRanges seekable();

  @JsProperty(
      name = "seeking"
  )
  public native boolean seeking();

  /**
   * The read-only textTracks property on HTMLMediaElement objects returns a TextTrackList object listing all of the TextTrack objects representing the media element's text tracks
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/textTracks">HTMLMediaElement.textTracks - MDN</a>
   */
  @JsProperty(
      name = "textTracks"
  )
  @Nonnull
  public native TextTrackList textTracks();

  /**
   * The read-only videoTracks property on HTMLMediaElement objects returns a VideoTrackList object listing all of the VideoTrack objects representing the media element's video tracks.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/videoTracks">HTMLMediaElement.videoTracks - MDN</a>
   */
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

  /**
   * The HTMLMediaElement method canPlayType() reports how likely it is that the current browser will be able to play media of a given MIME type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/canPlayType">HTMLMediaElement.canPlayType - MDN</a>
   */
  @Nonnull
  public native String canPlayType(@Nonnull String type);

  /**
   * The HTMLMediaElement.fastSeek() method quickly seeks the media to the new time with precision tradeoff.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/fastSeek">HTMLMediaElement.fastSeek - MDN</a>
   */
  public native void fastSeek(double time);

  @Nonnull
  public native Object getStartDate();

  /**
   * The HTMLMediaElement method load() resets the media element to its initial state and begins the process of selecting a media source and loading the media in preparation for playback to begin at the beginning.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/load">HTMLMediaElement.load - MDN</a>
   */
  public native void load();

  /**
   * The HTMLMediaElement.pause() method will pause playback of the media, if the media is already in a paused state this method will have no effect.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/pause">HTMLMediaElement.pause - MDN</a>
   */
  public native void pause();

  /**
   * The HTMLMediaElement play() method attempts to begin playback of the media. It returns a Promise which is resolved when playback has been successfully started.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/play">HTMLMediaElement.play - MDN</a>
   */
  @Nonnull
  public native Promise<Void> play();

  /**
   * The setMediaKeys() property of the HTMLMediaElement interface returns a Promise that resolves to the passed MediaKeys, which are those used to decrypt media during playback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/setMediaKeys">HTMLMediaElement.setMediaKeys - MDN</a>
   */
  @Nonnull
  public native Promise<Void> setMediaKeys(@Nullable MediaKeys mediaKeys);
}
