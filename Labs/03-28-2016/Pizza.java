import java.util.Scanner;
import java.text.NumberFormat;
//Programmer: Shane Eire Byrne
public class Pizza 
{
	private String size;
	private int numCheese;
	private int numPepperoni;
	private int numHam;
	
	public Pizza()  //Constructor for Pizza class
	{
		size = "Large";
		numCheese = 1;
		numHam = 0;
		numPepperoni = 0;
	}
	
	public Pizza(String pizzaSize, int cheese, int ham, int pepperoni)
	{
		size = pizzaSize;
		numCheese = cheese;
		numHam = ham;
		numPepperoni = pepperoni;
	}
	
	public void setSize(String size) //setter for size
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the pizza you desire to order: ");
		System.out.println("(Small, Medium, or Large)");
		size = in.nextLine();
		if(size.equalsIgnoreCase("Small"))
			{
				this.size = size;
			}
			
		else if(size.equalsIgnoreCase("Medium"))
			{
				this.size = size;
			}
		else if(size.equalsIgnoreCase("Large"))
			{
				this.size = size;
			}
	}
	
	public String getSize(String size) //getter for size
	{
		return size;
	}
	
	public void setNumCheese(int numCheese) //setter for cheese
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the quanity of cheese servings you desire for your pizza: ");
		numCheese = in.nextInt();
		this.numCheese = numCheese;
	}
	
	public int getNumCheese(int numCheese) //getter for numCheese
	{
		return numCheese;
	}
	
	public void setNumHam(int numHam) //setter for numHam
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the quanity of ham servings you desire for your pizza: ");
		numHam = in.nextInt();
		this.numHam = numHam;
	}
	
	public int getNumHam(int numHam) //getter for numHam
	{
		return numHam;
	}
		public void setNumPepperoni(int numPepperoni)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the quanity of pepperoni servings you desire for your pizza: ");
		numPepperoni = in.nextInt();
		this.numPepperoni = numPepperoni;
	}
	

	public int getNumPepperoni(int numPepperoni)
		{
			return numPepperoni;
		}
		
	public double getCost(double cost) //getter for cost
		{
		/* Small: $10 + $2/topping
			 * Medium: $12 + $2/topping
			 * Large: $14 + $2/topping
		   */
	   double kleinKosten = 0; 	 //cost of small with/without toppings.
	   double mittelKosten = 0; //cost of medium with/without toppings.
	   double grossKosten = 0; //cost of large with/without toppings.
	   double kosten = 0;     //cost of pizza size with/without toppings.
	   if(size.equalsIgnoreCase("Small"))
		{
			kleinKosten = 10.00;
			numCheese = numCheese * 2;
			numHam = numHam * 2;
			numPepperoni = numPepperoni * 2;
			kosten = kleinKosten + numCheese + numHam + numPepperoni;
			System.out.println("The cost of your " + size + " pizza is " + "$" + kosten);
		}
	    else if(size.equalsIgnoreCase("Medium"))
		{
			mittelKosten = 12.00;
			numCheese = numCheese * 2;
			numHam = numHam * 2;
			numPepperoni = numPepperoni * 2;
			kosten = kleinKosten + numCheese + numHam + numPepperoni;
			System.out.println("The cost of your " + size + " pizza is " + "$" + kosten);
		}
		else if(size.equalsIgnoreCase("Large"))
		{
			grossKosten = 12.00;
			numCheese = numCheese * 2;
			numHam = numHam * 2;
			numPepperoni = numPepperoni * 2;
			kosten = kleinKosten + numCheese + numHam + numPepperoni;
			System.out.println("The cost of your " + size + " pizza is " + "$" + kosten);
			kosten = cost;
		    
		}
		return cost;
	}

	public String getDescription(String description)
			{
			/* Small: $10 + $2/topping
			 * Medium: $12 + $2/topping
			 * Large: $14 + $2/topping
		   */
	   double kleinKosten = 0; 	 //cost of small with/without toppings.
	   double mittelKosten = 0; //cost of medium with/without toppings.
	   double grossKosten = 0; //cost of large with/without toppings.
	   double kosten = 0;     //cost of pizza size with/without toppings.
	   if(size.equalsIgnoreCase("Small"))
		{
			kleinKosten = 10.00;
			numCheese = numCheese * 2;
			numHam = numHam * 2;
			numPepperoni = numPepperoni * 2;
			kosten = kleinKosten + numCheese + numHam + numPepperoni;
			description = "You ordered a " + size + " pizza with and/or" + numCheese + " servings of cheese " + numHam + " and/or servings of ham, " + numPepperoni + " servings of pepperoni. The cost comes out to: $" + kosten;
			System.out.println(description);
		}
	    else if(size.equalsIgnoreCase("Medium"))
		{
			mittelKosten = 12.00;
			numCheese = numCheese * 2;
			numHam = numHam * 2;
			numPepperoni = numPepperoni * 2;
			kosten = mittelKosten + numCheese + numHam + numPepperoni;
			description = "You ordered a " + size + " pizza with and/or" + numCheese + " servings of cheese " + numHam + " and/or servings of ham, " + numPepperoni + " servings of pepperoni. The cost comes out to: $" + kosten;
			System.out.println(description);
		}
		else if(size.equalsIgnoreCase("Large"))
		{
			grossKosten = 12.00;
			numCheese = numCheese * 2;
			numHam = numHam * 2;
			numPepperoni = numPepperoni * 2;
			kosten = grossKosten + numCheese + numHam + numPepperoni;
			description = "You ordered a " + size + " pizza with and/or" + numCheese + " servings of cheese " + numHam + " and/or servings of ham, " + numPepperoni + " servings of pepperoni. The cost comes out to: $" + kosten;
			System.out.println(description);
		}
			
			return description;
		}
	
}


