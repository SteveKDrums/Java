import java.util.Scanner;

public class Chapter2Ex17 {

	public static void main(String[] args) {
		// Enter temperature in fahrenheit
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in fahrenheit between -58 and 41: ");
		double fahrenheit = input.nextDouble();
		
		// Enter wind speed in mph
		System.out.print("Enter the speed in mph <= 2: ");
		double mph = input.nextDouble();
		
		
		// Calculate wind chill
		double windChill = (35.74 + fahrenheit) - (Math.pow(mph, 0.16) + Math.pow(fahrenheit, 0.16));
					
		// Display results
		System.out.println("The wind chill index is: " + windChill);

	}

}
