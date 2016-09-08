import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alphabet {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the character you want to check:");
		char n = (char) bf.readLine().charAt(0);
		if (n >= 'a' && n <= 'z' && n >= 'A' || n <= 'Z') {

			System.out.println("The given character " + n + " is alphabet");

		} else {
			System.out.println("no alphabet");
		}
	}
}
