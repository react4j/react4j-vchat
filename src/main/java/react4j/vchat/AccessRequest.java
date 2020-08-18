package react4j.vchat;

import java.util.Objects;
import javax.annotation.Nonnull;

/**
 * Representation of a request received from a guest for access.
 */
final class AccessRequest
{
  @Nonnull
  private final String _id;
  @Nonnull
  private final String _message;

  AccessRequest( @Nonnull final String id, @Nonnull final String message )
  {
    _id = Objects.requireNonNull( id );
    _message = Objects.requireNonNull( message );
  }

  @Nonnull
  String getId()
  {
    return _id;
  }

  @Nonnull
  String getMessage()
  {
    return _message;
  }
}
