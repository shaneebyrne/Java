/**
 *	Programmers:
 *	Course: CS112 Day/Time: Tuesday (1730-1920)
 *	Chapter 
 *	Date Created/Last Modified: 
 *
 *  Program title(s): TornadoException.java
 *
 *  Problem Statement:
 *
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
 *	
 * 
**/
//ACTUAL PROGRAM


public class TornadoException extends Exception
{
	private int m;

	public TornadoException()
	{
		super("Tornado: Take cover immediately!");
	}
	
	public TornadoException(int m)
	{
		super("Tornado: " + m + " miles away and approaching fast!");
	}
}
