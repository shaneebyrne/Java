import java.util.Scanner;

public class VowelDetector{

//Programmer: Shane Eire Byrne Feb 29, 2016


	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String sentence;
		String vowel;
		vowel = "vowel:  ";
		
		int length;
		
		System.out.println("Enter your sentence (no punctuation please): ");
		System.out.println("");
		sentence = keyboard.nextLine();
		
		for(int i=0; i<sentence.length();i++)
		{
			char ch = sentence.charAt(i);
			if((ch == 'a') || (ch=='e') || (ch == 'i') || (ch == 'o') || ch == 'u' || (ch == 'y') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') || (ch == 'Y'))
			System.out.println(vowel + ch);
		}
		
	}
}
