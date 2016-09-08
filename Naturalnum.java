import java.util.Scanner;

public class Naturalnum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = 0;
	
			r = n * (n + 1) / 2;
	
		System.out.println(r);
	}

}
