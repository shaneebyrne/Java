public class LabeledPointBravo
{
		private String label;
		private Point point;
		
		public LabeledPointBravo(int x, int y, String label)
		{
			Point = new Pint(x,y);
			this.label = label;
		}
		
		public String toString()
		{
		return(point.toString() + " " + label);
		}
}
