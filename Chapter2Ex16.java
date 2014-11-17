import java.util.Scanner;

public class Chapter2Ex16 {

	public static void main(String[] args) {
		// Enter retail price of pen
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter retail price of pen: ");
		double retailPrice = input.nextDouble();
		
		// Calculate the profit 30%
		final double percent = 0.3;
		double profit = retailPrice * percent;
		
		//Display the amount of profit
		System.out.println("Amount of profit $" + profit);
		
		

	}

}
