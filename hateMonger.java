imput java.io.FileNotFoundException
import java.util.Scanner;

public class hateMonger

 /* Chapter 2-problem 12 page 98 */
 /*Programmer: Shane Eire Byrne  */
 /*Last date of edit: 02/17/2016 */

 public static void main(String [] args);
   {
    
   {
    fileIn = null;
    try 
    (
     fileIn = new Scanner(;
          new FileInputStream("C:/Users/W7045893/CS111/Labs/02-01-2016/question5.txt"));
   )
        {
     catch (FileNotFoundException e)
     /*if file is not retrieveable this line of code will be run*/
      System.out.println("File not found.");
      System.exit(0);
   }
   { 
	Scanner keyboard = new Scanner(System.in);
    }   
    {
   String eins, zwei, dri, fear;
          System.out.println(" Enter your first sentence.");  
          eins =  keyboard.nextLine();
          System.out.println(" Enter your second sentence.");  
          zwei = keyboard.nextLine();
          System.out.println(" Enter your third sentence.");  
          dri = keyboard.nextLine();
          System.out.println(" Enter your fourth sentence.");  
          fear = keyboard.nextLine();
   }
}       
    
