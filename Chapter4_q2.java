import java.util.Scanner;

public class Chapter4_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// New Scanner object input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int product = 0;

		// do while loop to ask user for a number while the product variable is
		// less than 100.
		do {
			System.out.println("Please enter a number: ");
			int num = input.nextInt();
			product = num * 10;

		} while (product < 100);

		System.out.println(product);

	}

}
