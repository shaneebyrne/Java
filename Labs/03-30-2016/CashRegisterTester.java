public class CashRegisterTester
//Programmer: Shane Eire Byrne
{
	public static void main(String[] args)
	{
		final double PENNY_VALUE = 0.01;
		final double NICKLE_VALUE = 0.05;
		final double DIME_VALUE = 0.10;
		final double QUARTER_VALUE = 0.25;
		//Coin coin1 = new Coin("quarter", QUARTER_VALUE);
		//System.out.println(coin1.getName()+ " " + coin1.getValue());
		
		CashRegister myRegister = new CashRegister();
		myRegister.recordPurchase(0.57);
		//myRegister.enterPayment(new Coin("quarter"), 1);
	}
}
	
