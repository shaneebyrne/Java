import java.util.Scanner;
public class numberComparitor

 /* Shane Eire Byrne
 * Last Date of change: 02/22/2016
 * Lab 02/22/2016
 * Problem 2
*/

{
   public static void main(String[] args)   
   {
       
    Scanner keyboard = new Scanner(System.in);
    
    int first, second, third;
    System.out.println("Enter the first number:");
    first = keyboard.nextInt();
    System.out.println("Enter the second number:");
    second = keyboard.nextInt();
    System.out.println("Enter the third number:");
    third = keyboard.nextInt();
        
     if((first == second) && (first == third))
     System.out.println("All the same");
          
     else if(first != second && second != third && third != first)
     System.out.println("All different.");
	 
	 else
	 System.out.println("Neither");  
   } 
}
