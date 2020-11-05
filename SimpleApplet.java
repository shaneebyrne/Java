/**
 * @(#)SimpleApplet.java
 *
 * Sample Applet application
 *
 * @author 
 * @version 1.00 16/08/23
 */
 
import java.awt.*;
import javax.swing.*;

// This is a simple applet

public class SimpleApplet extends JApplet
{	
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Java!!", 50, 60 );
	}
}
