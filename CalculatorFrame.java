 /** CS-112
 *  PROGRAMMER: SHANE EIRE BYRNE
 *  DATE OF LAST MODIFICATION: 12/12/2016
 *  TUESDAY 05:30 - 9:20 PM
 *  PROGRAM NAMES: Scale.Java, Amperage.java. CalculatorFrame.java, OhmgLawTester.java,SeriesResistors.java, TotalResistance.java, Voltage.Java Wattage.java, OhmsLawTester.java, Resistance.java
**/
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;

import java.io.File;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream; 

import java.text.DecimalFormat;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList; //import statement for ArrayList
import java.util.Collections; //import statement for Collections class to convert array to arraylist
import java.util.Arrays; //import statement for Array
import java.util.Scanner;

public class CalculatorFrame extends JFrame 
{
      
	  private final JLabel TITLE = new JLabel("ELECTRONICS TOOL KIT"); //Label 
	  private JButton resist; //button
      private JFrame frame = new JFrame("ELECTRONCIS TOOL KIT");
      private JButton volt; //button
      private JButton amp; //button
      private JButton watt; //button
      private JButton exit; //button
      private JButton clear; //button
      private JButton equals; //button
      private JTextField voltResult; //textfield
      private JTextField ampResult; //textfield
      private JTextField ohmResult; //textfield
      private JTextField wattCalc; //textfield
      private  static int counter = 0; //int to progress ArrayList
      private ArrayList<String> list = new ArrayList<String> (); //ArrayList to store and call calculated values
      private ArrayList<String> anotherList = new ArrayList<String>();//ArrayList to store and call calculated wattage values
      private ObjectOutputStream outFile; 
      private Amperage actionAmp = new Amperage();//object of amperage class created
      private Voltage actionVolt = new Voltage();//object of voltage class created
      private Resistance actionResis = new Resistance(); //object of resistance class created
      private Wattage actionWatt = new Wattage(); //object of wattage class created
      
      
      private Voltage volts = new Voltage(); //voltage object creation
      private Amperage current = new Amperage(); //amperage object created
      private Resistance flow = new Resistance(); //resistnace object created
      private Wattage power = new Wattage(); //wattage object created
      
      Boolean voltClicked = false; //boolean object to control state of buttons.
	  Boolean ampClicked = false;  //boolean object to control state of buttons.
	  Boolean ohmClicked = false; //boolean object to control state of buttons.
	  
	  DecimalFormat formatted = new DecimalFormat("#000.0000"); //formats output
	   
      private String voltString; //voltage string
      private String ampString; //amperage string
      private String ohmString; //resistance string
      private String wattString; //wattage string
      
      public CalculatorFrame()   
      {
      	
      	
      	JPanel p1 = new JPanel();
      	p1.setLayout(new GridLayout(6, 0));
	    
	    ImageIcon volta = new ImageIcon("Voltage_tn.jpg"); //Substitues image for label for JButton
	    ImageIcon ampere = new ImageIcon("Amperage_tn.jpg");  //Substitues image for label for JButton
	    ImageIcon georg = new ImageIcon("Omega_tn.jpg"); //Substitues image for label for JButton
	    ImageIcon gone = new ImageIcon("Exit.jpg"); //Substitues image for label for JButton
	    ImageIcon wipe = new ImageIcon("Reset_tn.jpg"); //Substitues image for label for JButton
	    ImageIcon solve = new ImageIcon("Equals.jpg");
	    
	    p1.add(volt = new JButton(volta));//Applies image for label for JButton 
	    p1.add(amp = new JButton(ampere));//Applies image for label for JButton
	    p1.add(resist = new JButton(georg));  //Applies image for label for JButton
	    p1.add(equals = new JButton(solve)); //Applies image for label for JButton
	    p1.add(clear = new JButton(wipe));//Applies image for label for JButton
	    p1.add(exit = new JButton(gone));//Applies image for label for JButton
	
	
	    JPanel p2 = new JPanel();
	    p2.setLayout(new GridLayout(3,0));
	    JLabel vLabel = new JLabel("Voltage:");
	    p2.add(vLabel);
	    p2.add(voltResult = new JTextField(20));  //JTextFields established, given a maximum length of 20 characters to display.
	    JLabel aLabel = new JLabel("Amperage:");
	    p2.add(aLabel);
	    p2.add(ampResult = new JTextField(20));
	    JLabel rLabel = new JLabel("Resistance:");
	    p2.add(rLabel);
	    p2.add(ohmResult = new JTextField(20));
	    voltResult.setHorizontalAlignment(JTextField.CENTER);
	    voltResult.setEditable(true);
	    ampResult.setHorizontalAlignment(JTextField.CENTER); //centers curser in JTextField
	    ampResult.setEditable(true);
	    ohmResult.setHorizontalAlignment(JTextField.CENTER);
	    ohmResult.setEditable(true);
	   
	
	    JPanel p3 = new JPanel();
	    p3.setLayout(new FlowLayout());
	    JLabel wattLabel = new JLabel("CALCULATED WATTAGE:");
	    p3.add(wattLabel);
	    p3.add(wattCalc = new JTextField(20));
	    wattCalc.setEditable(false);
	    ImagePanel comic = new ImagePanel();
	    JLabel imgLabel = new JLabel(new ImageIcon("OhmsLawImage.gif")); //Makes JLabel object from Image
	   	p3.add(imgLabel); //adds JLabel object to panel
	    
	         
	
	    JPanel p = new JPanel();
	    p.setLayout(new GridLayout(1,0));
	    p.add(p2, BorderLayout.NORTH);  //Sets locations of pannels
	    p.add(p1, BorderLayout.SOUTH);
	    p.add(p3, BorderLayout.EAST);
	  
	
	    add(p); //Adds panels to screen
	
	    volt.addActionListener(new ListenToVoltage()); //ties action listener to voltage button
	    amp.addActionListener(new ListenToCurrent()); //ties action listener to current button
	    resist.addActionListener(new ListenToResistance()); //ties action listener to resistance button
	    equals.addActionListener(new ListenToEquals()); //ties action listener to equals button.
	    exit.addActionListener(new ListenToExit()); //ties action listener to exit button
	    clear.addActionListener(new ListenToReset()); //ties action listener to reset button

      }
      
