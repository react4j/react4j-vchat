package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TrackEvent interface, which is part of the HTML DOM specification, is used for events which represent changes to a set of available tracks on an HTML media element; these events are addtrack and removetrack.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TrackEvent">TrackEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TrackEvent"
)
public class TrackEvent extends Event {
  public TrackEvent(@Nonnull final String type, @Nonnull final TrackEventInit eventInitDict) {
    super( null );
  }

  public TrackEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The read-only track property of the TrackEvent interface specifies the media track object to which the event applies.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TrackEvent/track">TrackEvent.track - MDN</a>
   */
  @JsProperty(
      name = "track"
  )
  @Nullable
  public native VideoTrackOrAudioTrackOrTextTrackUnion track();
}
