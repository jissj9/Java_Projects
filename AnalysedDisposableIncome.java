import java.util.Scanner;

public class AnalysedDisposableIncome {
	public static final int PERCENTAGE = 100;
	public static final double TAX_RATE = 0.35;
	public static final double AVERAGE_DISPOSABLE_INCOME = 500.00;
	public static final double FIFTY_PERCENT = 0.50;

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How much are you paid a month before tax? ");
		double payBeforeTax = input.nextDouble();
		System.out.print("How much do you pay in rent/mortgage a month? ");
		double rentOrMortgage = input.nextDouble();
		System.out.print("How much does your commute cost a month? ");
		double travelCosts = input.nextDouble();
		System.out.print("How much do you spend on food per month? ");
		double foodCosts= input.nextDouble();

		double tax = payBeforeTax * TAX_RATE;
		double payAfterTaxIncome = payBeforeTax - tax;
		double disposableIncome = payAfterTaxIncome - rentOrMortgage - travelCosts - foodCosts;
		double percentageOfSalary = Math.round(((disposableIncome/payBeforeTax)*PERCENTAGE));

		System.out.format("Your monthly disposable income is €"+ "%.2f", disposableIncome); 
		System.out.println(" which is " + percentageOfSalary + "% of your salary" );
		
		double fiftyPercentOfAverage =  AVERAGE_DISPOSABLE_INCOME * FIFTY_PERCENT;
		double muchMoreThanAverage = AVERAGE_DISPOSABLE_INCOME + fiftyPercentOfAverage;
		double muchLessThanAverage = AVERAGE_DISPOSABLE_INCOME - fiftyPercentOfAverage;
		
		if(disposableIncome > AVERAGE_DISPOSABLE_INCOME && disposableIncome < muchMoreThanAverage)
		{
			System.out.println("You have more than the average disposable per month.");
		}
		else if(disposableIncome >= muchMoreThanAverage)
		{
			System.out.println("You have much more than the average disposable per month.");
		}
		else if(disposableIncome == AVERAGE_DISPOSABLE_INCOME)
		{
			System.out.println("You have exactly the average disposable per month.");
		}
		else if(disposableIncome < AVERAGE_DISPOSABLE_INCOME && disposableIncome > muchLessThanAverage )
		{
			System.out.println("You have less than the average disposable per month.");
		}
		else if(disposableIncome <= muchLessThanAverage && disposableIncome > 0)
		{
			System.out.println("You have much less than the average disposable per month.");
		}
		else
		{
			System.out.println("You have no disposable income per month.");
		}
		
		
	}

}