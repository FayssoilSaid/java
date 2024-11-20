import java.applet.*;
import java.awt.*;



public class FirstApplet extends Applet {
	public void init() {
		add(new Label("Nom:"));
		add(new TextField(12));
		add(new Button("Ok"));
	}
}
