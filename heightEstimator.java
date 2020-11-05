import java.util.Scanner;
import javax.swing.JOptionPane;
public class heightEstimator
/* Chapter 3- Programming Prokects Handout #4
 *  Project # 3
 * 
 *  Programmer: Shane Eire Byrne
 *  Program name: heightEstimator.java
 *  Date Last Modified: 02/28/2016
 * 
 *  Problem statement: 
 *  Write a program that takes as input the gender of the child, the height of the mother in inches,
 *  and the height of the father in inches, and out puts the estimated adult height 
 *  of the child in inches. The program should allow the user to enter a new set of values
 *  and output the predicted height unti the user decides to exit. 
 *  The use user should beable to input the heights in feet and inches, and 
 *  the program should output the estimated height of the child in feet and inches.
 *  Use the int data type to store the heights. 
 *  Formulas used to calculate: 
 *  H(Male_Child) = ((H(Mother) X 13/12) + H(Father))/2
 *  H(Female_Child) = ((H(Father) X 12/13 + H(Mother))/2
 *  
 *  Program needs to:
 *  1.) Take gender and height information for male/female child parents.
 *  2.) User enters foot and inch values.
 *  3.) End loop at users discression. (Infinte entries)
 *  4.) Calculate height of male/female child given values given.
 *  5.) Out put predicted adult height of child.  
 * 
 *  Overall plan:
 *  1.) Take gender input (JOptionPane)
 *  2.) Take mother height (JOptionPane)
 *  3.) Take father height (JOptionPane)
 *  4.) Calculate child height based off gender.
 *  5.) Loop back to gender input until user enters exit (JOption pane)
 *  Classed needed and purpose:  Scanner (takes user input), System
*/
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int frau;
		int mann;
		int junge;
		int madchen;
		int foot;
		int inch;
		String gender;
		String m; m = '1';
		String f; f = '2';
		String exit; exit = '3';
		final int MULTIPLIER_JUNGE;
		final int MULTIPLIER_MADCHEN;
		final int DIVISOR;
		/*variable declaration*/
		
		MULTIPLIER_JUNGE = 13/2;
		MULTIPLIER_MADCHEN = 12/13;
		DIVISOR = 2;
		/*Constants definations.*/
		
		System.out.println("Height Estimator");
		System.out.println("");
		System.out.println("Enter your gender (use 'm' for male; 'f' for female) or enter 'exit' to exit: ");
		System.out.println("");
		gender = keyboard.nextLine();
		System.out.println("Enter your mothers height in inches: ");
		System.out.println("");
		
		frau = keyboard.nextInt();
		/*Mothers height entry.*/
		
		System.out.println("Enter your fathers height in inches: ");
		System.out.println("");
		mann = keyboard.nextInt();
		/*fathers height entry*/
		
		
		junge =(frau * MULTIPLIER_JUNGE + mann) / DIVISOR;
		/*Boy height formula*/
		
		madchen = (mann * MULTIPLIER_MADCHEN + frau) / DIVISOR;
		/*Girl height formula*/
		
		
		switch(gender){
		case 0:
		gender = "m"; 
		break;
		case 1:
		gender = "f"; 
	    break;
	    case 2:
	    gender = "exit";
	    break;
	}
	}
}
