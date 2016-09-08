import java.util.Scanner;


public class Leap {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%4==0)
		{
			System.out.println("leapyear");
		}
		else
		{
			System.out.println("not leapyear");
		}
	}

}
