import java.util.Scanner;

public class CloneNumber{
	//Programmer: Shane Eire Byrne 03/02/2016
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float entry;
		float floatclone;
		//Entry and clone of entry
		
		String END;
		END = "Auf Widersehen!!!!";
		//Displays if user enters a duplicate or cloned entry.
		
		entry = 0;
		floatclone = 0;
		
		System.out.println("Clone number finder!");
		System.out.println("");
		
		System.out.println("Enter a non-whole number (ex. 1.01): ");
		System.out.println("");
		
		do
		{ 
			floatclone = entry;
			entry = keyboard.nextFloat();
			System.out.println(""); 
			System.out.println("You entered: " + entry);
			System.out.println("");
		}
		while(floatclone != entry && entry != 0); {
		System.out.println("");
		System.out.println(END);
		System.out.println("");
		//Displays when user enters a duplicate number.
	}
	}
}
