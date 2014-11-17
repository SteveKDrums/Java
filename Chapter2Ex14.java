import java.util.Scanner;

public class Chapter2Ex14 {

	public static void main(String[] args) {
		// Enter weight in pounds
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your weight in pounds: ");
		double weight = input.nextDouble(); 
		final double onePoundInKg = 0.45359237;
		
		// Enter height in inches
		System.out.print("Enter your height in inches: ");
		double height = input.nextDouble();
		final double oneInchInMeters = 0.0254;

		
		// Calculate BMI
		double kg = weight * onePoundInKg;
		double meters = height * oneInchInMeters;
		
		double bmi = kg / (Math.pow(meters, 2));
				
		// Display result
		System.out.printf("BMI is " + "%.4f", bmi);
		

	}

}
