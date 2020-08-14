package react4j.vchat;

import arez.ObservableValue;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.Observable;
import arez.annotations.ObservableValueRef;
import elemental3.Global;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nonnull;

@ArezComponent
abstract class RoomsHistory
{
  /// Maximum number of rooms to record in trace
  private static final int MAX_ROOM_IDS = 3;
  @Nonnull
  private static final String STORAGE_KEY = "vchat.rooms";
  @Nonnull
  private final LinkedList<String> _latestRoomIds = new LinkedList<>();

  @Nonnull
  static RoomsHistory create()
  {
    return new Arez_RoomsHistory();
  }

   RoomsHistory()
  {
    final String ids = Global.globalThis().localStorage().getItem( STORAGE_KEY );
    if( null != ids )
    {
      for ( final String id : ids.split( "\\|" ) )
      {
        _latestRoomIds.addLast( id );
      }
    }
  }

  @Observable( expectSetter = false )
  List<String> getLatestRoomsIds()
  {
    return _latestRoomIds;
  }

  @ObservableValueRef
  abstract ObservableValue<?> getLatestRoomsIdsObservableValue();

  @Action
  void recordRoomId( @Nonnull final String roomId )
  {
    _latestRoomIds.remove( roomId );
    if ( MAX_ROOM_IDS == _latestRoomIds.size() )
    {
      _latestRoomIds.removeLast();
    }
    _latestRoomIds.addFirst( roomId );
    getLatestRoomsIdsObservableValue().reportChanged();
    Global.globalThis().localStorage().setItem( STORAGE_KEY, String.join( "|", _latestRoomIds ) );
  }
}
