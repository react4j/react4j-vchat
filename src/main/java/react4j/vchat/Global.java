package react4j.vchat;

import elemental3.Window;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, name = "goog.global", namespace = JsPackage.GLOBAL )
public class Global
{
  private Global()
  {
  }

  private static Window globalThis;

  @JsOverlay
  @Nonnull
  public static Window globalThis()
  {
    return globalThis;
  }
}
