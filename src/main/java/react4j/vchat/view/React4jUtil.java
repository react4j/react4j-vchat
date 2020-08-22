package react4j.vchat.view;

import elemental2.dom.Event;
import javax.annotation.Nonnull;
import jsinterop.base.Js;
import react4j.dom.events.SyntheticEvent;

final class React4jUtil
{
  private React4jUtil()
  {
  }

  @Nonnull
  static <T> T getTarget( @Nonnull final SyntheticEvent<Event> event )
  {
    final T element = Js.cast( event.getTarget() );
    assert null != element;
    return element;
  }
}
