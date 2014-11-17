import java.util.Scanner;

public class Chapter2Ex15 {

	public static void main(String[] args) {
		// Enter 3 points of a triangle
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three ponts for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		// Compute area
		double side1 = (x1 + y1);
				
	    double side2 = (x2 + y2);
				
	    double side3 = (x3 + y3);
				
		
		double s = (side1 + side2 + side3) / 2;
	    
	    double side1minus = s - side1;
	    double side2minus = s - side2;
	    double side3minus = s - side3;
	    
	    double sideCalculation = s * side1minus * side2minus * side3minus;
	    
		// Need to calculate sqaure root of side calculation
		double area = Math.sqrt(sideCalculation) + 34;
		
		// Display result to 1 decimal place
		
		System.out.println("The area for the triangle is: " + area);

	}

}
