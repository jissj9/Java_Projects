
import java.util.Scanner;
public class MortgageCalculator {
	public static final int MORTGAGE_DURATION_IN_YEARS = 20;
	public static final int MONTHS_IN_A_YEAR = 12;
	public static final String MORTGAGE_AMOUNT_QUESTION = "Please enter the mortgage amount: €";
	public static final String APR_QUESTION = "Please enter the Annual Interest Rate(APR): ";
	public static final String AFFORD_QUESTION = "How much can you afford to pay per month:? €";
	public static final String CONTINUE_QUESTION = "Would you like to use the mortgage calculator again (yes/no)? ";

	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		boolean finished = false;
		System.out.println("Welcome to the mortgage Calculator,");
		do 
		{
			double mortgageAmount = readDoubleFromUser(MORTGAGE_AMOUNT_QUESTION);
			double aprRate = readDoubleFromUser(APR_QUESTION);
			double monthlyRepaymentFor20Years = calculateMonthlyRepayment(mortgageAmount,
																			MORTGAGE_DURATION_IN_YEARS, aprRate);
			System.out.printf("Assuming a 20 year term, the monthly repaymenys would be €"+ "%.2f \n",monthlyRepaymentFor20Years);
			double actualMonthlyRepayment = readDoubleFromUser(AFFORD_QUESTION);
			int monthsToRepayMortgage = calculateMonthsToRepayMortgage(mortgageAmount, actualMonthlyRepayment, aprRate);
			String yearsAndMonthsString = monthsToRepayMortgage/12 + " years and " + monthsToRepayMortgage%12 + " months.";
			System.out.printf("If you pay €" + "%.2f per month your mortgage would be paid off in " + 
															yearsAndMonthsString + "\n", actualMonthlyRepayment);
			System.out.print(CONTINUE_QUESTION);
			boolean answered = false;
			do 
			{
				if(input.hasNext("no"))
				{
					answered = true;
					finished = true;
					System.out.println(yearsAndMonthsString);
				}
				else if(input.hasNext("yes"))
				{
					answered = true;
					input.next();
				}
				else
				{
					System.out.print(CONTINUE_QUESTION);
					input.next();
				}
			}while(!answered);
		}while(!finished);
		input.close();

	}

	private static double readDoubleFromUser(String userPrompt) {
		Scanner input = new Scanner(System.in);
		double userInput = 0;
		boolean correctInput = false;
		while(!correctInput)
		{
			System.out.print(userPrompt);
			if(input.hasNextDouble())
			{
				userInput = input.nextDouble();
				if(userInput > 0 )
				{
					correctInput = true;
				}
			}
			else input.next();

		}
		return userInput;

	}

	private static double calculateMonthlyRepayment(double principal, double duration, double aprRate)
	{
		double monthlyRepayment = principal *(aprRate/MONTHS_IN_A_YEAR/100)/(1- Math.pow(1+aprRate/MONTHS_IN_A_YEAR/100, 
																							-duration*MONTHS_IN_A_YEAR));
		return monthlyRepayment;
	}

	private static int calculateMonthsToRepayMortgage(double mortgageAmount ,double monthlyRepayment, double aprRate)
	{
		double outstandingMortgage = mortgageAmount;
		double monthlyAprRate = aprRate/MONTHS_IN_A_YEAR;
		int numberOfMonths = 0;
		while(outstandingMortgage>0)
		{
			double monthlyInterest = outstandingMortgage *(monthlyAprRate/100);
			outstandingMortgage += monthlyInterest;
			outstandingMortgage -= monthlyRepayment;
			numberOfMonths++;
		}
		return numberOfMonths;
	}
}




