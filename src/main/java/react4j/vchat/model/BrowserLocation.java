package react4j.vchat.model;

import akasha.Global;
import akasha.HashChangeEvent;
import akasha.HashChangeEventListener;
import akasha.Location;
import arez.ComputableValue;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.ComputableValueRef;
import arez.annotations.DepType;
import arez.annotations.Memoize;
import arez.annotations.OnActivate;
import arez.annotations.OnDeactivate;
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
    final String hash = Global.location().hash;
    return hash.isEmpty() ? hash : hash.substring( 1 );
  }

  void gotoLocation( @Nonnull final String hash )
  {
    final Location location = Global.location();
    final String target = hash.isEmpty() ? hash : "#" + hash;
    if ( !location.hash.equals( target ) )
    {
      location.hash = target;
    }
  }

  @OnActivate
  void onLocationActivate()
  {
    Global.addHashchangeListener( _listener, false );
  }

  @OnDeactivate
  void onLocationDeactivate()
  {
    Global.removeHashchangeListener( _listener, false );
  }

  @ComputableValueRef
  abstract ComputableValue<?> getLocationComputableValue();

  @Action
  void onHashChangeEvent( @Nonnull final HashChangeEvent e )
  {
    getLocationComputableValue().reportPossiblyChanged();
  }
}