      public class ImagePanel extends JPanel //inner class to add image to panel
      {

	    private BufferedImage image;
	    public ImagePanel()
	     {
	       try
	        {                
	          image = ImageIO.read(this.getClass().getResource("OhmsLawImage.gif"));
	          JLabel comic = new JLabel(new ImageIcon(image));
	       } 
		       catch (IOException ex) //catches excption if file stated is not found.
	       {
	            System.out.println("Image not found");
	       }
	    }
	
	    @Override
	    protected void paintComponent(Graphics g) //overrides paintCompnent method ofJPanel
	    {
	        super.paintComponent(g);
	        g.drawImage(image, 0, 0, this);           
	    }

      }
      
      public static int getCount() // message to check if buttons are enabled
      {
      	 return counter;
      }
      
      public boolean isClicked()  //core concept of this method was to pass a boolean object among the actionlisteners for amperage, voltage, and resistance; could not get this method to execute correctly
      {
      	boolean click = false;
      	if(voltClicked == true & ampClicked == true)
      	{
      		click = true;
      	}
      	else if(ohmClicked == true & ampClicked == true)
      	{
      		click= true;
      	}
      	else if(voltClicked == true & ohmClicked == true)
      	{
      		click = true;
      	}
      	else
      	{
      		if (voltClicked == true & ohmClicked == true & ampClicked == true)
      		{
      			System.out.println("Can not preform calculation with all 3 enabeled.");
      			System.exit(0);
      		}
      	}
      	return click;
      }
      
      
      private class ListenToVoltage implements ActionListener //action listener for the voltage button
      {
      	
      	
      	public void actionPerformed(ActionEvent e)
      	{
      	
      		volt.setEnabled(false);
      		amp.setEnabled(true);    //locks or unlocks corresponding buttons
      		resist.setEnabled(true);
      		
      		voltResult.setEnabled(false);
      		ampResult.setEnabled(true); //locks out corresponding JTextFrame not allowing user to enter anything into the field
      		ohmResult.setEnabled(true);

		
      	}
      }
      
      private class ListenToCurrent implements ActionListener //action listener for the current/amperage button
      {
      	
      	public void actionPerformed(ActionEvent e)
      	{
      		
      	 	volt.setEnabled(false);
      		amp.setEnabled(true); //locks or unlocks corresponding buttons
      		resist.setEnabled(false);
      		
      		voltResult.setEnabled(true);
      		ampResult.setEnabled(false); //locks out corresponding JTextFrame not allowing user to enter anything into the field
      		ohmResult.setEnabled(true);
      	}
      }
      
      private class ListenToResistance implements ActionListener //action listener for the resistance button
      {
      	Resistance actionOhm = new Resistance();//object of amperage class created
      	public void actionPerformed(ActionEvent e)
      	{
      		volt.setEnabled(false);
      		amp.setEnabled(false); //locks or unlocks corresponding buttons
      		resist.setEnabled(true);
      		
      		voltResult.setEnabled(true);
      		ampResult.setEnabled(true); //locks out corresponding JTextFrame not allowing user to enter anything into the field
      		ohmResult.setEnabled(false);
      	        	      
      	}
      }
      
      private class ListenToExit implements ActionListener //action listener for the exit button
      {
      	public void actionPerformed(ActionEvent e)
      	{
      		for(String aString: list) //print calculated value arraylist
      		{
      			System.out.println(aString.toString());
      		}
      		
      		for(String anotherString: anotherList) //print wattage arraylist
      		{
      			System.out.println(anotherString.toString());
      		}
      		
      		System.out.println("Auf Wiedersehen, Alles!");
      		System.exit(0); //allows user to exit program
      	}
      }
      
