import java.util.Scanner;
import javax.swing.JOptionPane;
public class ArrayOfScores

	/** Arrays are a way of retaining information in memory as program is running.
	 * ex: String size = "large"; what if one wanted to keep 10 sizes?
	 * labor entensive to name each variable.
	 * ex. scores double  10.5
	 * Array is a class; we are using an object of type Array in this deministration.
	 * Array has the property of length. index < 5; (scores.length)
	 * Common error for array is "array index out of bounds"; somehow within loop has gone beyond the parameters for said array.
	 * How to initalize an array: int[] age = {2,12,1};
	 * if an array is not initalized, it will be initalized to the default value of its type; for integers it will be all 0's.
	 * class will be null.
	 * 
	 * char[] = {'A', 'B', 'C']; //character array
	 * String s;
	 * s = a //illegal in Java
	 * 
	 * Construct a string using a character array:
	 * s = new String(a);
   */
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter five scores: ");
		double[] scores = new double[5]; //creats an array object of double, number of numbers array holds is declared.
		int index;
		double max;
		scores[0] = in.nextDouble();
		System.out.println("Entered score is: " + scores[0]);
		max = scores[0]; //0 is the first item of the array
		for(index = 1; index< scores.length; index++)
		{
			scores[index] = in.nextDouble();
			System.out.println("Entered score is: " + scores[index]);
			if(scores[index] > max)
			max = scores[index]; //max is the latgest values score[0],..., score[index].
		}
		System.out.println("The highest score is: " + max);
		System.out.println("The scores are: " );
		for(index = 0; index < scores.length; index++)
		System.out.println(scores[index]+ "\t" + " different from max by " + "\t" + (max - scores[index]));
	}
}
