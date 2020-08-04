package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TextTrackList interface is used to represent a list of the text tracks defined by the track element, with each track represented by a separate textTrack object in the list.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList">TextTrackList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextTrackList"
)
public class TextTrackList extends EventTarget {
  @Nullable
  public EventHandler onaddtrack;

  @Nullable
  public EventHandler onchange;

  @Nullable
  public EventHandler onremovetrack;

  TextTrackList() {
  }

  /**
   * The read-only TextTrackList property length returns the number of entries in the TextTrackList, each of which is a TextTrack representing one track in the media element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/length">TextTrackList.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The TextTrackList method getTrackById() returns the first TextTrack object from the track list whose id matches the specified string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/getTrackById">TextTrackList.getTrackById - MDN</a>
   */
  @Nullable
  public native TextTrack getTrackById(@Nonnull String id);
}
