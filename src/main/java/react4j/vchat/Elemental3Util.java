package react4j.vchat;

import elemental2.dom.DomGlobal;
import elemental3.Navigator;
import javax.annotation.Nonnull;
import jsinterop.base.Js;

public final class Elemental3Util
{
  private Elemental3Util()
  {
  }

  @Nonnull
  public static Navigator getNavigator()
  {
    final Navigator navigator = Js.cast( DomGlobal.navigator );
    //noinspection ConstantConditions
    assert null != navigator;
    return navigator;
  }
}
