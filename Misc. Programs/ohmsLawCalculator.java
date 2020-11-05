import java.util.Scanner;
public class ohmsLawCalculator
{
   public static void main(String[] args)   
   {
    System.out.println("Ohms Law Calculator!");
    
    Scanner keyboard = new Scanner(System.in);
    
   /*User enters first variable A= voltage*/ 
   double A;
   System.out.println("Enter Voltage: " + "volts" );
   A = keyboard.nextDouble();
   System.out.println("You entered: " + A + "volts");
   
   /*User enters second variable*/ 
   double B;
   System.out.println("Enter Resistance: " );
   B = keyboard.nextDouble();
   System.out.println("You entered: " + B + "Ohms");
   
   /*User enters third variable*/ 
   double C;
   System.out.println("Enter Current " + "Ampheres");
   C = keyboard.nextDouble();
   System.out.println("You entered: " + C + "Ampheres");
   
   /*Variables assinged as A=volts, B=Resistance C=Current*/ 
   double Voltage = B * C; 
   
   double Resistance = A * C;
 
   double Current = A / B;
   
   
   /*Average displayed on screen.*/   
   System.out.println("voltage is " + Voltage + "Volts"); 
   System.out.println("Resistance is " + Resistance + "Ohms");
   System.out.println("Current is + " + Current + "Amps.");
   }
}  
