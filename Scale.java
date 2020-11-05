/** CS-112
 *  PROGRAMMER: SHANE EIRE BYRNE
 *  DATE OF LAST MODIFICATION: 12/12/2016
 *  TUESDAY 05:30 - 9:20 PM
 *  PROGRAM NAMES: Scale.Java, Amperage.java. CalculatorFrame.java, OhmgLawTester.java,SeriesResistors.java, TotalResistance.java, Voltage.Java Wattage.java, OhmsLawTester.java, Resistance.java
 *  
 *  PROBLEM STATEMENT
 *  Come up with topic for final project, something that might be useful for school or work. 
 *  1.) Use style sheet for alyout of program.
 *  2.) give variables descriptive names that are appropiate for your progarm.
 *  3.) Commenent classes to insure they are readable for a novice programmer.
 *  4.) create at least 3 classes (including a test program)
 *  5.) use constructors within your classes
 *  6.) use at least one Data Structure (ArrayList, Vector, LinkedList)
 *  7.) Error checking and exception handeling are mandatory in your program
 *  8.) Include at least 4 of the fallowing in your program
 *      a.) inheritance
 *      b.) polymorphism
 *      c.) file i/o
 *      d.) Excetion andeling
 *      e.) recursion
 *      f.) Window interface for the user (GUI)
 *      g.) gui with menu
 *  9.) Program should be a minimum of 5-6 pages of code including the style sheet, information and comments.
 *
 *  ALGORITHM
 *  
 *  Logic classes
 *  Scale
 *  Build an abstract class of Scale, this will pass a double value around used to represent either a voltage, resistance, or amperage value within an inherited class.
 *  Amperage: This class inherits methods from the Scale class, it will also override the set and get value methods of scale, as well as the abstract calculate and toString methods
 *  Voltage: This class inherits methods from the Scale class, it will also override the set and get value methods of scale, as well as the abstract calculate and toString methods
 *  Resistance:  This class inherits methods from the Scale class, it will also override the set and get value methods of scale, as well as the abstract calculate and toString methods
 *  Wattage: This class is dependent on values received from Voltage and Amperage in order to calculate wattage /power.
 *  
 *  ParallelResistors/SeriesResistors: This classes are a seperate concept to the Scale class and its decipals, it works in tandum with eachother to pass calculated resistor values to the TotalResistance class.
 *  ParallelResistance passes a double value into an array, and then using the formula Rparallel = 1/(1/R1+1/R2+1/R...) set within a recursive method calculates the total parallel resistance of every entered resistance value by the user.
 *  ParallelResistors passes a double value into an array, and then using the formula Rtotal = R1 + R1 + R3+ R4...... set within a recursive method that calculates the total series resistance of all entered resistor values.
 *  Total resistance takes the arrays of series resistance and parallel resistance and adds all the contents of them together. it then outputs this total value to the screen upon completion of the calculaion.
 *
 *  GUI classes
 *  CalculatorFrame
 *  3 JPanels are brought together to make the basis for the calculator.
 *  Buttons are placed on the panels and are assinged action listeners.
 *  Objects of ImageIcon are created; they read images within the "Final project" directory.
 *  ImageIcon objets are applied to the buttons as labels.
 *  Objects of JTextFrame are created, they allow the user to either enter a value to use in a calculation or display a calculation from other entered values.
 *  ActionListeners are established for each button; as a button is enabled, it disabeles the other 2 buttons as well as is JTextField object.
 *  User enters values to be used in calculation into the JTextField objects.
 *  When the "Equals" buton is pressed, the entered values are taken in and convered into their double equivalent. This double equivalent is then passed into the appropiate .calculate() method of whichever logic class is being called (i.e. if voltage is selected, voltage is calculated using the inputs from amperage and resistance).
 *  The calculated value is taken and then conveted back into its String equivalent, this is then taken and passed to the .setText() method of JTextFrame to display the output on the corresponding value being calculated (i.e. amperage and resistance are taken to calulcate voltage, the voltage value is printed into the JTextField).
 *  The calculated value is added to an ArrayList.
 *  When the user is done, they press the exit button. the calculated values done by the user are taken from the arraylist and printed to the console. then program then terminates.  
 *    
 *  OhmsLawTester
 *  This class builds an object of the CalculatorFrame class wintin the main method.
 *  the CalculatorFrame object is then packed and displayed on the screen.
 *  
 *  Calculations are made, then a screen shot is made of the OhmsLawTester GUI as well as the TotalResstance classes.
 * 
 *
 *  IMPORT STATEMENTS
 *
 *      import java.awt.Color;
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

public abstract class Scale 
{
	private String parameter;
	private double value = 0.0;
	
	public Scale()
	{
		parameter = " ";
		value = 0.0;
	}
	
	public Scale(double value) //single parameter 
	{
	   this.value = value;
	}
	
	public Scale(String parameter, double value)
	{
		setParameter(parameter);
		setValue(value);
	}
	
	public String getParameter() //returns an empty string; to be overridden by subsequent programs
	{
		return " ";
	}
	
	public void setParameter(String parameter)
	{
		this.parameter = parameter;
	}
	
	public double getValue() //to be overridden by subsequent programs
	{
		return 0.0;
	}
	
	public void setValue(double value)
	{
		this.value = value;
	}

	
	
	public abstract void calculate(double oneValue, double another);
	
	public abstract String toString(); //changes depending on setting
	
	public boolean equals(Scale other)
	{
		boolean isEqual;
		if(this.parameter.equalsIgnoreCase(other.parameter) & (this.value == other.value))
		{
			isEqual = true; 
		}
		else
		{
			isEqual = false;
		}
		
		return isEqual;
	}
	

}