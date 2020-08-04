package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Location interface represents the location (URL) of the object it is linked to. Changes done on it are reflected on the object it relates to. Both the Document and Window interface have such a linked Location, accessible via Document.location and Window.location respectively.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location">Location - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Location"
)
public class Location {
  /**
   * The hash property of the Location interface returns a USVString containing a '#' followed by the fragment identifier of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/hash">Location.hash - MDN</a>
   */
  @Nonnull
  public String hash;

  /**
   * The host property of the Location interface is a USVString containing the host, that is the hostname, and then, if the port of the URL is nonempty, a ':', and the port of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/host">Location.host - MDN</a>
   */
  @Nonnull
  public String host;

  /**
   * The hostname property of the Location interface is a USVString containing the domain of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/hostname">Location.hostname - MDN</a>
   */
  @Nonnull
  public String hostname;

  /**
   * The pathname property of the Location interface is a USVString containing an initial '/' followed by the path of the URL (or the empty string if there is no path).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/pathname">Location.pathname - MDN</a>
   */
  @Nonnull
  public String pathname;

  /**
   * The port property of the Location interface is a USVString containing the port number of the URL. If the URL does not contain an explicit port number, it will be set to ''.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/port">Location.port - MDN</a>
   */
  @Nonnull
  public String port;

  /**
   * The protocol property of the Location interface is a USVString representing the protocol scheme of the URL, including the final ':'.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/protocol">Location.protocol - MDN</a>
   */
  @Nonnull
  public String protocol;

  /**
   * The search property of the Location interface is a search string, also called a query string; that is, a USVString containing a '?' followed by the parameters of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/search">Location.search - MDN</a>
   */
  @Nonnull
  public String search;

  /**
   * The href property of the Location interface is a stringifier that returns a USVString containing the whole URL, and allows the href to be updated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/href">Location.href - MDN</a>
   */
  @Nonnull
  public String href;

  Location() {
  }

  /**
   * The ancestorOrigins read-only property of the Location interface is a static DOMStringList containing, in reverse order, the origins of all ancestor browsing contexts of the document associated with the given Location object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/ancestorOrigins">Location.ancestorOrigins - MDN</a>
   */
  @JsProperty(
      name = "ancestorOrigins"
  )
  @Nonnull
  public native DOMStringList ancestorOrigins();

  /**
   * The origin read-only property of the Location interface is a USVString containing the Unicode serialization of the origin of the represented URL
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/origin">Location.origin - MDN</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  /**
   * The Location.assign() method causes the window to load and display the document at the URL specified. After the navigation occurs, the user can navigate back to the page that called Location.assign() by pressing the "back" button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/assign">Location.assign - MDN</a>
   */
  public native void assign(@Nonnull String url);

  /**
   * The Location.reload() method reloads the current URL, like the Refresh button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/reload">Location.reload - MDN</a>
   */
  public native void reload();

  /**
   * The replace() method of the Location interface replaces the current resource with the one at the provided URL. The difference from the assign() method is that after using replace() the current page will not be saved in session History, meaning the user won't be able to use the back button to navigate to it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Location/replace">Location.replace - MDN</a>
   */
  public native void replace(@Nonnull String url);
}
