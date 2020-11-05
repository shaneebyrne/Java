public class StaticLab
//Programmer: Shane Eire Byrne
{
	//public final static  String NAME = "Shane";
	public static int count = 0;
	private int id;
	
	public StaticLab()
	{
		count = count + 1;  //or count++
		id = count;
		//System.out.println("StaticLab object created: " +  count + " ");
	}
	
	public int getId()
	{
		return id;
	}
}
