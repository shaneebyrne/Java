/**
 *	Programmers:Shane B., Akhil B. Michael M., Cameron H., Karl R.
 *	Course: CS112 Day/Time: Tuesday (1730-1920)
 *	Chapter 
 *	Date Created/Last Modified: 
 *
 *  Program title(s): CoinMain, CoinName, CoinValue
PURPOSE:
This program should prompt the user to enter coin names or values.
If the user enter a value that is not a correct coin value, a CoinValue exception 
is thrown and the user gets another chance, after two chances, the program ends.
If the user enters a values that is not a correct coin name, a CoinName exception 
is thrown and the user gets another chance, after two chances, the program ends.
All the correct inputs should be collected in a "purse" (an array) and the total 
quantity should be printed, as well as every individual coin.

ALGORITHM:
- Create a CoinValue exception class
- Create a CoinName exception class
- In the main class:
- Create a scanner object and prompt the user for coins
- Use if statements to determine if the coin is valid (valid values are: penny, 
nickel, dime, quarter, 1, 5, 10, and 25)
- After these if statements, use else to catch all wrong inputs.
	- in this else statement, use Integer.parseInt() to determine if the input 
	is a name or a value. This is done by putting the parseInt within a try {} 
	and catching an InputFormatException
	- give the user two tries to put correct input.
	- within the InputFormatException catch block, throw a new CoinName exception
	- for all other values, throw a CoinValue exception.

- create an array to store all correct values. Print out the quantity of each 
coin along with the total amount in the array.

**/
//ACTUAL PROGRAM

import java.util.*;

public class CoinMain {
	
	public static void main(String[] args) throws CoinValue, CoinName, NumberFormatException
	{
		Scanner input = new Scanner(System.in);
		int value = 0;
		int i = 0;
		String name;
		int purse[] = new int[4];
		int total = 0;
		while (i <= 1)
		{
			try
			{
				System.out.println("Enter a number value or name of a coin:");
			//	value = input.nextInt();
				name = input.nextLine();
				
				if (name.equalsIgnoreCase("X"))
				{
					System.out.println("Exiting Program.");
					break;
				}
				else if (name.equalsIgnoreCase("penny") || name.equalsIgnoreCase("1"))
				{
					value = 1;
					i = 0;
					purse[0]++;
					total += value;
					
				}
				
				else if (name.equalsIgnoreCase("quarter") || name.equalsIgnoreCase("25"))
				{
					value = 25;
					i = 0;
					purse[1]++;
					total += value;
				}
				
				else if (name.equalsIgnoreCase("dime") || name.equalsIgnoreCase ("10"))
				{
					value = 10;
					i = 0;
					purse[2]++;
					total += value;
				}
				
				else if (name.equalsIgnoreCase("nickel") || name.equalsIgnoreCase("5"))
				{
					value = 5;
					i = 0;
					purse[3]++;
					total += value;
				}
				
				else
				{
					try
					{
						value = Integer.parseInt(name);
					}
					catch(NumberFormatException e)
					{
						throw new CoinName();
					}
					
					throw new CoinValue();
				}				
			}
			catch(CoinName e)
			{
				System.out.println(e.getMessage());
				i++;
				if (i==1)
					System.out.println("Try again.");
				
				if (i==2)
					System.out.println("Exiting Program");
			}
			catch(CoinValue e)
			{
				System.out.println(e.getMessage());
				i++;
				if (i==1)
					System.out.println("Try again.");
				
				if (i==2)
					System.out.println("Exiting Program");
			}
		}
		
		System.out.println("Pennies: " + purse[0]);
		System.out.println("Nickels: " + purse[3]);
		System.out.println("Dimes: " + purse[2]);
		System.out.println("Quarters: " + purse[1]);
		System.out.println("Total: " + total + " cents.");
	}
}

