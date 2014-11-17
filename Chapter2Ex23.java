import java.util.Scanner;

public class Chapter2Ex23 {

	public static void main(String[] args) {
		// Enter an ASCII code within the range of 97 - 122
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code within the range of 97 - 122: ");
		int ascii = input.nextInt();
		char ch1 = (char) ascii;
		
		// Work out capital equivalent
		char capital = (char) (ch1 - 32);
		
		
		// Display result
		System.out.println("The lower case character is " + ch1 + " and the equivalent upper case is " + capital);
		
		

	}

}
