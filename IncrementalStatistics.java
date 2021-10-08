import java.util.Scanner;

public class IncrementalStatistics {
	public static double lastAverage = 1.0;
	public static int numberOfNumbers = 1;
	public static double lastVariance = 1.0;
	public static boolean finished = false;
	
	public static void main(String[]args) {
		System.out.println("This program computes the average and variance of all numbers entered.");
		System.out.println("\nEnter any number (or type 'exit'): " );
		Scanner input = new Scanner (System.in);
		while(!finished)
		{
			if(input.hasNextDouble())
			{
				double number = input.nextDouble();
				double average;
				double variance;
				average = lastAverage + (number - lastAverage)/numberOfNumbers;
				variance = ((lastVariance*(number-1)) + (number - lastAverage)*(number - average)/numberOfNumbers);
				System.out.println("So far the average is " + average + " and the variance is " + variance);
				System.out.println("Enter another number (or type'exit'). ");
				numberOfNumbers++;
				
			}
			else if(input.hasNext("exit")) 
			{
				finished = true;
				System.out.println("Goodbye.");	
			}
			else 
			{
				System.out.println("Error: You have to enter either a number or the word 'exit'.");
				input.next();
			}
	
		}
		input.close();
				
		
	}
	


}
