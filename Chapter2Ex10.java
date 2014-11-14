import java.util.Scanner;
public class Chapter2Ex10 {

	public static void main(String[] args) {
		// Enter total sales of company
		Scanner input = new Scanner(System.in);
		System.out.print("Enter total sales: ");
		double totalSales = input.nextDouble();
		
		// Enter sales percentage for central zone
		System.out.print("Enter central zone sales percentage: ");
		double centralZonePercentage = input.nextDouble();
		
		// Calculate Central zone sales totalSales * centralZonePercentage
		double centralZoneSales = totalSales * centralZonePercentage;
					
		// Display output
		System.out.println("Cantral zone sales: " + centralZoneSales);

	}

}
