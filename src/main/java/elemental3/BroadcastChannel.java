package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The BroadcastChannel interface represents a named channel that any browsing context of a given origin can subscribe to. It allows communication between different documents (in different windows, tabs, frames or iframes) of the same origin. Messages are broadcasted via a message event fired at all BroadcastChannel objects listening to the channel.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel">BroadcastChannel - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BroadcastChannel"
)
public class BroadcastChannel extends EventTarget {
  /**
   * The BroadcastChannel.onmessage event handler is a property that specifies the function to execute when a message event, of type MessageEvent, is received by this BroadcastChannel. Such an event is sent by the browser with a message broadcasted to the channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/onmessage">BroadcastChannel.onmessage - MDN</a>
   */
  @Nullable
  public EventHandler onmessage;

  /**
   * The onmessageerror event handler of the BroadcastChannel interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on the BroadcastChannel instance — that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/onmessageerror">BroadcastChannel.onmessageerror - MDN</a>
   */
  @Nullable
  public EventHandler onmessageerror;

  public BroadcastChannel(@Nonnull final String name) {
  }

  /**
   * The read-only BroadcastChannel.name property returns a DOMString, which uniquely identifies the given channel with its name. This name is passed to the BroadcastChannel() constructor at creation time and is therefore read-only.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/name">BroadcastChannel.name - MDN</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The BroadcastChannel.close() terminates the connection to the underlying channel, allowing the object to be garbage collected. This is a necessary step to perform as there is no other way for a browser to know that this channel is not needed anymore.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/close">BroadcastChannel.close - MDN</a>
   */
  public native void close();

  /**
   * The BroadcastChannel.postMessage() sends a message, which can be of any kind of Object, to each listener in any browsing context with the same origin. The message is transmitted as a message event targeted at each BroadcastChannel bound to the channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/postMessage">BroadcastChannel.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message);
}
