import java.util.Scanner;

public class Chapter2Ex8 {

	public static void main(String[] args) {
		// Read in First, middle and last names
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter middle name: ");
		String middleName = input.nextLine();
				
		System.out.print("Enter last name: ");
		String lastName = input.nextLine();
		
		// Display input
		
		System.out.println("The name you entered is " + firstName + "\t" + middleName + "\t" + lastName);
		
		
		
	}

}
