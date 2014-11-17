import java.util.Scanner;

public class Chapter2Ex21 {

	public static void main(String[] args) {
		// Enter investment amount
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		// Enter annual interest rate in percentage
		System.out.print("Enter annual interest rate in percentage format: ");
		double air = input.nextDouble();
				
		
		// Enter number of years
		System.out.print("Enter number of years: ");
		double years = input.nextDouble();
		
		// Calculate future investment value
		double monthlyInterestRate = air / 12;
		//double numberOfYears = Math.pow(years, 12);
		double futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate ), years));
		
		
		// Display results
		System.out.println("Accumulated value is €" + futureInvestmentValue);

	}

}
