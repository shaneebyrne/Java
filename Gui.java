/*
 * Shane Eire Byrne
 * Dat210
 * Week 3 assingment  
 */

/**
 * A GUI class
 */
package assingments;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Gui
{
    private JFrame aFrame;
    private JLabel aLabel;
    private JComboBox comboBox;
    private JButton aButton;
    private BorderLayout aLayout;
    private ActionEvent anEvent;
    
    
    public Gui()
    {
       aFrame = new JFrame("Total Income");
       aFrame.setVisible(true);
       aFrame.setSize(400,400);
       aLabel = new JLabel("Sales Report");
        
    }
    
    
    public Double enterSalesData(Double data)
    {
        return data;
    }
    
    public void label(String label)
    {
        aLabel = new JLabel(label);
    }
    
    public void windowClosing(WindowEvent e)
    {
   // displayMessage("WindowListener method called: windowClosing.");
    //A pause so user can see the message before
    //the window actually closes.
       ActionListener task = new ActionListener()
       {
          boolean alreadyDisposed = false;
          public void actionPerformed(ActionEvent e)
          {
            if (aFrame.isDisplayable()) 
            {
                alreadyDisposed = true;
                aFrame.dispose();
            }
        }
      };
    }
}

/**
 *                                                                 References
 * 
 * Liguori, R., & Liguori, P. (2014). Java 8 pocket Guide: Instant Help for Java Programmers . Sebastopol, CA: O'Reilly Media, Inc..
 * 
 * Koffman, E., & Wolfgang, P. (2010). Data Structures: Abstraction and Design using Java (2nd ed.). Hoboken, NJ: John Wiley & Sons, Inc..
 * 
 * Baesens, B., Backiel, A., & Vanden Broucke, S. (2015). Beginning Java Programming: The Object-Orientated Approach . Indianapolis, In: John Wiley & Sons, Inc.
 * 
 * Savitch, W. (2013). Absolute Java (5th ed.). Upper Saddle River, NJ: Pearson Education, Inc..
 * 
 * Schildt, H. (2014). Java: A Beginner's Guide (6th ed.). New York, NY: McGraw-Hill.
 * 
 * Griffith, A. (1998). Java Master Reference . Foster City, CA: IDG Books Worldwide, Inc..
 * 
 * Oracle Corporation. (2018). Java Platform, Standard Edition 7 API Specification. Retrieved from https://docs.oracle.com/javase/7/docs/api/overview-summary.html
 * 
 */