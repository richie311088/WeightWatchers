

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class readFile {
	private static final String FILENAME = "./src/Dictionary.txt";

	public static void main(String[] args) {
		try {
			checkIfFileExists(FILENAME);
			printWords(FILENAME);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void checkIfFileExists(String filename) throws FileNotFoundException {

		File f = new File(filename);
		if (!f.exists()) {
			throw new FileNotFoundException();
		}

	}

	public static void printWords(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));

		String activeline;

		while ((activeline = br.readLine()) != null) {
			String[] words = activeline.split(" – ");
			String word = words[0];
			System.out.println(word);
			String[] meanings = words[1].split(", ");
			for (String meaning : meanings) {
				System.out.println(meaning);
			}
		}
		
		br.close();

}
}