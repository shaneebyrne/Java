import java.util.Scanner;
public class AbcTester
{
	
		public static void main(String[] args)
		{
			Scanner in= new Scanner(System.in);
			String newName;
			Abc neu = new Abc(1, 1, "Potato");
			System.out.println("Enter your name: ");
			neu.readInput();
			System.out.println("Enter a number: ");
			neu.readInputFirst();
			System.out.println("Enter another number: ");
			neu.readInputSecond(); 
			neu.setName("Bob");
			neu.setFirst(1);
			neu.setSecond(10);
			
			
			System.out.println(neu);
			
		}
}
