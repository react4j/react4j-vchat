package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

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
}
