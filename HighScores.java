import java.lang.reflect.Array;
import java.util.*;

public class HighScores {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the size of scores to be maintained.");
		int scoresSize = input.nextInt();

		int highScores[] = initialiseHighScores(scoresSize);
		System.out.println("Enter the list of numbers");
		for(int count = 0; count < scoresSize; count++ ) 
		{
			highScores[count] = input.nextInt();
		}
		int temp = 0;
		for(int count = 0; count < scoresSize; count++) 
		{
			for(int count2 = count + 1; count2 < scoresSize; count2++)
			{
				if(highScores[count] < highScores[count2]) 
				{
					temp = highScores[count2];
					highScores[count2] = highScores[count];
					highScores[count] = temp;
				}
			}
		}
		System.out.print("The scores are :");
		printHighScores(highScores, scoresSize);
		//Arrays.sort(highScores);
		//printHighScores(highScores, scoresSize);
		boolean done = false;
		while (!done) 
		{
			System.out.println("\nEnter new score");
			int newScore = input.nextInt();
			boolean higher = higherThan(highScores, newScore, scoresSize);
			System.out.println(higher);
			if(higher == true) 
			{
				highScores = insertScore(highScores, newScore, scoresSize);
				System.out.print("The scores are :");
				printHighScores(highScores, scoresSize);
			}
		}
	}

	public static int[] initialiseHighScores (int scoresSize)  {
		int highScores[]= new int[scoresSize];
		for (int count = 0; count < scoresSize; count++) 
		{
			highScores[count] = 0;
		}
		return highScores;
	}

	public static void printHighScores(int highScores[], int scoresSize) {
		for(int count = 0; count < scoresSize; count++)
		{
			System.out.print(highScores[count] + ",");
		}

	}

	public static boolean higherThan(int highScores[], int newScore, int scoresSize) {
		for(int count = 0; count < scoresSize; count++)
		{
			if(newScore > highScores[count]) 
	     	{
				return true;					
	     	}

		}return false;
	}

	public static int[] insertScore(int highScores[], int newScore, int scoresSize) {
		int count = 0;
		boolean check = false;
		while(count < scoresSize && check == false)
		{
			if(newScore > highScores[count])
			{
				check = true;
			}
			else
				count++;
		}
		for(int i = 0; i < count; i++)
		{
			highScores[i] = highScores[i+1];
		}
		highScores[count] = newScore;
		return highScores;
	}

}

