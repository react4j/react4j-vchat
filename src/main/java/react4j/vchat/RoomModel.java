package react4j.vchat;

import arez.annotations.ArezComponent;
import java.util.Objects;
import javax.annotation.Nonnull;

@ArezComponent( allowEmpty = true )
abstract class RoomModel
{
  @Nonnull
  private final String _code;

  @Nonnull
  static RoomModel create( @Nonnull final String code )
  {
    return new Arez_RoomModel( code );
  }

  RoomModel( @Nonnull final String code )
  {
    _code = Objects.requireNonNull( code );
  }

  @Nonnull
  String getRoomCode()
  {
    return _code;
  }
}
