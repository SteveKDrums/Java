import java.util.Scanner;

public class Chapter2Ex3 {

	public static void main(String[] args) {
		// Read in number of bits
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of bits: ");
		double bits = input.nextDouble();
		
		// Calculate the number of bytes for bits
		double bytes = bits / 8;
		
		// Display result
		System.out.println(bits + " bits is " + bytes + " bytes ");

	}

}
