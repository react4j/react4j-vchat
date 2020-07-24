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
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SubtleCrypto"
)
public class SubtleCrypto {
  SubtleCrypto() {
  }

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<ArrayBuffer> deriveBits(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, int length);

  @Nonnull
  public native Promise<ArrayBuffer> deriveBits(@Nonnull Object algorithm,
      @Nonnull CryptoKey baseKey, int length);

  @Nonnull
  public native Promise<ArrayBuffer> deriveBits(@Nonnull String algorithm,
      @Nonnull CryptoKey baseKey, int length);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull Object derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull String derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull Object derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull String derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> exportKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull CryptoKey key);

  @Nonnull
  public native Promise<Any> generateKey(@Nonnull AlgorithmIdentifier algorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> generateKey(@Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> generateKey(@Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<Any> generateKey(@Nonnull AlgorithmIdentifier algorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> generateKey(@Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> generateKey(@Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull AlgorithmIdentifier algorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull AlgorithmIdentifier algorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> importKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<CryptoKey> unwrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull BufferSource data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBufferView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint16Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8ClampedArray data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float32Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float64Array data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull DataView data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBuffer data);

  @Nonnull
  public native Promise<Any> wrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull CryptoKey key, @Nonnull CryptoKey wrappingKey,
      @Nonnull AlgorithmIdentifier wrapAlgorithm);

  @Nonnull
  public native Promise<Any> wrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull CryptoKey key, @Nonnull CryptoKey wrappingKey, @Nonnull Object wrapAlgorithm);

  @Nonnull
  public native Promise<Any> wrapKey(
      @MagicConstant(stringValues = {"jwk", "pkcs8", "raw", "spki"}) @Nonnull String format,
      @Nonnull CryptoKey key, @Nonnull CryptoKey wrappingKey, @Nonnull String wrapAlgorithm);
}
