package react4j.vchat.model;

import akasha.Global;
import arez.ObservableValue;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.CascadeDispose;
import arez.annotations.Observable;
import arez.annotations.ObservableValueRef;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ArezComponent
public abstract class ApplicationState
{
  @Nonnull
  private static final String ALPHA_NUMERIC = "abcdefghijklmnopqrstuvwxyz1234567890";
  /// Maximum number of rooms to record in trace
  private static final int MAX_LATEST_ROOMS = 3;
  @Nonnull
  private static final String STORAGE_KEY = "vchat.rooms";
  @Nonnull
  private final LinkedList<String> _latestRoomCodes = new LinkedList<>();
  @CascadeDispose
  @Nonnull
  final BrowserLocation _location = BrowserLocation.create();

  @Nonnull
  public static ApplicationState create()
  {
    return new Arez_ApplicationState();
  }

  ApplicationState()
  {
    final String codes = Global.localStorage().getItem( STORAGE_KEY );
    if ( null != codes )
    {
      for ( final String code : codes.split( "\\|" ) )
      {
        _latestRoomCodes.addLast( code );
      }
    }
  }

  @Nullable
  public String currentRoom()
  {
    final String location = _location.getLocation();
    return location.isEmpty() ? null : location;
  }

  public void gotoRoom( @Nonnull final String roomCode )
  {
    _location.gotoLocation( roomCode );
  }

  @Observable( expectSetter = false )
  public List<String> getLatestRoomCodes()
  {
    return _latestRoomCodes;
  }

  @ObservableValueRef
  abstract ObservableValue<?> getLatestRoomCodesObservableValue();

  @Action
  public void recordRoomCode( @Nonnull final String roomCode )
  {
    _latestRoomCodes.remove( roomCode );
    if ( MAX_LATEST_ROOMS == _latestRoomCodes.size() )
    {
      _latestRoomCodes.removeLast();
    }
    _latestRoomCodes.addFirst( roomCode );
    getLatestRoomCodesObservableValue().reportChanged();
    Global.localStorage().setItem( STORAGE_KEY, String.join( "|", _latestRoomCodes ) );
  }

  /**
   * Generate a random room code.
   *
   * @return a random room code.
   */
  @Nonnull
  public String randomRoomCode()
  {
    final Random random = new Random();
    final StringBuilder sb = new StringBuilder( 10 );
    for ( int i = 0; i < 10; i++ )
    {
      sb.append( ALPHA_NUMERIC.charAt( Math.abs( random.nextInt( ALPHA_NUMERIC.length() ) ) ) );
    }
    return sb.toString();
  }
}
