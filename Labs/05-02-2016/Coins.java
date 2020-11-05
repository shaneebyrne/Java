import java.util.Arrays;

import java.util.Scanner;

public class Coins
{
	enum Coin {PENNY, NICKLE, DIME, QUARTER, HALFDOLLAR, DOLLAR};
	
	public static void main(String[] args)
	{
		final double PENNYVALUE = 0.01;
		final double NICKLEVALUE = 0.05;
		final double DIMEVALE = 0.10;
		final double QUARTERVALUE = 0.25;
		final double HALFDOLLARVALUE = 0.50;
		final double DOLLARVALUE = 1.00;
		
		char entry;
		int howManyCoins = 0;
		double total;
		
		
		Scanner in = new Scanner(System.in);
		Coin[] youHave = Coin.values();
		
		Coin coin1 = Coin.PENNY;
		Coin coin2 = Coin.NICKLE;
		Coin coin3 = Coin.DIME;
		Coin coin4 = Coin.QUARTER;
		Coin coin5 = Coin.HALFDOLLAR;
		Coin coin6 = Coin.DOLLAR;
	
		System.out.println(Arrays.toString(youHave));
		System.out.println(" " );
		System.out.println(coin1);
		System.out.println(" " );
		System.out.println(coin2);
		System.out.println(" " );
		System.out.println(coin3);
		System.out.println(" " );
		System.out.println(coin4);
		System.out.println(" " );
		System.out.println(coin5);
		System.out.println(" " );
		System.out.println(coin6);
		System.out.println(" " );
		
		entry = in.next(".").charAt(0);
	}
}
