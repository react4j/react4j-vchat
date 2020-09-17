package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The CryptoKey interface of the Web Crypto API represents a cryptographic key obtained from one of the SubtleCrypto methods generateKey(), deriveKey(), importKey(), or unwrapKey().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CryptoKey">CryptoKey - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CryptoKey"
)
public class CryptoKey {
  CryptoKey() {
  }

  @JsProperty(
      name = "algorithm"
  )
  @Nonnull
  public native Object algorithm();

  @JsProperty(
      name = "extractable"
  )
  public native boolean extractable();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  @MagicConstant(
      valuesFromClass = KeyType.class
  )
  public native String type();

  @JsProperty(
      name = "usages"
  )
  @Nonnull
  public native Object usages();
}
