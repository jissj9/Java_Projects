
import java.util.Random;
import java.util.Scanner;

public class HighLowCardGame {

	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 14;
	public static final int MAX_GUESSES = 4;
	public static final int MAX_VALUE = 13;

	public static void main(String[] args) {

		Random generator = new Random();
		int randomCard = generator.nextInt(MAX_VALUE) + 2;
		int numberOfCorrectGuesses = 0;
		String guess;
		Scanner input = new Scanner(System.in);
		int previousCard;
		int numberOfRuns = 0;

		if (randomCard == JACK)
			System.out.println("The card is a Jack");
		else if (randomCard == QUEEN)
			System.out.println("The card is a Queen");
		else if (randomCard == KING)
			System.out.println("The card is a King");
		else if (randomCard == ACE)
			System.out.println("The card is Ace");
		else
			System.out.println("The card is a " + randomCard);

		boolean incorrectGuess = false;
		while ((numberOfRuns < MAX_GUESSES) && (!incorrectGuess)) {
			numberOfRuns++;
			previousCard = randomCard;
			randomCard = generator.nextInt(MAX_VALUE) + 2;
			System.out.print("Do you think the next card will be higher, lower or equal? ");
			boolean stop = false;
			while (!stop) {

				if (input.hasNext("higher") || input.hasNext("Higher"))
				{
					stop = true;
					guess = input.next();
					if (randomCard > previousCard)
						numberOfCorrectGuesses++;

				} 
				else if (input.hasNext("lower") || input.hasNext("Lower")) 
				{
					stop = true;
					guess = input.next();

					if (randomCard < previousCard)
						numberOfCorrectGuesses++;
				} 
				else if (input.hasNext("equal") || input.hasNext("Equal")) 
				{
					stop = true;
					guess = input.next();
					if (randomCard == previousCard)
						numberOfCorrectGuesses++;
				} 
				else 
				{
					System.out.println("Wrong Input. Try Again");
					System.out.print("Do you think the next card will be higher, lower or equal? ");
					guess = input.next();
				}

			}

			if (randomCard == JACK)
				System.out.println("The card is a Jack");
			else if (randomCard == QUEEN)
				System.out.println("The card is a Queen");
			else if (randomCard == KING)
				System.out.println("The card is a King");
			else if (randomCard == ACE)
				System.out.println("The card is Ace");
			else
				System.out.println("The card is a " + randomCard);

			if (numberOfRuns != numberOfCorrectGuesses)
				incorrectGuess = true;
		}
		input.close();

		if (numberOfCorrectGuesses == MAX_GUESSES) // Output
			System.out.println("Congratulations.  You got them all correct.");
		else
			System.out.println("Oh no you lost! The number of correct guesses are " + numberOfCorrectGuesses);
	}
}
