public class OlympicMetals
//a.length = rows;
//a[0].length = # columbs
{
	public static void main(String[] args)
	{
		int[][] array = new int[4][5];
		
		
		int i, j, sum;
		i = 4;
		j = 5;
		for(j = 0;  j < array.length; j++)
		{
			sum = 0;
			for(j = 0; j < array[0].length; j++)
			{
				sum += array[i][j];
			}
		System.out.println( );
		}
	}
}

