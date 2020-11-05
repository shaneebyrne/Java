import java.util.Scanner;
public class distanceConverter
{
   public static void main(String[] args)   
   {
       
    Scanner keyboard = new Scanner(System.in);
    
   /*User enters first variable*/ 
   System.out.println("Centimeter to inch conversion: ");
   System.out.println("Enter desired length (in CM) to be converted into in: ");
   double cm;
   cm = keyboard.nextDouble();
   System.out.println("You entered: " + cm + " Centimeter(s)");
   
   double in;
   in= cm * 0.393701;
   System.out.println(cm + "Centimeters = " + in + "inches");
   
   double ft; 
   ft = in * 12;
   
   double yd;
   yd = ft * 3;
   
   double mile;
   mile = ft * 5280;
   
   System.out.println(cm + "Centimeters is equivalent to: " +
    
   }
}   
