import java.util.Scanner;

public class Chapter2Ex9 {

	public static void main(String[] args) {
		// Enter principle amount
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter principle amount: ");
		double principle = input.nextDouble();
		
		// Enter rate of interest
		System.out.print("Please enter interest rate: ");
		double interestRate = input.nextDouble();
		
		// Enter time duration
		System.out.println("Please enter time duration: ");
		double time = input.nextDouble();
		
		// Compute interest with following formula
		// simpleInterest = (principalAmount x rate x time) / 100
		
		double simpleInterest = (principle * interestRate * time ) / 100;
		
		// Display results
		System.out.println("The simple interest is: " + simpleInterest);

	}

}
