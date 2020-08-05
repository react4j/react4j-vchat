package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The VideoTrackList interface is used to represent a list of the video tracks contained within a video element, with each track represented by a separate VideoTrack object in the list.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrackList">VideoTrackList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoTrackList"
)
public class VideoTrackList extends EventTarget {
  /**
   * The VideoTrackList property onaddtrack is an event handler which is called when the addtrack event occurs, indicating that a new video track has been added to the media element whose video tracks the VideoTrackList represents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrackList/onaddtrack">VideoTrackList.onaddtrack - MDN</a>
   */
  @Nullable
  public TrackEventHandler onaddtrack;

  /**
   * The VideoTrackList property onchange is an event handler which is called when the change event occurs, indicating that a VideoTrack in the VideoTrackList has been made active.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrackList/onchange">VideoTrackList.onchange - MDN</a>
   */
  @Nullable
  public EventHandler onchange;

  /**
   * The VideoTrackList onremovetrack event handler is called when the removetrack event occurs, indicating that a video track has been removed from the media element, and therefore also from the VideoTrackList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrackList/onremovetrack">VideoTrackList.onremovetrack - MDN</a>
   */
  @Nullable
  public TrackEventHandler onremovetrack;

  VideoTrackList() {
  }

  /**
   * The read-only VideoTrackList property length returns the number of entries in the VideoTrackList, each of which is a VideoTrack representing one video track in the media element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrackList/length">VideoTrackList.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The read-only VideoTrackList property selectedIndex returns the index of the currently selected track, if any, or -1 otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrackList/selectedIndex">VideoTrackList.selectedIndex - MDN</a>
   */
  @JsProperty(
      name = "selectedIndex"
  )
  public native int selectedIndex();

  /**
   * The VideoTrackList method getTrackById() returns the first VideoTrack object from the track list whose id matches the specified string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrackList/getTrackById">VideoTrackList.getTrackById - MDN</a>
   */
  @Nullable
  public native VideoTrack getTrackById(@Nonnull String id);
}
