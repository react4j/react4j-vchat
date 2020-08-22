package react4j.vchat;

import arez.annotations.CascadeDispose;
import javax.annotation.Nonnull;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.vchat.model.ApplicationState;

@View( type = View.Type.TRACKING )
abstract class Application
{
  @CascadeDispose
  @Nonnull
  final ApplicationState _applicationState = ApplicationState.create();

  @Render
  @Nonnull
  ReactNode render()
  {
    final String roomCode = _applicationState.currentRoom();
    return null == roomCode ?
           SelectRoomViewBuilder.applicationState( _applicationState ) :
           RoomViewBuilder.applicationState( _applicationState ).roomCode( roomCode );
  }
}
