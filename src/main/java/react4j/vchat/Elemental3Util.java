package react4j.vchat;

import elemental2.dom.DomGlobal;
import elemental3.Window;
import javax.annotation.Nonnull;
import jsinterop.base.Js;

public final class Elemental3Util
{
  private Elemental3Util()
  {
  }

  @Nonnull
  public static Window window()
  {
    final Window window = Js.uncheckedCast( DomGlobal.window );
    //noinspection ConstantConditions
    assert null != window;
    return window;
  }
}
