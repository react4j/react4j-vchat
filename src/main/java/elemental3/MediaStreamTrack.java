package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The MediaStreamTrack interface represents a single media track within a stream; typically, these are audio or video tracks, but other track types may exist as well.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack">MediaStreamTrack - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStreamTrack"
)
public class MediaStreamTrack extends EventTarget {
  /**
   * The enabled property on the MediaStreamTrack interface is a Boolean value which is true if the track is allowed to render the source stream or false if it is not. This can be used to intentionally mute a track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/enabled">MediaStreamTrack.enabled - MDN</a>
   */
  public boolean enabled;

  /**
   * The MediaStreamTrack.onended event handler is used to specify a function which serves as an EventHandler to be called when the ended event occurs on the track. This event occurs when the track will no longer provide data to the stream for any reason, including the end of the media input being reached, the user revoking needed permissions, the source device being removed, or the remote peer ending a connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/onended">MediaStreamTrack.onended - MDN</a>
   */
  @Nullable
  public EventHandler onended;

  @Nullable
  public EventHandler onisolationchange;

  /**
   * MediaStreamTrack's onmute event handler is called when the mute event is received.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/onmute">MediaStreamTrack.onmute - MDN</a>
   */
  @Nullable
  public EventHandler onmute;

  /**
   * MediaStreamTrack's onunmute event handler is called when the unmute event is received. Such an event is sent when the track is again able to send data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/onunmute">MediaStreamTrack.onunmute - MDN</a>
   */
  @Nullable
  public EventHandler onunmute;

  protected MediaStreamTrack() {
  }

  /**
   * The MediaStreamTrack.id read-only property returns a DOMString containing a unique identifier (GUID) for the track, which is generated by the user agent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/id">MediaStreamTrack.id - MDN</a>
   */
  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  @JsProperty(
      name = "isolated"
  )
  public native boolean isolated();

  /**
   * The MediaStreamTrack.kind read-only property returns a DOMString set to &quot;audio&quot; if the track is an audio track and to &quot;video&quot;, if it is a video track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/kind">MediaStreamTrack.kind - MDN</a>
   */
  @JsProperty(
      name = "kind"
  )
  @Nonnull
  public native String kind();

  /**
   * The MediaStreamTrack.label read-only property returns a DOMString containing a user agent-assigned label that identifies the track source, as in &quot;internal microphone&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/label">MediaStreamTrack.label - MDN</a>
   */
  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  /**
   * The muted read-only property of the MediaStreamTrack interface returns a Boolean value indicating whether or not the track is currently unable to provide media output.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/muted">MediaStreamTrack.muted - MDN</a>
   */
  @JsProperty(
      name = "muted"
  )
  public native boolean muted();

  /**
   * The MediaStreamTrack.readyState read-only property returns an enumerated value giving the status of the track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/readyState">MediaStreamTrack.readyState - MDN</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  @MediaStreamTrackState
  public native String readyState();

  /**
   * The applyConstraints() method of the MediaStreamTrack interface applies a set of constraints to the track; these constraints let the Web site or app establish ideal values and acceptable ranges of values for the constrainable properties of the track, such as frame rate, dimensions, echo cancelation, and so forth.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/applyConstraints">MediaStreamTrack.applyConstraints - MDN</a>
   */
  @Nonnull
  public native Promise<Void> applyConstraints(@Nonnull MediaTrackConstraints constraints);

  /**
   * The applyConstraints() method of the MediaStreamTrack interface applies a set of constraints to the track; these constraints let the Web site or app establish ideal values and acceptable ranges of values for the constrainable properties of the track, such as frame rate, dimensions, echo cancelation, and so forth.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/applyConstraints">MediaStreamTrack.applyConstraints - MDN</a>
   */
  @Nonnull
  public native Promise<Void> applyConstraints();

  /**
   * The clone() method of the MediaStreamTrack interface creates a duplicate of the MediaStreamTrack. This new MediaStreamTrack object is identical except for its unique id.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/clone">MediaStreamTrack.clone - MDN</a>
   */
  @JsMethod(
      name = "clone"
  )
  @Nonnull
  public native MediaStreamTrack clone_();

  /**
   * The getCapabilities() method of the MediaStreamTrack interface returns a MediaTrackCapabilities object which specifies the values or range of values which each constrainable property, based upon the platform and user agent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/getCapabilities">MediaStreamTrack.getCapabilities - MDN</a>
   */
  @Nonnull
  public native MediaTrackCapabilities getCapabilities();

  /**
   * The getConstraints() method of the MediaStreamTrack interface returns a MediaTrackConstraints object containing the set of constraints most recently established for the track using a prior call to applyConstraints(). These constraints indicate values and ranges of values that the Web site or application has specified are required or acceptable for the included constrainable properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/getConstraints">MediaStreamTrack.getConstraints - MDN</a>
   */
  @Nonnull
  public native MediaTrackConstraints getConstraints();

  /**
   * The getSettings() method of the MediaStreamTrack interface returns a MediaTrackSettings object containing the current values of each of the constrainable properties for the current MediaStreamTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/getSettings">MediaStreamTrack.getSettings - MDN</a>
   */
  @Nonnull
  public native MediaTrackSettings getSettings();

  /**
   * The MediaStreamTrack.stop() method stops the track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack/stop">MediaStreamTrack.stop - MDN</a>
   */
  public native void stop();

  @JsOverlay
  public final void addEndedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "ended", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addEndedListener(@Nonnull final EventListener callback, final boolean options) {
    addEventListener( "ended", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addEndedListener(@Nonnull final EventListener callback) {
    addEventListener( "ended", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeEndedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "ended", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeEndedListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "ended", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeEndedListener(@Nonnull final EventListener callback) {
    removeEventListener( "ended", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMuteListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "mute", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMuteListener(@Nonnull final EventListener callback, final boolean options) {
    addEventListener( "mute", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMuteListener(@Nonnull final EventListener callback) {
    addEventListener( "mute", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMuteListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "mute", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMuteListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "mute", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMuteListener(@Nonnull final EventListener callback) {
    removeEventListener( "mute", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addUnmuteListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "unmute", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUnmuteListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "unmute", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUnmuteListener(@Nonnull final EventListener callback) {
    addEventListener( "unmute", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUnmuteListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "unmute", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUnmuteListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "unmute", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUnmuteListener(@Nonnull final EventListener callback) {
    removeEventListener( "unmute", Js.cast( callback ) );
  }
}
