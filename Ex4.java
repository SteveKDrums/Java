import java.util.Scanner;

public class Chapter2Ex4 {

	public static void main(String[] args) {
		// User enters 2 numbers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();
		
		// Multiply numbers
		int computation = firstNumber * secondNumber;
		
		// Display result
		System.out.println(firstNumber + " * " + secondNumber + " is " + computation);

	}

}
