import javax.swing.JOptionPane;


public class Chapter2Ex27 {

	public static void main(String[] args) {
		// public static void main(String[] args) {
		// Enter principle amount
		//Scanner input = new Scanner(System.in);
		//System.out.print("Please enter principle amount: ");
		String principleString = JOptionPane.showInputDialog("Please enter principle amount: ");
		
		double principle = Double.parseDouble(principleString);
		
		// Enter rate of interest
		//System.out.print("Please enter interest rate: ");
		String interestRateString = JOptionPane.showInputDialog("Please enter interest rate: ");
		
		double interestRate = Double.parseDouble(interestRateString);
		
		// Enter time duration
		//System.out.println("Please enter time duration: ");
		String timeString = JOptionPane.showInputDialog("Please enter time duration: ");
		
		double time = Double.parseDouble(timeString);
		
		// Compute interest with following formula
		// simpleInterest = (principalAmount x rate x time) / 100
		
		double simpleInterest = (principle * interestRate * time ) / 100;
		
		// Display results
		String output = ("The simple interest is: " + simpleInterest);
		JOptionPane.showMessageDialog(null, output);


	}

}
