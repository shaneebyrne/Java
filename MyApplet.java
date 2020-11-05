/**
 * @(#)MyApplet.java
 *
 * Sample Applet application
 *
 * @author 
 * @version 1.00 15/01/21
 */
 
import java.awt.*;
import java.applet.*;
import java.util.*;

public class MyApplet extends Applet
{	    
	public void paint(Graphics g)
	{
	    g.drawString("Welcome to Java!!", 50, 60 );						
	}
	
	public void init()
    {
    	System.out.println("I'm here!");
    }
}
