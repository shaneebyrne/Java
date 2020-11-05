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

public class Voltage extends Scale 
{
	private final String VOLTAGE = "Voltage";
	private double volts = 0.0;
	private Resistance ohms;
	private Amperage amps;
	
	public Voltage()
	{
		volts = 0.0;
	}
	
	public Voltage(double volts)
	{
		super( volts); //passes variables to the super class (Scale)
		this. volts = volts;
	}
	
	@Override //overridden accessor method
	public void setValue(double volts)
	{
		this.volts = volts;
	}
	
	@Override 
	public double getValue() //overrides Scale getValue() method
	{
		return volts;
	}
	
	public String getParameter() //Overrides Scale getParameter() method
	{
		return VOLTAGE;
	}
	
	public String toString() //sets up the abstract toString() method of Scale
	{
		return "Scale: " + "\t" + volts + " V";
	}
	
	public void calculate(double resistance, double amperage)
	{
	    this.volts = resistance * amperage;
	}
	
//diagnostic code
	
/**		public static void main(String[] args)
	{
		Resistance resistor = new Resistance(100000);
		Voltage powerSupply = new Voltage();
		Amperage amp = new Amperage(.000000002);
		System.out.println(powerSupply.getValue());
		System.out.println(amp.getValue());
		System.out.println(resistor.getValue());
		resistor.calculate(resistor.getValue(), amp.getValue());
		System.out.println(resistor.getValue());
	}
**/

}