// A simple Java applet

import java.applet.*;
import java.awt.*;

public class SimpleApplet extends Applet
{
	public void paint(Graphics g) {
		g.drawString("Hello, World!", 100, 400);
	}
}
