package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCDataChannel interface represents a network channel which can be used for bidirectional peer-to-peer transfers of arbitrary data. Every data channel is associated with an RTCPeerConnection, and each peer connection can have up to a theoretical maximum of 65,534 data channels (the actual limit may vary from browser to browser).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel">RTCDataChannel - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCDataChannel"
)
public class RTCDataChannel extends EventTarget {
  /**
   * The property binaryType on the RTCDataChannel interface is a DOMString which specifies the type of JavaScript object which should be used to represent binary data received on the RTCDataChannel. Values allowed by the WebSocket.binaryType property are also permitted here: "blob" if Blob objects are being used or "arraybuffer" if ArrayBuffer objects are being used. The default is "blob".
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/binaryType">RTCDataChannel.binaryType - MDN</a>
   */
  @Nonnull
  public String binaryType;

  /**
   * The RTCDataChannel property bufferedAmountLowThreshold is used to specify the number of bytes of buffered outgoing data that is considered "low." The default value is 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/bufferedAmountLowThreshold">RTCDataChannel.bufferedAmountLowThreshold - MDN</a>
   */
  public int bufferedAmountLowThreshold;

  @Nullable
  public EventHandler onbufferedamountlow;

  @Nullable
  public EventHandler onclose;

  @Nullable
  public EventHandler onclosing;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onmessage;

  @Nullable
  public EventHandler onopen;

  RTCDataChannel() {
  }

  /**
   * The read-only RTCDataChannel property bufferedAmount returns the number of bytes of data currently queued to be sent over the data channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/bufferedAmount">RTCDataChannel.bufferedAmount - MDN</a>
   */
  @JsProperty(
      name = "bufferedAmount"
  )
  public native int bufferedAmount();

  /**
   * The read-only RTCDataChannel property id returns an ID number (between 0 and 65,534) which uniquely identifies the RTCDataChannel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/id">RTCDataChannel.id - MDN</a>
   */
  @JsProperty(
      name = "id"
  )
  @Nullable
  public native Double id();

  /**
   * The read-only RTCDataChannel property label returns a DOMString containing a name describing the data channel. These labels are not required to be unique.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/label">RTCDataChannel.label - MDN</a>
   */
  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  /**
   * The read-only RTCDataChannel property maxPacketLifeTime returns the amount of time, in milliseconds, the browser is allowed to take to attempt to transmit a message, as set when the data channel was created, or null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/maxPacketLifeTime">RTCDataChannel.maxPacketLifeTime - MDN</a>
   */
  @JsProperty(
      name = "maxPacketLifeTime"
  )
  @Nullable
  public native Double maxPacketLifeTime();

  /**
   * The read-only RTCDataChannel property maxRetransmits returns the maximum number of times the browser should try to retransmit a message before giving up, as set when the data channel was created, or null, which indicates that there is no maximum.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/maxRetransmits">RTCDataChannel.maxRetransmits - MDN</a>
   */
  @JsProperty(
      name = "maxRetransmits"
  )
  @Nullable
  public native Double maxRetransmits();

  /**
   * The read-only RTCDataChannel property negotiated indicates whether the RTCDataChannel's connection was negotiated by the Web app (true) or by the WebRTC layer (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/negotiated">RTCDataChannel.negotiated - MDN</a>
   */
  @JsProperty(
      name = "negotiated"
  )
  public native boolean negotiated();

  /**
   * The read-only RTCDataChannel property ordered indicates whether or not the data channel guarantees in-order delivery of messages; the default is true, which indicates that the data channel is indeed ordered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/ordered">RTCDataChannel.ordered - MDN</a>
   */
  @JsProperty(
      name = "ordered"
  )
  public native boolean ordered();

  /**
   * The read-only RTCDataChannel property protocol returns a DOMString containing the name of the subprotocol in use. If no protocol was specified when the data channel was created, then this property's value is "" (the empty string).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/protocol">RTCDataChannel.protocol - MDN</a>
   */
  @JsProperty(
      name = "protocol"
  )
  @Nonnull
  public native String protocol();

  /**
   * The read-only RTCDataChannel property readyState returns an enum of type RTCDataChannelState which indicates the state of the data channel's underlying data connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/readyState">RTCDataChannel.readyState - MDN</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  public native String readyState();

  @JsProperty(
      name = "priority"
  )
  @Nonnull
  public native String priority();

  /**
   * The RTCDataChannel.close() method closes the RTCDataChannel. Either peer is permitted to call this method to initiate closure of the channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/close">RTCDataChannel.close - MDN</a>
   */
  public native void close();

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull String data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull Blob data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull ArrayBuffer data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull ArrayBufferView data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull Int8Array data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull Int16Array data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull Int32Array data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull Uint8Array data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull Uint16Array data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull Uint32Array data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull Uint8ClampedArray data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull Float32Array data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull Float64Array data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   */
  public native void send(@Nonnull DataView data);
}
