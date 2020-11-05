import java.util.Scanner;
	/**
	 * Array.Sort(score[]);
	 *return the lowest index
	 * int judgeMin = 0;
	 * for(i = 0; i< score.length; i++
	 * {
	 * 		if(score[i] < score [judgeMin])
	 * {
	 * 		judgeMin = i; //index of minimal.
	 * } 
   */

public class DiveCompetition
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		
		//System.out.println("Enter all 7 scores provided by judges for the dive: " );
		
		double[] judgesScore = new double[7];
		double[] difficulty = new double[7]; //should between 1.2 and 3.8
		final double multiplier = 0.6;
		double finalScore;
		int index;
		//int i;
		double judge_with_max_score;
		double judge_with_min_score;
		System.out.println("Enter first judges score: ");
		judgesScore[0] = in.nextDouble();
		System.out.println("Enter first judges degree of difficulty: ");
		for(index = 1; index < judgesScore.length; index++)
		{
			
		
		
		
		}
		/*difficulty[0] = in.nextDouble();
		if((difficulty[0] >= 1.2) & (difficulty[0] <= 3.8)) 
			{
				difficulty[0] = difficulty[index];
			}
		else
		{
			System.out.println("Invalid entry. Program terminating!");
			System.exit(0);
		}
		for(index = 1; index = index.length; index++)
		{
			
		judge_with_max_score = 0;
		for(i = 1; i < 7; i++)
		{
			if((judgeScore[i] < judgeScore[judge_with_min_score]})
			{
				judge_with_min_score = i;
			}
		}
	   */
	   
	   
	}
}
