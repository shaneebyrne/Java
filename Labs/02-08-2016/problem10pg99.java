import java.util.Scanner;
import java.text.NumberFormat;
public class problem10pg99

 /* Chapter 1-Programming projects handout # 2 Project number 3
 * Fine Name: temperatureConverter.Java
 * Programmer: Shane Eire Byrne
 * Date Last Modified: Feb 10th, 2016
 * Problem Statement: 
 * Program needs to:
 * 1.) choose name/quanity/price (fixed) of 3 items
 * 2.) Output a bill w/ tax rate of 6.25%
 * 3.) price= decimal place of 2
 * 4.) 30 characters for the name
 * 5.) 10 characters for quanity
 * 6.) 10 characters for price
 * 7.) 10 characters for total
 * Overall plan: 
 * 1.) User Assigns names to items
 * 2.) User assignes quanity to items
 * 3.) User assignes price to items
 * 4.) Program calculates and displayes subtotal, and final total of items
 * Classes needed and Purpose: Input, Output, Scanner, String, System
*/
{
  public static void main(String [] args)
     {
	 
     Scanner keyboard = new Scanner(System.in);
       String i1, i2, i3; int q1, q2, q3;  double p1, p2, p3, subTot1, subTot2, subTot3, subTotal, total; 
       /* i1=first item, i2=second item, i3=third item. q1=first quantity, q2=second quantity, q3=third quantity* p1=first price, p2=2nd price. p/
      3=3rd price. subTot1 = first item subtotal, subTot2=2nd item subtotal. subTot3= 3rd item SubTotal=subTot1 + subTot2 + subTot3. total=subtotal * tax. */
      
       System.out.println("Enter first item: ");
       i1 = keyboard.nextLine(); 
       System.out.println("Enter the second item: "); 
       i2 = keyboard.nextLine();
       System.out.println("Enter third item: ");
       i3 = keyboard.nextLine();
       
      System.out.println("Enter quanity of " + i1 + " desired: ");
      q1 = keyboard.nextInt(); 
      
      System.out.println("Enter quanity of " + i2 + " desired: ");
      q2 = keyboard.nextInt();     
      System.out.println("Enter quanity of " + i3 + " desired: ");
      q3 = keyboard.nextInt();
      
      
      System.out.println("Enter the price of " + i1); 
      
      p1 = keyboard.nextDouble(); 
      System.out.println("Enter the price of " + i2);
      p2 = keyboard.nextDouble();  
      System.out.println("Enter the price of " + i3);
      p3 = keyboard.nextDouble();
       
     subTot1 = q1 * p1; subTot2 = q2 * p2; subTot3 = q3 * p3; subTotal = subTot1 + subTot2+ subTot3; total = subTotal * 1.625;
     /*tax rate of 6.25%*/
     
     System.out.println("Item          " + "Quanity           " + "Price");
     System.out.printf("%30.0f",i1 + q1 + p1);
     System.out.printf("%30.0f",i2 + q2 + p3);
     System.out.printf("%30.0f",i3 + q3 + p3);
     System.out.printf("Subtotal = " + subTotal);
     System.out.printf("Total = " + total);
     
     } 
}  

