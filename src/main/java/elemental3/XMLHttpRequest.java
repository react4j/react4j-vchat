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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import org.intellij.lang.annotations.MagicConstant;

/**
 * XMLHttpRequest (XHR) objects are used to interact with servers. You can retrieve data from a URL without having to do a full page refresh. This enables a Web page to update just part of a page without disrupting what the user is doing.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest">XMLHttpRequest - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XMLHttpRequest"
)
public class XMLHttpRequest extends XMLHttpRequestEventTarget {
  @JsOverlay
  public static final int DONE = 4;

  @JsOverlay
  public static final int HEADERS_RECEIVED = 2;

  @JsOverlay
  public static final int LOADING = 3;

  @JsOverlay
  public static final int OPENED = 1;

  @JsOverlay
  public static final int UNSENT = 0;

  /**
   * An EventHandler that is called whenever the readyState attribute changes. The callback is called from the user interface thread. The XMLHttpRequest.onreadystatechange property contains the event handler to be called when the readystatechange event is fired, that is every time the readyState property of the XMLHttpRequest changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/onreadystatechange">XMLHttpRequest.onreadystatechange - MDN</a>
   */
  @Nullable
  public EventHandler onreadystatechange;

  /**
   * The XMLHttpRequest property responseType is an enumerated string value specifying the type of data contained in the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/responseType">XMLHttpRequest.responseType - MDN</a>
   */
  @Nonnull
  @MagicConstant(
      valuesFromClass = XMLHttpRequestResponseType.class
  )
  public String responseType;

  /**
   * The XMLHttpRequest.timeout property is an unsigned long representing the number of milliseconds a request can take before automatically being terminated. The default value is 0, which means there is no timeout. Timeout shouldn't be used for synchronous XMLHttpRequests requests used in a document environment or it will throw an InvalidAccessError exception. When a timeout happens, a timeout event is fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/timeout">XMLHttpRequest.timeout - MDN</a>
   */
  public int timeout;

  /**
   * The XMLHttpRequest.withCredentials property is a Boolean that indicates whether or not cross-site Access-Control requests should be made using credentials such as cookies, authorization headers or TLS client certificates. Setting withCredentials has no effect on same-site requests.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/withCredentials">XMLHttpRequest.withCredentials - MDN</a>
   */
  public boolean withCredentials;

  /**
   * The XMLHttpRequest() constructor creates a new XMLHttpRequest.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/XMLHttpRequest">XMLHttpRequest.XMLHttpRequest - MDN</a>
   */
  public XMLHttpRequest() {
  }

  /**
   * The XMLHttpRequest.readyState property returns the state an XMLHttpRequest client is in. An XHR client exists in one of the following states:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/readyState">XMLHttpRequest.readyState - MDN</a>
   */
  @JsProperty(
      name = "readyState"
  )
  public native int readyState();

  /**
   * The XMLHttpRequest response property returns the response's body content as an ArrayBuffer, Blob, Document, JavaScript Object, or DOMString, depending on the value of the request's responseType property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/response">XMLHttpRequest.response - MDN</a>
   */
  @JsProperty(
      name = "response"
  )
  @Nullable
  public native Any response();

  /**
   * The read-only XMLHttpRequest property responseText returns the text received from a server following a request being sent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/responseText">XMLHttpRequest.responseText - MDN</a>
   */
  @JsProperty(
      name = "responseText"
  )
  @Nonnull
  public native String responseText();

  /**
   * The read-only XMLHttpRequest.responseURL property returns the serialized URL of the response or the empty string if the URL is null. If the URL is returned, any URL fragment present in the URL will be stripped away. The value of responseURL will be the final URL obtained after any redirects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/responseURL">XMLHttpRequest.responseURL - MDN</a>
   */
  @JsProperty(
      name = "responseURL"
  )
  @Nonnull
  public native String responseURL();

  /**
   * The XMLHttpRequest.responseXML read-only property returns a Document containing the HTML or XML retrieved by the request; or null if the request was unsuccessful, has not yet been sent, or if the data can't be parsed as XML or HTML.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/responseXML">XMLHttpRequest.responseXML - MDN</a>
   */
  @JsProperty(
      name = "responseXML"
  )
  @Nullable
  public native Document responseXML();

  /**
   * The read-only XMLHttpRequest.status property returns the numerical HTTP status code of the XMLHttpRequest's response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/status">XMLHttpRequest.status - MDN</a>
   */
  @JsProperty(
      name = "status"
  )
  public native int status();

  /**
   * The read-only XMLHttpRequest.statusText property returns a DOMString containing the response's status message as returned by the HTTP server. Unlike XMLHTTPRequest.status which indicates a numerical status code, this property contains the text of the response status, such as &quot;OK&quot; or &quot;Not Found&quot;. If the request's readyState is in UNSENT or OPENED state, the value of statusText will be an empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/statusText">XMLHttpRequest.statusText - MDN</a>
   */
  @JsProperty(
      name = "statusText"
  )
  @Nonnull
  public native String statusText();

  /**
   * The XMLHttpRequest upload property returns an XMLHttpRequestUpload object that can be observed to monitor an upload's progress.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/upload">XMLHttpRequest.upload - MDN</a>
   */
  @JsProperty(
      name = "upload"
  )
  @Nonnull
  public native XMLHttpRequestUpload upload();

  /**
   * The XMLHttpRequest.abort() method aborts the request if it has already been sent. When a request is aborted, its readyState is changed to XMLHttpRequest.UNSENT (0) and the request's status code is set to 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/abort">XMLHttpRequest.abort - MDN</a>
   */
  public native void abort();

  /**
   * The XMLHttpRequest method getAllResponseHeaders() returns all the response headers, separated by CRLF, as a string, or returns null if no response has been received.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/getAllResponseHeaders">XMLHttpRequest.getAllResponseHeaders - MDN</a>
   */
  @Nonnull
  public native String getAllResponseHeaders();

  /**
   * The XMLHttpRequest method getResponseHeader() returns the string containing the text of a particular header's value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/getResponseHeader">XMLHttpRequest.getResponseHeader - MDN</a>
   */
  @Nullable
  public native String getResponseHeader(@Nonnull String name);

  /**
   * The XMLHttpRequest method open() initializes a newly-created request, or re-initializes an existing one.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/open">XMLHttpRequest.open - MDN</a>
   */
  public native void open(@Nonnull String method, @Nonnull String url);

  /**
   * The XMLHttpRequest method open() initializes a newly-created request, or re-initializes an existing one.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/open">XMLHttpRequest.open - MDN</a>
   */
  public native void open(@Nonnull String method, @Nonnull String url, boolean async,
      @Nullable String username, @Nullable String password);

  /**
   * The XMLHttpRequest method open() initializes a newly-created request, or re-initializes an existing one.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/open">XMLHttpRequest.open - MDN</a>
   */
  public native void open(@Nonnull String method, @Nonnull String url, boolean async,
      @Nullable String username);

  /**
   * The XMLHttpRequest method open() initializes a newly-created request, or re-initializes an existing one.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/open">XMLHttpRequest.open - MDN</a>
   */
  public native void open(@Nonnull String method, @Nonnull String url, boolean async);

  /**
   * The XMLHttpRequest method overrideMimeType() specifies a MIME type other than the one provided by the server to be used instead when interpreting the data being transferred in a request.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/overrideMimeType">XMLHttpRequest.overrideMimeType - MDN</a>
   */
  public native void overrideMimeType(@Nonnull String mime);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Document body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull XMLHttpRequestBodyInit body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Blob body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull BufferSource body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull ArrayBufferView body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Int8Array body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Int16Array body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Int32Array body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Uint8Array body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Uint16Array body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Uint32Array body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Uint8ClampedArray body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Float32Array body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull Float64Array body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull DataView body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull ArrayBuffer body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull FormData body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull URLSearchParams body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send(@Nonnull String body);

  /**
   * The XMLHttpRequest method send() sends the request to the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/send">XMLHttpRequest.send - MDN</a>
   */
  public native void send();

  /**
   * The XMLHttpRequest method setRequestHeader() sets the value of an HTTP request header. When using setRequestHeader(), you must call it after calling open(), but before calling send(). If this method is called several times with the same header, the values are merged into one single request header.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/setRequestHeader">XMLHttpRequest.setRequestHeader - MDN</a>
   */
  public native void setRequestHeader(@Nonnull String name, @Nonnull String value);

  @JsOverlay
  public final void addAbortListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    addEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    removeEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    addEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    removeEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadendListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "loadend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadendListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    addEventListener( "loadend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadendListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "loadend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadendListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "loadend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadendListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    removeEventListener( "loadend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadendListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "loadend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "loadstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    addEventListener( "loadstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "loadstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "loadstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    removeEventListener( "loadstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "loadstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "progress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    addEventListener( "progress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "progress", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "progress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    removeEventListener( "progress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "progress", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTimeoutListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "timeout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTimeoutListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    addEventListener( "timeout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTimeoutListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "timeout", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTimeoutListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "timeout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTimeoutListener(@Nonnull final ProgressEventListener callback,
      final boolean options) {
    removeEventListener( "timeout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTimeoutListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "timeout", Js.cast( callback ) );
  }
}
