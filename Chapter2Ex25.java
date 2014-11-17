import java.util.Scanner;

public class Chapter2Ex25 {

	public static void main(String[] args) {
		// Enter employees name
		Scanner input = new Scanner (System.in);
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		// Enter number of hours worked in a week
		System.out.print("Enter hours worked this week: ");
		double hours = input.nextDouble();
		
		// Enter hourly pay rate
		System.out.print("Enter your hourly pay rate: ");
		double pay = input.nextDouble();
		
		// Enter federal tax withholding rate
		System.out.print("Enter federal tax withholding rate: ");
		double fRate = input.nextDouble();
		
		// Enter state tax withholding rate
		System.out.print("Enter state tax withholding rate: ");
		double sRate = input.nextDouble();
					
		// Calculate deductions
			
		  /*Calculate Gross pay = Hourly rate * hours
		   *Federal withholding = Gross pay * Federal withholding percentage
		   *State withholding = Gross pay * State withholding percentage
		   *Total deduction = FW + SW 
		   *Federal percent display = fRate * 100
		   *State percent display = sRate * 100
		   */
		
		double grossPay = pay * hours;
		double federalTax = grossPay * fRate;
		double stateTax = grossPay * sRate;
		double totalDeduction = federalTax + stateTax; 
		double federalPercentDisplay = fRate * 100;
		double statePercentDisplay = sRate * 100;
					
		// Calculate net pay = Gross - Total deduction
		double netPay = grossPay - totalDeduction;
		
		
		
		// Display output
		System.out.println("\n\n\nEmployee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: €" + pay);
		System.out.println("Gross Pay: €" + grossPay);
		System.out.println("Deductions: ");
		System.out.print(  "Federal Withholding (" + federalPercentDisplay + "%):  ");
		System.out.printf("€" + "%.2f\n" , federalTax);
		System.out.print(  "State Withholding (" + statePercentDisplay + "%):  ");
		System.out.print("€");
		System.out.printf("%.2f\n" , stateTax);
		System.out.printf(  "Total Deduction: " + "€" + "%.2f\n" , totalDeduction);
		System.out.printf("Net Pay: " + "€" + "%.2f", netPay);
		

	}

}
