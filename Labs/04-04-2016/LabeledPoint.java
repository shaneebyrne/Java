public class LabeledPoint
{
	private int x;
	private int y;
	private String label;
	
	public LabeledPoint(int x, int y, String label)
	{
		this.x = x;
		
		this.y = y;
		
		this.label = label;
		
	}
	
	public String toString()
	{
		return x + "," + " "+ y + " " + label;
	}
}
	
