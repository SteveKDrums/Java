import java.util.Scanner;

public class Chapter2Ex19 {

	public static void main(String[] args) {
		// Enter two points
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 ponts e.g x1 y1, x2 y2");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Calculate distance
		double calculation = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2); 
		double distance = Math.pow(calculation, 0.5);
		
		// Display result
		System.out.println("The distance between the two points is " + distance);

	}

}
