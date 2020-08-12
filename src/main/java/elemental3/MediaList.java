package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaList interface represents the media queries of a stylesheet, e.g. those set using a link element's media attribute.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaList">MediaList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaList"
)
public class MediaList {
  /**
   * The mediaText property of the MediaList interface is a stringifier that returns a DOMString representing the MediaList as text, and also allows you to set a new MediaList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaList/mediaText">MediaList.mediaText - MDN</a>
   */
  @Nonnull
  public String mediaText;

  MediaList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  public native void appendMedium(@Nonnull String medium);

  public native void deleteMedium(@Nonnull String medium);
}
