import java.util.Scanner;

public class Chapter4_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a non zero positive integer:");
		int n2 = input.nextInt();

		int sum = 0; // Loop to find the sum of 1 to a given number by the user.
		for (int i = 1; i <= n2; i++) {
			sum += i;
			System.out.println(sum);
		}
		System.out.println(sum);

	}

}
