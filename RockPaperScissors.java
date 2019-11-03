
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
	public static final int MAX_NUMBER = 3;

	public static void main(String[]args) {
		int userWins = 0;
		int computerWins = 0;

		for(int counter = 1; counter <= 5; counter ++) {
			System.out.print("Enter 1 (for Rock) or 2 (for Paper) or 3 (for Scissors): ");
			Scanner input = new Scanner(System.in);
			int userPlayer = input.nextInt();

			Random  generator = new Random();
			int compPlayer = generator.nextInt(MAX_NUMBER+1);

			if (userPlayer == ROCK && compPlayer == SCISSORS ) 
			{
				System.out.println("You won this round as I chose Scissors.");
				userWins++;
			}
			else if(userPlayer == ROCK && compPlayer == PAPER) 
			{
				System.out.println("You lost this round as I chose Paper."); 
				computerWins++;
			}
			else if(userPlayer == PAPER && compPlayer == ROCK) 
			{
				System.out.println("You won this round as I chose Rock.");
				userWins++;
			}
			else if(userPlayer == PAPER && compPlayer == SCISSORS) 
			{
				System.out.println("You lost this round as I chose Scissors.");
				computerWins++;
			}
			else if(userPlayer == SCISSORS && compPlayer == ROCK) 
			{
				System.out.println("You lost this round as I chose Rock.");
				computerWins++;
			}
			else if(userPlayer == SCISSORS && compPlayer == SCISSORS) 
			{
				System.out.println("You won this round as I chose Paper.");
				userWins++;
			}
              
			else
			{
				if (compPlayer == ROCK) 
				{
					System.out.println("This round was a draw as I chose Rock too.");
				}
				else if (compPlayer == PAPER) 
				{
					System.out.println("This round was a draw as I chose Paper too.");
				}
				else 
				{
					System.out.println("This round was a draw as I chose Scissors too.");
				}
				
			}
			
		}
		
		System.out.println("The final score was Computer: " + computerWins + " User: " + userWins);
	}
	
}
