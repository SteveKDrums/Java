import java.util.Scanner;

public class Chapter2Ex11 {

	public static void main(String[] args) {
		// Enter full marks
		Scanner input = new Scanner (System.in);
		System.out.print("Enter full marks: ");
		double fullMarks = input.nextDouble();
		
		// Enter marks obtained
		System.out.print("Enter marks obtained: ");
		double marksObtained = input.nextDouble();
		
		// Calculate percentage of marks
		double percentageObtained = (marksObtained / fullMarks) * 100;
				
		// Display output
		System.out.println(marksObtained + " out of " + fullMarks + " means " + percentageObtained);

	}

}
