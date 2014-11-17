import java.util.Scanner;

public class Chapter2Ex12 {

	public static void main(String[] args) {
		// Enter speed and acceleration
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
								
		// Compute Speed and acceleration
		double length = (Math.pow(speed, 2)) / (2 * acceleration);
		
		// Display output
		System.out.println("The minimum runway length for this plane is: " + length);

	}

}
