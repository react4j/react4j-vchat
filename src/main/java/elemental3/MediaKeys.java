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
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaKeys"
)
public class MediaKeys {
  MediaKeys() {
  }

  @Nonnull
  public native MediaKeySession createSession(
      @MagicConstant(stringValues = {"persistent-license", "temporary"}) @Nonnull String sessionType);

  @Nonnull
  public native MediaKeySession createSession();

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull BufferSource serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull ArrayBufferView serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Int8Array serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Int16Array serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Int32Array serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Uint8Array serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Uint16Array serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Uint32Array serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Uint8ClampedArray serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Float32Array serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Float64Array serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull DataView serverCertificate);

  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull ArrayBuffer serverCertificate);
}
