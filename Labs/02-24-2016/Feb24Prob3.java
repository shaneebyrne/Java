import java.until.Scanner;

public class Feb24Prob3

//Programmer: Shane Byrne 02/20/2016

{
	public static void main(String [] args)
	{
		Scanner keyboard = new scanner(System.in);
		
		int first, second, third;
		//user enters numbers
		
		System.out.prinln("Enter your first number:");
		first = keyboard.nextInt();
		System.out.println("Enter your second number:");
		second = keyboard.nextInt();
		System.out.println("Enter your third number:");
		third = keyboard.nextInt();
		//intergers entered
		
		if((first > second) && (first < third)) 
		System.out.println("Incrementing!");
		{
		else if((first < second) && (second < third))
	    System.out.println("Decrementing!");
		}
		{
		else
		 {
		  System.out.println("Neither!");
		 } 
		}
	}
}
