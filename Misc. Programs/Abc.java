import java.util.Scanner;
public class Abc
{
	private int first;
	private int second;
	private String name; 
	
	public Abc(int first, int second, String name)
	{
		this.first = first;
		this.second = second;
		this.name = name;
	}
	public void readInputName()
	{
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		
	}
	public void readInputFirst()
	{
		Scanner in = new Scanner(System.in);
		first = in.nextInt();
	}
	
	public void readInputSecond()
	{
		Scanner in = new Scanner(System.in);
		second = in.nextInt();
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName(String name)
	{
		return name;
	}
	
	public void setFirst(int first)
	{
		this.name = name;
	}
	
	public int getFrist(int first)
	{
		return first;
	}
	
	public void setSecond(int second)
	{
		this.second = second;
	}
	
	public int getSecond(int second)
	{
		return second;
	}
	
	public String toString()
	{
		return name + " " + first + " " + second;
	}
	
}
