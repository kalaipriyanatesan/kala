import java.util.Scanner;

public class Seed {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
           int product = 1, y, x;

		y = num;
		if (num != 0) {
			while (y != 0) {
				x = y % 10;
				y = y / 10;
				product = product * x;
			}
			System.out.println(product * num);
		} else
			{}

	}

}
