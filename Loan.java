 /**
 *	Programmer:David Ramirez, Hal Fisher, Shane Byrne, Willy Chen
 *	Course: CS112 Day/Time: Tuesday (5:30)-9:20pm)
 *	Chapter 10
 *	Date Created/Last Modified: 10/04/2016
 *
 *  Program title(s): Loan.java, LoanTest.java
 *  
 *	Summary of Program: Create a program that calculates the mothly and total payments (using a 3 parameter constructor)
 *      to a binary file using writeObject() method. Create several loan objects and append them after they have been created.
 *      Create an input stream and read the objects back from the binary file (using readObject() method). 
 *      Compute thet toatl load amoujnt for all objects.Display total loan amount for all objects to the console window. 
 *      Print Screen results.
 *	
 *	Algorithm:
 *	I.) 
 *	II.) 
 *	III.) 
 *	IV.) 
 *	V.) 
 *
 *
 *  IMPORTATED PACKAGES
 *	import java.io.Serializable;
 *	import java.util.Scanner;
 *	import java.io.ObjectOutputStream;
 *	import java.io.FileOutputStream;
 * 
**/
//ACTUAL PROGRAM
 import java.io.*;
 public class Loan implements Serializable
 {
 	private String customerName;
 	private double annualInterestRate;
 	private int numberOfYears;
 	private double loanAmount;
 	private String loanDate;
 	private double monthlyPayment;
 	private double totalPayment;
 	
 	public Loan()
 	{
 		annualInterestRate = 0.0;
 		numberOfYears = 0;
 		loanAmount = 0.0;
 	}
 	
 	public Loan(double interestRate, int years, double amount)
 	{
 		annualInterestRate = interestRate;
 		numberOfYears = years;
 		loanAmount = amount;
 	}
 	
 	public Loan(Loan other)
 	{
 		this.customerName = other.customerName;
 		this.annualInterestRate = other.annualInterestRate;
 		this. numberOfYears = other.numberOfYears;
 		this.loanAmount = other.loanAmount;
 		this.loanDate = other.loanDate;
 		this.monthlyPayment = other.monthlyPayment;
 		this.totalPayment = other.totalPayment;
 	}
 	
 	public boolean equals(Loan other)
 	{
 		if((this.customerName == other.customerName) &
 		(this.annualInterestRate == other.annualInterestRate) &
 		(this. numberOfYears == other.numberOfYears) &
 		(this.loanAmount == other.loanAmount) &
 		(this.loanDate == other.loanDate) &
 		(this.monthlyPayment == other.monthlyPayment) &
 		(this.totalPayment == other.totalPayment))
 		{
 			return true;
 		}
 		else
 		{
 			return false;
 		}
 	}
 	
 	public String toString()
 	{
 		return("Customer Name: \t" + customerName + "\r" + "Annual Interest Rate: \t" + annualInterestRate + "\r" ); 
 		
 	}
 	
 	public String getCustomerName()
 	{
 		return customerName;
 	}
 	
 	public void setCustomerName(String name)
 	{
 		customerName = name;
 	}
 	
 	public double getAnnualInterestRate()
 	{
 		return annualInterestRate;
 	}
 	
 	public void setAnnualInterestRate(double rate)
 	{
 		annualInterestRate = rate;
 	}
 	
 	public int getNumberOfYears()
 	{
 		return numberOfYears;
 	}
 	
 	public void setNumberOfYears(int years)
 	{
 		numberOfYears = years;
 	}
 	
 	public double getLoanAmount()
 	{
 		return loanAmount;
 	}
 	
 	public void setLoanAmount(double amount)
 	{
 		loanAmount = amount;
 	}
 	
 	public String getLoanDate()
 	{
 		return loanDate;
 	}
 	
 	public double getMonthlyPayment()
 	{
 		return monthlyPayment;
 	}
 	
 	public double getTotalPayment()
 	{
 		return totalPayment;
 	}
 	
 	public double calcMonthlyPayment()
 	{
 		double monthlyInterestRate = annualInterestRate / 1200;
 		monthlyPayment = loanAmount * monthlyInterestRate / (1-(Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
 		return monthlyPayment;
 	}
 	
 	public double calcTotalPayment()
 	{
 		totalPayment = monthlyPayment * numberOfYears*12;
 		return totalPayment;
 	}
 }