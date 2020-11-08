package elemental3;

import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Atomics object provides atomic operations as static methods. They are used with SharedArrayBuffer and ArrayBuffer objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics">Atomics - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-atomics-object">Atomics - ECMA</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Atomics"
)
public final class AtomicsNamespace {
  private AtomicsNamespace() {
  }

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public native int add(@Nonnull IntegerTypedArray typedArray, int index, int value);

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public native int add(@Nonnull Int8Array typedArray, int index, int value);

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public native int add(@Nonnull Int16Array typedArray, int index, int value);

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public native int add(@Nonnull Int32Array typedArray, int index, int value);

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public native int add(@Nonnull Uint8Array typedArray, int index, int value);

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public native int add(@Nonnull Uint16Array typedArray, int index, int value);

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public native int add(@Nonnull Uint32Array typedArray, int index, int value);

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public native int add(@Nonnull Uint8ClampedArray typedArray, int index, int value);

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public native int and(@Nonnull IntegerTypedArray typedArray, int index, int value);

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public native int and(@Nonnull Int8Array typedArray, int index, int value);

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public native int and(@Nonnull Int16Array typedArray, int index, int value);

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public native int and(@Nonnull Int32Array typedArray, int index, int value);

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public native int and(@Nonnull Uint8Array typedArray, int index, int value);

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public native int and(@Nonnull Uint16Array typedArray, int index, int value);

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public native int and(@Nonnull Uint32Array typedArray, int index, int value);

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public native int and(@Nonnull Uint8ClampedArray typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public native int compareExchange(@Nonnull IntegerTypedArray typedArray, int index,
      int expectedValue, int replacementValue);

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public native int compareExchange(@Nonnull Int8Array typedArray, int index, int expectedValue,
      int replacementValue);

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public native int compareExchange(@Nonnull Int16Array typedArray, int index, int expectedValue,
      int replacementValue);

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public native int compareExchange(@Nonnull Int32Array typedArray, int index, int expectedValue,
      int replacementValue);

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public native int compareExchange(@Nonnull Uint8Array typedArray, int index, int expectedValue,
      int replacementValue);

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public native int compareExchange(@Nonnull Uint16Array typedArray, int index, int expectedValue,
      int replacementValue);

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public native int compareExchange(@Nonnull Uint32Array typedArray, int index, int expectedValue,
      int replacementValue);

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public native int compareExchange(@Nonnull Uint8ClampedArray typedArray, int index,
      int expectedValue, int replacementValue);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public native int exchange(@Nonnull IntegerTypedArray typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public native int exchange(@Nonnull Int8Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public native int exchange(@Nonnull Int16Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public native int exchange(@Nonnull Int32Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public native int exchange(@Nonnull Uint8Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public native int exchange(@Nonnull Uint16Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public native int exchange(@Nonnull Uint32Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public native int exchange(@Nonnull Uint8ClampedArray typedArray, int index, int value);

  /**
   * An optimization primitive that can be used to determine whether to use locks or atomic operations.
   *
   * @return true if an atomic operation on arrays of the given element size will be implemented using a hardware atomic operation (as opposed to a lock).
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/isLockFree">MDN - Atomics.isLockFree</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.isLockFree">Atomics.isLockFree() - ECMA</a>
   */
  public native int isLockFree(int size);

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public native int load(@Nonnull IntegerTypedArray typedArray, int index);

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public native int load(@Nonnull Int8Array typedArray, int index);

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public native int load(@Nonnull Int16Array typedArray, int index);

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public native int load(@Nonnull Int32Array typedArray, int index);

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public native int load(@Nonnull Uint8Array typedArray, int index);

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public native int load(@Nonnull Uint16Array typedArray, int index);

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public native int load(@Nonnull Uint32Array typedArray, int index);

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public native int load(@Nonnull Uint8ClampedArray typedArray, int index);

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public native int or(@Nonnull IntegerTypedArray typedArray, int index, int value);

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public native int or(@Nonnull Int8Array typedArray, int index, int value);

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public native int or(@Nonnull Int16Array typedArray, int index, int value);

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public native int or(@Nonnull Int32Array typedArray, int index, int value);

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public native int or(@Nonnull Uint8Array typedArray, int index, int value);

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public native int or(@Nonnull Uint16Array typedArray, int index, int value);

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public native int or(@Nonnull Uint32Array typedArray, int index, int value);

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public native int or(@Nonnull Uint8ClampedArray typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public native int store(@Nonnull IntegerTypedArray typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public native int store(@Nonnull Int8Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public native int store(@Nonnull Int16Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public native int store(@Nonnull Int32Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public native int store(@Nonnull Uint8Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public native int store(@Nonnull Uint16Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public native int store(@Nonnull Uint32Array typedArray, int index, int value);

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public native int store(@Nonnull Uint8ClampedArray typedArray, int index, int value);

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public native int sub(@Nonnull IntegerTypedArray typedArray, int index, int value);

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public native int sub(@Nonnull Int8Array typedArray, int index, int value);

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public native int sub(@Nonnull Int16Array typedArray, int index, int value);

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public native int sub(@Nonnull Int32Array typedArray, int index, int value);

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public native int sub(@Nonnull Uint8Array typedArray, int index, int value);

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public native int sub(@Nonnull Uint16Array typedArray, int index, int value);

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public native int sub(@Nonnull Uint32Array typedArray, int index, int value);

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public native int sub(@Nonnull Uint8ClampedArray typedArray, int index, int value);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull IntegerTypedArray typedArray, int index, int value,
      int timeout);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Int8Array typedArray, int index, int value, int timeout);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Int16Array typedArray, int index, int value, int timeout);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Int32Array typedArray, int index, int value, int timeout);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Uint8Array typedArray, int index, int value, int timeout);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Uint16Array typedArray, int index, int value, int timeout);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Uint32Array typedArray, int index, int value, int timeout);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Uint8ClampedArray typedArray, int index, int value,
      int timeout);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull IntegerTypedArray typedArray, int index, int value);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Int8Array typedArray, int index, int value);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Int16Array typedArray, int index, int value);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Int32Array typedArray, int index, int value);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Uint8Array typedArray, int index, int value);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Uint16Array typedArray, int index, int value);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Uint32Array typedArray, int index, int value);

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @JsMethod(
      name = "wait"
  )
  @AtomicWaitResult
  @Nonnull
  public native String wait_(@Nonnull Uint8ClampedArray typedArray, int index, int value);

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public native int xor(@Nonnull IntegerTypedArray typedArray, int index, int value);

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public native int xor(@Nonnull Int8Array typedArray, int index, int value);

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public native int xor(@Nonnull Int16Array typedArray, int index, int value);

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public native int xor(@Nonnull Int32Array typedArray, int index, int value);

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public native int xor(@Nonnull Uint8Array typedArray, int index, int value);

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public native int xor(@Nonnull Uint16Array typedArray, int index, int value);

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public native int xor(@Nonnull Uint32Array typedArray, int index, int value);

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public native int xor(@Nonnull Uint8ClampedArray typedArray, int index, int value);
}
