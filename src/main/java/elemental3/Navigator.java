package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Navigator interface represents the state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator">Navigator - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Navigator"
)
public class Navigator {
  Navigator() {
  }

  @JsProperty(
      name = "clipboard"
  )
  @Nonnull
  public native Clipboard clipboard();

  /**
   * The credentials property of the Navigator interface returns the CredentialsContainer interface, which exposes methods to request credentials. The CredentialsContainer interface also notifies the user agent when an interesting event occurs, such as a successful sign-in or sign-out. This interface can be used for feature detection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/credentials">Navigator.credentials - MDN</a>
   */
  @JsProperty(
      name = "credentials"
  )
  @Nonnull
  public native CredentialsContainer credentials();

  @JsProperty(
      name = "geolocation"
  )
  @Nonnull
  public native Geolocation geolocation();

  /**
   * The Navigator.mediaDevices read-only property returns a MediaDevices object, which provides access to connected media input devices like cameras and microphones, as well as screen sharing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/mediaDevices">Navigator.mediaDevices - MDN</a>
   */
  @JsProperty(
      name = "mediaDevices"
  )
  @Nonnull
  public native MediaDevices mediaDevices();

  @JsProperty(
      name = "permissions"
  )
  @Nonnull
  public native Permissions permissions();

  @JsProperty(
      name = "maxTouchPoints"
  )
  public native int maxTouchPoints();

  @JsProperty(
      name = "serviceWorker"
  )
  @Nonnull
  public native ServiceWorkerContainer serviceWorker();

  @JsProperty(
      name = "bluetooth"
  )
  @Nonnull
  public native Bluetooth bluetooth();

  @JsProperty(
      name = "xr"
  )
  @Nonnull
  public native XR xr();

  @JsProperty(
      name = "language"
  )
  @Nonnull
  public native String language();

  @JsProperty(
      name = "languages"
  )
  @Nonnull
  public native JsArray<String> languages();

  @JsProperty(
      name = "onLine"
  )
  public native boolean onLine();

  @JsProperty(
      name = "cookieEnabled"
  )
  public native boolean cookieEnabled();

  @JsProperty(
      name = "storage"
  )
  @Nonnull
  public native StorageManager storage();

  @JsProperty(
      name = "hardwareConcurrency"
  )
  public native int hardwareConcurrency();

  @JsProperty(
      name = "appCodeName"
  )
  @Nonnull
  public native String appCodeName();

  @JsProperty(
      name = "appName"
  )
  @Nonnull
  public native String appName();

  @JsProperty(
      name = "appVersion"
  )
  @Nonnull
  public native String appVersion();

  @JsProperty(
      name = "platform"
  )
  @Nonnull
  public native String platform();

  @JsProperty(
      name = "product"
  )
  @Nonnull
  public native String product();

  /**
   * The Navigator.productSub read-only property returns the build number of the current browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/productSub">Navigator.productSub - MDN</a>
   */
  @JsProperty(
      name = "productSub"
  )
  @Nonnull
  public native String productSub();

  @JsProperty(
      name = "userAgent"
  )
  @Nonnull
  public native String userAgent();

  /**
   * The value of the Navigator vendor property is always either "Google Inc.", "Apple Computer, Inc.", or (in Firefox) the empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vendor">Navigator.vendor - MDN</a>
   */
  @JsProperty(
      name = "vendor"
  )
  @Nonnull
  public native String vendor();

  /**
   * The value of the Navigator.vendorSub property is always the empty string, in any browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vendorSub">Navigator.vendorSub - MDN</a>
   */
  @JsProperty(
      name = "vendorSub"
  )
  @Nonnull
  public native String vendorSub();

  /**
   * The Navigator.oscpu property returns a string that identifies the current operating system.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/oscpu">Navigator.oscpu - MDN</a>
   */
  @JsProperty(
      name = "oscpu"
  )
  @Nonnull
  public native String oscpu();

  @JsProperty(
      name = "webdriver"
  )
  public native boolean webdriver();

  @JsProperty(
      name = "mimeTypes"
  )
  @Nonnull
  public native MimeTypeArray mimeTypes();

  @JsProperty(
      name = "plugins"
  )
  @Nonnull
  public native PluginArray plugins();

  public native boolean sendBeacon(@Nonnull String url, @Nonnull BodyInit data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull ReadableStream data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull XMLHttpRequestBodyInit data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull Blob data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull BufferSource data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull ArrayBufferView data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull Int8Array data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull Int16Array data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull Int32Array data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull Uint8Array data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull Uint16Array data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull Uint32Array data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull Uint8ClampedArray data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull Float32Array data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull Float64Array data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull DataView data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull ArrayBuffer data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull FormData data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull URLSearchParams data);

  public native boolean sendBeacon(@Nonnull String url, @Nonnull String data);

  public native boolean sendBeacon(@Nonnull String url);

  @Nonnull
  public native Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(@Nonnull String keySystem,
      @Nonnull JsArray<MediaKeySystemConfiguration> supportedConfigurations);

  @Nonnull
  public native Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(@Nonnull String keySystem,
      @Nonnull MediaKeySystemConfiguration[] supportedConfigurations);

  @Nonnull
  public native JsArray<Gamepad> getGamepads();

  public native boolean vibrate(@Nonnull VibratePattern pattern);

  public native boolean vibrate(int pattern);

  public native boolean vibrate(@Nonnull JsArray<Double> pattern);

  public native boolean vibrate(@Nonnull Double[] pattern);

  public native void registerProtocolHandler(@Nonnull String scheme, @Nonnull String url);

  public native void unregisterProtocolHandler(@Nonnull String scheme, @Nonnull String url);

  public native boolean taintEnabled();

  public native boolean javaEnabled();
}
