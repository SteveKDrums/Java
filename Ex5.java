import java.util.Scanner;

public class Chapter2Ex5 {

	public static void main(String[] args) {
		// Read subtotal and gratuity rate
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subTotal = input.nextDouble();
		double gratuity = input.nextDouble();
		
		// Calculate gratuity rate and total
		
		double percent = gratuity / 10;
		
		double total = percent + subTotal;
		
		// Display results
		System.out.println("The gratuity is $" + percent + " the total is $" + total);

	}

}
