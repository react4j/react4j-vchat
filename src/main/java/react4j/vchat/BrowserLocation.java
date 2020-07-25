package react4j.vchat;

import arez.ComputableValue;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.ComputableValueRef;
import arez.annotations.DepType;
import arez.annotations.Memoize;
import arez.annotations.OnActivate;
import arez.annotations.OnDeactivate;
import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.EventListener;
import javax.annotation.Nonnull;

/**
 * This is a simple abstraction over browser location as a hash.
 * It should be noted that this is a stripped down version extracted from the <code>arez-browserlocation</code> library.
 *
 * @link https://github.com/arez/arez-browserlocation
 */
@ArezComponent
abstract class BrowserLocation
{
  @Nonnull
  private final EventListener _listener = this::onHashChangeEvent;

  /**
   * Create the model object.
   *
   * @return the BrowserLocation instance.
   */
  @Nonnull
  static BrowserLocation create()
  {
    return new Arez_BrowserLocation();
  }

  @Memoize( depType = DepType.AREZ_OR_EXTERNAL )
  @Nonnull
  String getBrowserLocation()
  {
    final String hash = DomGlobal.window.location.hash;
    return null == hash ? "" : hash.substring( 1 );
  }

  @OnActivate
  void onBrowserLocationActivate()
  {
    DomGlobal.window.addEventListener( "hashchange", _listener, false );
  }

  @OnDeactivate
  void onBrowserLocationDeactivate()
  {
    DomGlobal.window.removeEventListener( "hashchange", _listener, false );
  }

  @ComputableValueRef
  abstract ComputableValue<?> getBrowserLocationComputableValue();

  @Action
  void updateBrowserLocation()
  {
    getBrowserLocationComputableValue().reportPossiblyChanged();
  }

  private void onHashChangeEvent( @Nonnull final Event e )
  {
    e.preventDefault();
    updateBrowserLocation();
  }
}
