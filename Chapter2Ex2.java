import java.util.Scanner;

public class Chapter2Ex2 {

	public static void main(String[] args) {
		// Read in length and breadth of rectangle
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of rectangle: ");
		double lengthOfRectangle = input.nextDouble();
		
		System.out.print("Enter breadth of rectangle: ");
		double breadthOfRectangle = input.nextDouble();
		
		// Compute area
		double area = lengthOfRectangle * breadthOfRectangle;
		
		// Compute perimeter
		double perimeter = 2 * (lengthOfRectangle + breadthOfRectangle);
				
		// Display result
		System.out.println("The area of the rectangle is " + area +  "\nThe volume of the rectangle is  " + perimeter);
		
		
		
		
		
		

	}

}
