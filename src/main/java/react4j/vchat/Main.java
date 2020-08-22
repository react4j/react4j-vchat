package react4j.vchat;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Element;
import elemental3.Global;
import jsinterop.base.Js;
import react4j.dom.ReactDOM;
import react4j.vchat.view.ApplicationBuilder;

public final class Main
  implements EntryPoint
{
  @Override
  public void onModuleLoad()
  {
    //ReactArezSpyUtil.enableSpyEventLogging();
    final Element root = Global.globalThis().document().getElementById( "app" );
    assert null != root;
    // TODO: Remove Js.cast once react4j is moved to elemental3
    ReactDOM.render( ApplicationBuilder.build(), Js.cast( root ) );
  }
}
