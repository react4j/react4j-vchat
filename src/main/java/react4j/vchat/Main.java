package react4j.vchat;

import akasha.Element;
import akasha.WindowGlobal;
import com.google.gwt.core.client.EntryPoint;
import react4j.dom.ReactDOM;
import react4j.vchat.view.ApplicationBuilder;

public final class Main
  implements EntryPoint
{
  @Override
  public void onModuleLoad()
  {
    //ReactArezSpyUtil.enableSpyEventLogging();
    final Element root = WindowGlobal.document().getElementById( "app" );
    assert null != root;
    ReactDOM.render( ApplicationBuilder.build(), root );
  }
}
