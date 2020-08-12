package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * An object of this type is returned by the files property of the HTML input element; this lets you access the list of files selected with the input type="file" element. It's also used for a list of files dropped into web content when using the drag and drop API; see the DataTransfer object for details on this usage.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileList">FileList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileList"
)
public class FileList {
  FileList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();
}
