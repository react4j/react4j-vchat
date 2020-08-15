package react4j.vchat;

import arez.annotations.CascadeDispose;
import javax.annotation.Nonnull;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;

@View( type = View.Type.TRACKING )
abstract class Application
{
  @CascadeDispose
  @Nonnull
  final BrowserLocation _location = BrowserLocation.create();
  @CascadeDispose
  @Nonnull
  final ApplicationState _applicationState = ApplicationState.create();

  @Render
  @Nonnull
  ReactNode render()
  {
    final String roomCode = _location.getLocation();
    return roomCode.isEmpty() ?
           SelectRoomViewBuilder.browserLocation( _location ).applicationState( _applicationState ) :
           RoomViewBuilder.roomCode( roomCode );
  }
}
