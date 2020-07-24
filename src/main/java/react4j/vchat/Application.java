package react4j.vchat;

import javax.annotation.Nonnull;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
import static react4j.dom.DOM.*;

@View
abstract class Application
{
  @Nonnull
  @Render
  ReactNode render()
  {
    return h1( "Video Chat" );
  }
}
