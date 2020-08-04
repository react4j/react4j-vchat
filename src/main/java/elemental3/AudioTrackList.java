package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioTrackList interface is used to represent a list of the audio tracks contained within a given HTML media element, with each track represented by a separate AudioTrack object in the list.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrackList">AudioTrackList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioTrackList"
)
public class AudioTrackList extends EventTarget {
  @Nullable
  public EventHandler onaddtrack;

  @Nullable
  public EventHandler onchange;

  @Nullable
  public EventHandler onremovetrack;

  AudioTrackList() {
  }

  /**
   * The read-only AudioTrackList property length returns the number of entries in the AudioTrackList, each of which is an AudioTrack representing one audio track in the media element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrackList/length">AudioTrackList.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The AudioTrackList method getTrackById() returns the first AudioTrack object from the track list whose id matches the specified string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrackList/getTrackById">AudioTrackList.getTrackById - MDN</a>
   */
  @Nullable
  public native AudioTrack getTrackById(@Nonnull String id);
}
