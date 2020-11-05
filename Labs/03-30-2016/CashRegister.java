public class CashRegister
//Programmer: Shane Eire Byrne
{
	private double payments;
	private double purchases; 
	
	public CashRegister() //Constructor for CashRegister class
	{
		payments = 0;
		purchases = 0;
	}
	
	public void recordPurchase(double amount)
	{
		purchases += amount;
	}
	public void enterPayment(Coin coin, int numCoins)
	{
		payments = numCoins + coin.getValue();
	}
}
