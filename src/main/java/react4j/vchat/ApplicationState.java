package react4j.vchat;

import arez.ObservableValue;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.Observable;
import arez.annotations.ObservableValueRef;
import elemental3.Global;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.annotation.Nonnull;

@ArezComponent
abstract class ApplicationState
{
  @Nonnull
  private static final String ALPHA_NUMERIC = "abcdefghijklmnopqrstuvwxyz1234567890";
  /// Maximum number of rooms to record in trace
  private static final int MAX_LATEST_ROOMS = 3;
  @Nonnull
  private static final String STORAGE_KEY = "vchat.rooms";
  @Nonnull
  private final LinkedList<String> _latestRoomCodes = new LinkedList<>();

  @Nonnull
  static ApplicationState create()
  {
    return new Arez_ApplicationState();
  }

  ApplicationState()
  {
    final String codes = Global.globalThis().localStorage().getItem( STORAGE_KEY );
    if ( null != codes )
    {
      for ( final String code : codes.split( "\\|" ) )
      {
        _latestRoomCodes.addLast( code );
      }
    }
  }

  @Observable( expectSetter = false )
  List<String> getLatestRoomCodes()
  {
    return _latestRoomCodes;
  }

  @ObservableValueRef
  abstract ObservableValue<?> getLatestRoomCodesObservableValue();

  @Action
  void recordRoomCode( @Nonnull final String roomCode )
  {
    _latestRoomCodes.remove( roomCode );
    if ( MAX_LATEST_ROOMS == _latestRoomCodes.size() )
    {
      _latestRoomCodes.removeLast();
    }
    _latestRoomCodes.addFirst( roomCode );
    getLatestRoomCodesObservableValue().reportChanged();
    Global.globalThis().localStorage().setItem( STORAGE_KEY, String.join( "|", _latestRoomCodes ) );
  }

  /**
   * Generate a random room code.
   *
   * @return a random room code.
   */
  @Nonnull
  String randomRoomCode()
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
