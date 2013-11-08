package pl.edu.agh.tai.client;



import com.extjs.gxt.ui.client.widget.MessageBox;
import com.google.gwt.core.client.EntryPoint;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Dropbox implements EntryPoint {
	@Override
	public void onModuleLoad() {
		MessageBox.info("Message", "Hello World!!", null);
	}
}
