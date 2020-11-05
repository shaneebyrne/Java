import java.util.Scanner;
import java.lang.Math;

public class digitReader

 /* Chapter 3- Programming Prokects Handout #4
 *  Project # 1
 * 
 *  Programmer: Shane Eire Byrne
 *  Program name: digitReader.java
 *  Date Last Modified: 02/26/2016
 * 
 *  Problem statement:
 *  Write a program that reads an integer and prints how many digits the
 *  number has, by checking whether the number is >=10, >=100, and so on.
 *  (Assume that all integers are less then ten billion.) 
 *  If the number is negative, first multiply ith with -1.
 *  Program needs to:
 *  1.) Read 3 integers (given by user)
 *  2.) Convert any negative numbers given (multiply by -1)
 *  3.)  Check if number is >= 10
 *  4.)  Check if number is >= 100 
 *  5.)  Check if number is >= 1,000
 *  6.)  Check if number is >= 10,000
 *  7.)  Check if number is >= 100,000
 *  8.)  Check if number is >= 1,000,000
 *  9.)  Check if number is >= 10,000,000
 *  10.) Check if number is >= 100,000,000
 *  11.) Check if number is >= 1,000,000,000
 *  12.) Check if number is >= 10,000,000,000
 *  13.) Output how many "digits" are in the number. *  
 * 
 *  Overall plan:
 *  1.) Scanner reads user inputted numbers.
 *  2.) Negative numbers are converted to positive.
 *  3.) Check to see if number is >=10 through >= 10,000,000,000
 *  4.) Output print length of number; "digits" 
 * 
 *  Classed needed and purpose: Math (takes absolute value of input) , Scanner (takes user input), System
*/

{
	public static void main(String[] args)
	{
	 Scanner keyboard = new Scanner(System.in);
	 
	 int first;
	 int second;
	 int third;
	 /*End User entered variables.*/
	 
	 int TEN;
	 TEN = 10;
	 int HUNDRED;
	 HUNDRED = 100;
	 int THOUSAND;
	 THOUSAND = 1000;
	 int TEN_THOUSAND;
	 TEN_THOUSAND = 10000;
	 int HUNDRED_THOUSAND;
	 HUNDRED_THOUSAND = 100000;
	 int MILLION;
	 MILLION = 1000000;
	 int TEN_MILLION;
	 TEN_MILLION = 10000000;
	 int HUNDRED_MILLION;
	 HUNDRED_MILLION = 100000000;
	 int BILLION;
	 BILLION = 1000000000;
	 double TEN_BILLION;
	 TEN_BILLION = 10E9;
	 /*End constant variables.*/
	 
	 
	 System.out.println("Digit Reader!");
	 System.out.println("");
	 
	 System.out.println("Enter your first number: "); 
	 System.out.println(""); 
	 first = keyboard.nextInt();
	 System.out.println("");
	 
	 System.out.println("Enter your second number: ");
	 System.out.println(""); 
	 second = keyboard.nextInt();
	 System.out.println("");
	 
	 System.out.println("Enter your third number: ");
	 System.out.println(""); 
	 third = keyboard.nextInt();
	 System.out.println(""); 
	 
	 System.out.println("First entry is: " + first);
	 System.out.println("");
	 System.out.println("Second entry is: " + second);
	 System.out.println("");
	 System.out.println("Third entry is: " + third);
	 System.out.println("");
	 
	 if((first < TEN))                { 
	  System.out.print(first + " has 1 digit");
	 }else{ 
		  if(first < HUNDRED)         {
		 System.out.print(first + " has 2 digits");
	 }else{
			if(first < THOUSAND){
			System.out.println(first + " has 3 digits");
	 }else{
		    if(first < TEN_THOUSAND)  {
		    System.out.println(first + " has 4 digits");
     }else{
		 if(first < HUNDRED_THOUSAND) {
		 System.out.println(first + "has 5 digits");
	 }else{
		 if(first < MILLION){
		 System.out.println(first + " has 6 digits");	 
	 }else{
		 if(first < TEN_MILLION)      {
		 System.out.println(first + " has 7 digits");
	 }else{
		 if(first < HUNDRED_MILLION)  {
		 System.out.println(a + " has 8 digits");
	 }else{
		 if(first < BILLION){
		 System.out.println(first + " has 9 digits");
	 }else{
		 if(first < TEN_BILLION)      {
		 System.out.println(first + " has 10 digits");
	                                  }
	    if((second < TEN))            { 
	  System.out.print(second + " has 1 digit");
	 }else{ 
		  if(second < HUNDRED)        {
		 System.out.print(second + " has 2 digits");
	 }else{
			if(second < THOUSAND)     {
			System.out.println(second+ " has 3 digits");
	 }else{
		    if(first < TEN_THOUSAND)  {
		    System.out.println(second + " has 4 digits");
     }else{
		 if(second < HUNDRED_THOUSAND){
		 System.out.println(second + "has 5 digits");
	 }else{
		 if(second < MILLION)         {
		 System.out.println(second + " has 6 digits");	 
	 }else{
		 if(second < TEN_MILLION)     {
		 System.out.println(second + " has 7 digits");
	 }else{
		 if(second < HUNDRED_MILLION) {
		 System.out.println(second + " has 8 digits");
	 }else{
		 if(second < BILLION)         {
		 System.out.println(second + " has 9 digits");
	 }else{
		 if(second < TEN_BILLION)     {
		 System.out.println(second + " has 10 digits");	 
		 }
	    if((third < TEN))             { 
	  System.out.print(third + " has 1 digit");
	 }else{ 
		  if(third < HUNDRED)         {
		 System.out.print(third + " has 2 digits");
	 }else{
			if(third < THOUSAND)      {
			System.out.println(third+ " has 3 digits");
	 }else{
		    if(third < TEN_THOUSAND)  {
		    System.out.println(third + " has 4 digits");
     }else{
		 if(third < HUNDRED_THOUSAND) {
		 System.out.println(third + "has 5 digits");
	 }else{
		 if(third < MILLION)          {
		 System.out.println(third + " has 6 digits");	 
	 }else{
		 if(third < TEN_MILLION)      {
		 System.out.println(third + " has 7 digits");
	 }else{
		 if(third < HUNDRED_MILLION)  {
		 System.out.println(third + " has 8 digits");
	 }else{
		 if(third < BILLION)          {
		 System.out.println(third + " has 9 digits");
	 }else{
		 if(third < TEN_BILLION)      {
		 System.out.println(third + " has 10 digits");	 
	 }
	} 
}    
