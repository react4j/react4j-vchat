package react4j.vchat;

import elemental2.dom.DomGlobal;
import elemental3.Document;
import elemental3.Navigator;
import elemental3.Window;
import javax.annotation.Nonnull;
import jsinterop.base.Js;

public final class Elemental3Util
{
  private Elemental3Util()
  {
  }

  @Nonnull
  public static Document document()
  {
    final Document document = Js.uncheckedCast( DomGlobal.document );
    //noinspection ConstantConditions
    assert null != document;
    return document;
  }

  @Nonnull
  public static Window window()
  {
    final Window window = Js.uncheckedCast( DomGlobal.window );
    //noinspection ConstantConditions
    assert null != window;
    return window;
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
