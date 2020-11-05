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
public class SeriesResistors
{
	 double resistorValue;
	 ArrayList serResis = new ArrayList();
	 double[] seriesArray = new double[200];
	
	public SeriesResistors(double resistorValue) //constructor for Series resistor
	{
		this.resistorValue = resistorValue;
	}
	
	public void setResistorValue(double value) //setter for resistor value
	{
		resistorValue = value;
	}
	
	public double getResistorValue() //getter for resistor value
	{
		return resistorValue;
	}
	
	
	public void numSeries(double resistorValue) // method to load array
	{
					
		for(int i = 0; i < seriesArray.length; i++)
		{
		   seriesArray[i] = resistorValue;
		}
			
	}
	
	public void convert(ArrayList serResis, double[] array) //method to pass array to arraylist
	{
		this.serResis = serResis;
		seriesArray = array;
		Collections.addAll(serResis, seriesArray);
		
	}
	
	public double calculatedSeriesResistance() //method to calculate series ersistance
	{
	   double totalSeriesResistance = 0;
	   double placeHolder  = 0;

       for(int i = 0; i < seriesArray.length; i++)
       {
	   	 placeHolder = seriesArray[i];
	   	 totalSeriesResistance += placeHolder;
       }
       return totalSeriesResistance;
	}

	
	public double totalSeriesResistance(double totalSeriesResistance) throws IllegalArgumentException //reclusive method to 
	{ 
	  	   
       if (seriesArray.length < 0) throw new IllegalArgumentException("Not enought resistors!");
       for(int i = 0; i < seriesArray.length; i++)
       {
	   	  totalSeriesResistance = totalSeriesResistance(calculatedSeriesResistance() + totalSeriesResistance);
       }
       
       return totalSeriesResistance;
	 }

    	
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	double resistorValue = 0.0;
    	double[] array = new double[4];
    	int counter = 0;
    	SeriesResistors resistorsInSeries = new SeriesResistors(resistorValue);
    	do
    	{
	    	System.out.println("Enter resistor values: ");
	    	resistorValue = in.nextDouble();
	    	resistorsInSeries.numSeries(resistorValue);
	    	counter++;
	    } while(counter != array.length);
	    
	    System.out.println(resistorsInSeries.calculatedSeriesResistance());
	    //System.out.println(resistorsInSeries.totalSeriesResistance(resistorValue));
    }

}