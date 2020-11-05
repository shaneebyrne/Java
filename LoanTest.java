/**
 * CS 112
 * Programmers: David Ramirez
 *				Hal Fisher
 *				Shane Byrne
 *				Willy Chen
 *
 * LoanTest.java
 */
 import java.util.Scanner;
 import java.io.*;
 
 public class LoanTest
 {
 	public static void main(String[] args) throws Exception
 	{
 		double annualInterestRate;
	 	int numberOfYears;
	 	double loanAmount;
	 	boolean endOfFile = false;
	 	
	 	Loan[] loanID = new Loan[3];
	 	Loan[] loanID2 = new Loan[3];
 		Scanner keyboard = new Scanner(System.in);
 		
 		
 		//Initializaing the Loans from user input
 		for(int i = 0; i < 3; i++)
 		{
 			System.out.print("Please provide an Annual Interest Rate: ");
 			annualInterestRate = keyboard.nextDouble();
 			
 			System.out.print("Please provide the number of years: ");
 			numberOfYears = keyboard.nextInt();
 			
 			System.out.print("Please provide a Loan Amount: ");
 			loanAmount = keyboard.nextDouble();
 			
 			loanID[i] = new Loan(annualInterestRate, numberOfYears, loanAmount); 
 			System.out.println("Loan has been made . . . \n");
 						
 		}
 		keyboard.close();
 		
 		//Create the stream file
 		ObjectOutputStream outFile = new ObjectOutputStream(
		                     new FileOutputStream("Loans.dat"));
 		
		                     
		//Write the objects to file
		for(int i = 0; i < loanID.length; i++)
		{
			outFile.writeObject(loanID[i]);
		}	
		                
 		outFile.close();
 		System.out.println("The loans have been written to the Loans.dat file");
 		
 		
 		ObjectInputStream inFile =
 						new ObjectInputStream(new FileInputStream("Loans.dat"));
 						
 		//READING
 		System.out.println("Reading. . .");
 		for (int i = 0; i < loanID.length; i++)
 		{
 			loanID[i] = (Loan)inFile.readObject();
 		}
 		
 		for(int i = 0; i < loanID.length; i++)
 		{
 			System.out.println("Loan: " + (i+1)
 				+"\n -Annual Interest: " + loanID[i].getAnnualInterestRate()
 				+"\n -Number of years on loan: " + loanID[i].getNumberOfYears()
 				+"\n -Loan Amount: " + loanID[i].getLoanAmount());
 		}
 		inFile.close();
 		
 		
 		//Creating new objects
 		
 		System.out.println("\nCreating and writing new objects. . .");
 		loanID2[0] = new Loan(12,3,500);
 		loanID2[1] = new Loan(2,8,5000);
 		loanID2[2] = new Loan(5,3,500);
 		
 		outFile = new ObjectOutputStream(
		              new FileOutputStream("Loans.dat", true));
		                     
		for(int i = 0; i < loanID2.length; i++)
		{
			outFile.writeObject(loanID2[i]);
		}
 		
 		outFile.close();
 		System.out.println("Created and written.\n");

		//Reading it again
 		inFile = new ObjectInputStream(new FileInputStream("Loans.dat"));
 		
 		int count = 1;
 		
 		try
 		{
 			while(true)
 			{
	 			Loan readLoan = (Loan) inFile.readObject();
	 			System.out.println("Loan: " + count
	 				+"\n -Annual Interest: " + readLoan.getAnnualInterestRate()
	 				+"\n -Number of years on loan: " + readLoan.getNumberOfYears()
	 				+"\n -Loan Amount: " + readLoan.getLoanAmount());
	 			count++;
 			}
 		}
 		catch(EOFException e)
 		{
 			System.out.println("Finished reading");
 		}
 		
 		inFile.close();

 	}
 }