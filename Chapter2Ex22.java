
public class Chapter2Ex22 {

	public static void main(String[] args) {
		// Get current time in GMT
		
		 long totalMilliSeconds = System.currentTimeMillis();
		 
		 // Total seconds / 1000
		 long totalSeconds = totalMilliSeconds / 1000;
		 
		 // Current Second % 60
		 long currentSecond = totalSeconds % 60;
		 
		 // Total minutes / 60
		 long totalMinutes = totalSeconds / 60;
		 
		 // Current minute % 60
		 long currentMinute = totalMinutes % 60;
		 
		 // Total hours / 60
		 long totalHours = totalMinutes / 60;
		 	 
		 // Current hour % 24
		 long currentHour = totalHours % 24;		 
		 
		 // Display results
		 		 
		 System.out.println("The time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
		

	}

}
