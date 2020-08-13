package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The AudioScheduledSourceNode interface—part of the Web Audio API—is a parent interface for several types of audio source node interfaces which share the ability to be started and stopped, optionally at specified times. Specifically, this interface defines the start() and stop() methods, as well as the onended event handler.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode">AudioScheduledSourceNode - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioScheduledSourceNode"
)
public class AudioScheduledSourceNode extends AudioNode {
  /**
   * The onended event handler for the AudioScheduledSourceNode interface specifies an EventHandler to be executed when the ended event occurs on the node. This event is sent to the node when the concrete interface (such as AudioBufferSourceNode, OscillatorNode, or ConstantSourceNode) determines that it has stopped playing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode/onended">AudioScheduledSourceNode.onended - MDN</a>
   */
  @Nullable
  public EventHandler onended;

  AudioScheduledSourceNode() {
  }

  /**
   * The start() method on AudioScheduledSourceNode schedules a sound to begin playback at the specified time. If no time is specified, then the sound begins playing immediately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode/start">AudioScheduledSourceNode.start - MDN</a>
   */
  public native void start(double when);

  /**
   * The start() method on AudioScheduledSourceNode schedules a sound to begin playback at the specified time. If no time is specified, then the sound begins playing immediately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode/start">AudioScheduledSourceNode.start - MDN</a>
   */
  public native void start();

  /**
   * The stop() method on AudioScheduledSourceNode schedules a sound to cease playback at the specified time. If no time is specified, then the sound stops playing immediately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode/stop">AudioScheduledSourceNode.stop - MDN</a>
   */
  public native void stop(double when);

  /**
   * The stop() method on AudioScheduledSourceNode schedules a sound to cease playback at the specified time. If no time is specified, then the sound stops playing immediately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode/stop">AudioScheduledSourceNode.stop - MDN</a>
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
}
