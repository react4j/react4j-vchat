package react4j.vchat;

import akasha.Console;
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
    if ( WindowGlobal.navigator().isMediaDevicesSupported() )
    {
      //ReactArezSpyUtil.enableSpyEventLogging();
      final Element root = WindowGlobal.document().getElementById( "app" );
      assert null != root;
      ReactDOM.render( ApplicationBuilder.build(), root );
    }
    else
    {
      Console.log( "MediaDevices API not present" );
    }
  }
}
