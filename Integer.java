import java.util.Arrays;
import java.util.Scanner;
public class Integer {
public static void main(String[] args) {
			int digit,number;
				Scanner scanner = new Scanner(System.in);
				try {
					System.out.println("Enter the number of digits to be removed: ");
					digit = scanner.nextInt();
					System.out.println("Enter the number: ");
					number = scanner.nextInt();
					String string = "" + number;
					if (digit < string.length() && digit > 0) {
						char[] numberArray = string.toCharArray();
						Arrays.sort(numberArray);
						string = "";
						for (int i = 0; i < numberArray.length - digit; i++) {
							string += numberArray[i];
						}
						System.out.println(Integer.parseInt(string));
					} else {
						System.out.println("Invalid Please enter correct details");
					}
				} catch (Exception exception) {
					System.out.println(exception);

				}
				
			}

		}
	
