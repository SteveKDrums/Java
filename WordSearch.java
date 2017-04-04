import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/* 
 * Take filename from user. Use JOptionPane
 * Ask the user for a word to search for.
 * Read through file. Use Scanner Object
 * Return every occurrence of that word and the word on either side.
 * Separate each occurrence on a new line "\n"
 */
public class WordSearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String tokens = "";

		// Take filename from user. Use JOptionPane
		String fileToRead;
		fileToRead = JOptionPane.showInputDialog(null, "What file would you like to read?");

		// Ask the user for a word to search for.
		String word;
		word = JOptionPane.showInputDialog(null, "What word would you like to search for?");

		// Display to user what is happening
		JOptionPane.showMessageDialog(null,
				"Reading through the file: " + fileToRead + ": and searching for the word: " + word);

		// Read through file. Use Scanner Object
		Scanner file = new Scanner(new File(fileToRead));

		// Create String to print in JOption Pane
		StringBuilder sb = new StringBuilder();
		List<String> temps = new ArrayList<String>();

		// Search through for each occurrence of a word
		while (file.hasNext()) {
			tokens = file.next();
			temps.add(tokens);

		}

		// Loop through array list
		for (int i = 0; i < temps.size(); i++) {
			// If word element i is equal to chosen word create String Variables
			// for before and after word.
			// Variables filled with array element -1 and + 1 accordingly.
			if (temps.get(i).equals(word)) {
				String beforeWord = temps.get(i - 1);
				String afterWord = temps.get(i + 1);

				// Add the above to the StringBuilder for display
				sb.append(beforeWord + " " + word + " " + afterWord + "\n");
			}

		}

		// Print StringBuilder sb contents with JOptionPane
		JOptionPane.showMessageDialog(null, sb);

		// Exit JOptionPane pop up box
		System.exit(0);

		// Close file
		file.close();

	}

}
