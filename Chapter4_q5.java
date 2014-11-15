import java.util.Scanner;

public class Chapter4_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		String ans;
		
		do {	 
				 
			System.out.println("Enter a number: ");
			int n1 = input.nextInt();
			System.out.println("Enter another number: ");
			int n2 = input.nextInt();
			
			sum = n1 + n2;
			System.out.println("Their sum is: " + sum);
			System.out.println("Would you like to do this again? (Y/N)");
			ans = input.next();
		
			
			
		}while (ans.equals("y"));
		
		if (ans.equals("n")) {
			System.out.println("Thank you for using the program");
		}

	}

}
