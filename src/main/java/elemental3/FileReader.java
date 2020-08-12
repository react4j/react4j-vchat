package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The FileReader object lets web applications asynchronously read the contents of files (or raw data buffers) stored on the user's computer, using File or Blob objects to specify the file or data to read.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader">FileReader - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileReader"
)
public class FileReader extends EventTarget {
  @JsOverlay
  public static final int DONE = 2;

  @JsOverlay
  public static final int EMPTY = 0;

  @JsOverlay
  public static final int LOADING = 1;

  /**
   * The FileReader.onabort property contains an event handler executed when the abort event is fired, i.e. when the process of reading the file is aborted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/onabort">FileReader.onabort - MDN</a>
   */
  @Nullable
  public EventHandler onabort;

  /**
   * The FileReader onerror handler receives an Event object, not an Error object, as a parameter, but an error can be accessed from the FileReader object, as instanceOfFileReader.error
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/onerror">FileReader.onerror - MDN</a>
   */
  @Nullable
  public EventHandler onerror;

  /**
   * The FileReader.onload property contains an event handler executed when the load event is fired, when content read with readAsArrayBuffer, readAsBinaryString, readAsDataURL or readAsText is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/onload">FileReader.onload - MDN</a>
   */
  @Nullable
  public EventHandler onload;

  @Nullable
  public EventHandler onloadend;

  @Nullable
  public EventHandler onloadstart;

  @Nullable
  public EventHandler onprogress;

  public FileReader() {
  }

  /**
   * The FileReader error property returns the error that occurred while reading the file.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/error">FileReader.error - MDN</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nullable
  public native DOMException error();

  /**
   * The FileReader readyState property provides the current state of the reading operation a FileReader is in. A FileReader exists in one of the following states:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readyState">FileReader.readyState - MDN</a>
   */
  @JsProperty(
      name = "readyState"
  )
  public native int readyState();

  /**
   * The FileReader result property returns the file's contents. This property is only valid after the read operation is complete, and the format of the data depends on which of the methods was used to initiate the read operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/result">FileReader.result - MDN</a>
   */
  @JsProperty(
      name = "result"
  )
  @Nullable
  public native StringOrArrayBufferUnion result();

  /**
   * The abort method aborts the read operation. Upon return, the readyState will be DONE.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/abort">FileReader.abort - MDN</a>
   */
  public native void abort();

  /**
   * The FileReader interface's readAsArrayBuffer() method is used to start reading the contents of a specified Blob or File. When the read operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result attribute contains an ArrayBuffer representing the file's data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsArrayBuffer">FileReader.readAsArrayBuffer - MDN</a>
   */
  public native void readAsArrayBuffer(@Nonnull Blob blob);

  /**
   * The readAsBinaryString method is used to start reading the contents of the specified Blob or File. When the read operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result attribute contains the raw binary data from the file.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsBinaryString">FileReader.readAsBinaryString - MDN</a>
   */
  public native void readAsBinaryString(@Nonnull Blob blob);

  /**
   * The readAsDataURL method is used to read the contents of the specified Blob or File. When the read operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result attribute contains the data as a data: URL representing the file's data as a base64 encoded string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsDataURL">FileReader.readAsDataURL - MDN</a>
   */
  public native void readAsDataURL(@Nonnull Blob blob);

  /**
   * The readAsText() method is used to read the contents of the specified Blob or File. When the read operation is complete, the readyState is changed to DONE, the loadend event is triggered, and the result property contains the contents of the file as a text string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsText">FileReader.readAsText - MDN</a>
   */
  public native void readAsText(@Nonnull Blob blob, @Nonnull String encoding);

  /**
   * The readAsText() method is used to read the contents of the specified Blob or File. When the read operation is complete, the readyState is changed to DONE, the loadend event is triggered, and the result property contains the contents of the file as a text string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsText">FileReader.readAsText - MDN</a>
   */
  public native void readAsText(@Nonnull Blob blob);
}
