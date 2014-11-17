import java.util.Scanner;

public class Chapter2Ex20 {

	public static void main(String[] args) {
		// Enter balance and interest rate
		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance and interest rate:");
		double balance = input.nextDouble();
		double apiRate = input.nextDouble();
		
		
		// Calculate interest rate for the next month
		double interestForNextMonth = balance * (apiRate / 1200);
		
		
		// Display result
		System.out.printf("The interest is: " + "%.5f", interestForNextMonth);

	}

}
