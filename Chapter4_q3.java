
public class Chapter4_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables created
		int kilograms = 25 ;
		int grams = 1000;
		
		System.out.println("Kilograms     Grams" );

		// for loop to print out 1 -25 kg's and conversion to grams
		for (int i = 1; i <= kilograms; i++) {
			
			System.out.println(i + "             " + grams * i);
		}
		
	}

}
