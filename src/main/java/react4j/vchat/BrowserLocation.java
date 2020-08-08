package react4j.vchat;

import arez.ComputableValue;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.ComputableValueRef;
import arez.annotations.DepType;
import arez.annotations.Memoize;
import arez.annotations.OnActivate;
import arez.annotations.OnDeactivate;
import elemental3.HashChangeEvent;
import elemental3.HashChangeEventListener;
import javax.annotation.Nonnull;

/**
 * This is a simple abstraction over browser location as a hash.
 */
@ArezComponent
abstract class BrowserLocation
{
  @Nonnull
  private final HashChangeEventListener _listener = this::onHashChangeEvent;

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
  String getLocation()
  {
    final String hash = Global.globalThis().window().location().hash;
    return hash.isEmpty() ? hash : hash.substring( 1 );
  }

  @OnActivate
  void onLocationActivate()
  {
    Global.globalThis().window().addHashchangeListener( _listener, false );
  }

  @OnDeactivate
  void onLocationDeactivate()
  {
    Global.globalThis().window().removeHashchangeListener( _listener, false );
  }

  @ComputableValueRef
  abstract ComputableValue<?> getLocationComputableValue();

  @Action
  void onHashChangeEvent( @Nonnull final HashChangeEvent e )
  {
    getLocationComputableValue().reportPossiblyChanged();
  }
}