      private class ListenToReset implements ActionListener //action listener for the clear button
      {
      	public void actionPerformed(ActionEvent e)
      	{
      		volts.setValue(0.0);
      		current.setValue(0.0);
      		flow.setValue(0.0);                  //resets all values back to 0.
      		power.setWattage(0.0);
      		volt.setEnabled(true);
      		amp.setEnabled(true);             //setEnabled set to true, all buttons are unlocked
      		resist.setEnabled(true);
      		voltResult.setText(" ");
      		ampResult.setText("  ");
      		ohmResult.setText(" ");
      		wattCalc.setText("  ");
      	}
      }
      
	      private class ListenToEquals implements ActionListener  //action listener for equals button
			{
				
			    public void actionPerformed(ActionEvent e)
			     {
			     	double juice = 0.0;
			     	double intensity = 0.0;
			     	double impedance = 0.0;
			     	double power = 0.0; //local variables for voltage, current, and amperage.
			     	
			     	if(volt.isEnabled() == false && amp.isEnabled() == false)
			     	{
			     	   ampString = ampResult.getText();//pulls input from JTextField
      		           voltString = voltResult.getText();//pulls input from JTextField
      		           
      		           juice = Double.parseDouble(voltString); //String converted to integer equivalent
      		           intensity = Double.parseDouble(ampString);//String converted to integer equivalent 
			     	   actionResis.calculate(juice, intensity); //resistance calculated
			     	   actionWatt.calcWattage(juice, intensity); //calculates wattage using volt/amp input
			     	   power = actionWatt.getWattage();
			     	   impedance = actionResis.getValue(); //caluclated value is passed to local variable.
			     	   list.add(actionResis.toString());
			     	   power = Double.parseDouble(wattString);
			     	   anotherList.add(actionWatt.toString());
			     	   
			     	   ohmString = Double.toString(impedance); //calculated value is converted back into its string equivalent
			     	   
			     	   ohmResult.setText(ohmString); //sends result to resistance JTextField  
			     	   
			     	   wattCalc.setText(wattString); 	 //sends wattage calculation to calculated wattage JTextBox  
			     	  	     	   
			     	}
			     	
			     	
			     	else if(amp.isEnabled() == false && resist.isEnabled() == false) //calc voltage
			     	{
			     	   ampString = ampResult.getText();//pulls input from JTextField
      		           ohmString = ohmResult.getText();//pulls input from JTextField
      		           
      		           impedance = Double.parseDouble(ohmString); //String converted to integer equivalent
      		           intensity = Double.parseDouble(ampString);//String converted to integer equivalent 
			     	   actionVolt.calculate(intensity, impedance); //volt calculated
			     	   juice = actionVolt.getValue(); //caluclated value is passed to local variable.
			     	   list.add(actionVolt.toString());
			     	   actionWatt.calcWattage(juice, intensity);
			     	   power = Double.parseDouble(wattString);
			     	   wattCalc.setText(wattString); //passes wattString to wattCalc JTextPanel
			     	   anotherList.add(actionWatt.toString());
			     	   voltString = Double.toString(juice); //calculated value is converted back into its string equivalent
			     	   
			     	   voltResult.setText(voltString); //sends result to voltage JTextField   
                       		     	   	  
			     	}
			     	
				    else if(volt.isEnabled() == false && resist.isEnabled() == false) //calc amperage
			     	{
			     	   voltString = voltResult.getText();//pulls input from JTextField
      		           ohmString = ohmResult.getText();//pulls input from JTextField
      		           
      		           juice = Double.parseDouble(voltString); //String converted to integer equivalent
      		           impedance = Double.parseDouble(ohmString);//String converted to integer equivalent 
			     	   actionAmp.calculate(juice, impedance); //amperage calculated
			     	   intensity = actionAmp.getValue(); //caluclated value is passed to local variable.
			     	   list.add(actionAmp.toString());			     	   
			     	   actionWatt.calcWattage(juice, intensity);
			     	   power = Double.parseDouble(wattString);
			     	   wattCalc.setText(wattString);
			     	   anotherList.add(actionWatt.toString());
			     	   ampString = Double.toString(intensity); //calculated value is converted back into its string equivalent
			     	   
			     	   ampResult.setText(ampString); //sends result to amperage JTextField  
                       counter++;
			     	   list.set(counter, wattString);
			     	}
			     				     	
			     }
			}
			
//diagnostic code	         
      public static void main(String[] args) //main method used for diagnostics
	   {
		    CalculatorFrame calc = new CalculatorFrame();
		    calc.pack();
		    calc.setLocationRelativeTo(null);
		    calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    calc.setVisible(true);
		}
		
		
}