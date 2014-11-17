import java.util.Scanner;

public class Chapter2Ex13 {

	public static void main(String[] args) {
		// Enter amount
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly savings amount: ");
		double savingsAmount = input.nextDouble();
		double monthlyInterestRate = 0.05 / 12;
		
		// Calculate amount , more efficient to use loop
		
		double month1Value = savingsAmount * (1 + monthlyInterestRate);
				
		double month2Value = (100 + month1Value) * (1 + monthlyInterestRate);
				
		double month3Value = (100 + month2Value) * (1 + monthlyInterestRate);
				
		double month4Value = (100 + month3Value) * (1 + monthlyInterestRate);
				
		double month5Value = (100 + month4Value) * (1 + monthlyInterestRate);
				
		float month6Value =(float) ((100 + month5Value) * (1 + monthlyInterestRate));
		
		// Display result
		
		System.out.printf("After the sxth month the account value is: " + "%.2f" , month6Value);
		

	}

}
