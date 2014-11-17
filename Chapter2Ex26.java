import javax.swing.JOptionPane;


public class Chapter2Ex26 {

	public static void main(String[] args) {
		// Read an int between 100 and 999
				//Scanner input = new Scanner(System.in);
				String intValueString = JOptionPane.showInputDialog("Enter an integer between 100 and 255: ");
				
				int intValue = Integer.parseInt(intValueString);
				
				// Reverse the number using % & /
				int number1Number2 = intValue / 10;
				int number1 = number1Number2 / 10;
				int number2 = number1Number2 / 5;
				int number3 = intValue % 10;
				
				// Display result
				//System.out.println("The reverse of " + intValue + " is " + number3 + number2 + number1);
				
				String output = ("The reverse of " + intValue + " is " + number3 + number2 + number1);
						JOptionPane.showMessageDialog(null, output);


	}

}
