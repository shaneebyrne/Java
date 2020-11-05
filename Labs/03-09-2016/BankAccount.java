//Object is your acount.
//Class and test program need to be in the same folder.
public class BankAccount {
	//Programmer: Shane Eire Byrne
	private double balance = 0;
	void deposit(double amount) //Void indicates that it does not return anything.
	{
		balance  += amount; //Equivalent to balance = balance + amount;
	}
	void withdraw(double amount) // (double amount) is a Parameter type.
	{
		balance -= amount; //Equivalent to balance = balance - amount;
	}
	double getBalance()
	{
		return balance;
	}
}
	
