import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/* 
 * Take filename from user. Use JOptionPane
 * Search for numbers in file using Double.parseDouble()
 * Read through file. Use Scanner Object
 * Return all numbers and the word on either side.
 * Separate each number on a new line "\n"
 */

public class NumberSearch {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String tokens = "";

		// Take filename from user. Use JOptionPane
		String fileToRead;
		fileToRead = JOptionPane.showInputDialog(null, "What file would you like to read?");

		// Display to user what is happening
		JOptionPane.showMessageDialog(null, "Searching for numbers in the file: " + fileToRead);

		// Read through file. Use Scanner Object
		Scanner file = new Scanner(new File(fileToRead));

		// Create String to print in JOption Pane
		StringBuilder sb = new StringBuilder();
		List<String> temps = new ArrayList<String>();

		// Search through for each occurrence of a word
		while (file.hasNext()) {

			tokens = file.next();
			temps.add(tokens);

			for (int i = 0; i < temps.size(); i++) {
				// Try block to test each String with Double.parse(Double)
				double parse;
				try {

					parse = Double.parseDouble(tokens);

					// Creating variables for word before and after
					String beforeWord = "";
					String afterWord = "";

					// if -- else if -- else conditional statements for word
					// before and after
					if (i == parse) {
						afterWord = temps.get(i + 1);

					}

					else if (i == temps.size()) {
						beforeWord = temps.get(i - 1);

					} else {
						afterWord = temps.get(i + 1);
						beforeWord = temps.get(i);
					}

					// Append results to Stringbuilder
					sb.append(beforeWord + " " + parse + " " + afterWord + "\n");

					break;
				}

				catch (NumberFormatException e) {
					// not a double
				}

			}
		}

		// Print StringBuilder sb contents with JOptionPane

		JOptionPane.showMessageDialog(null, sb);

		// Exit JOptionPane pop up box
		System.exit(0);
		file.close();

	}

}
