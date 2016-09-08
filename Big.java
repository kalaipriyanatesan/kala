import java.util.Scanner;


public class Big {

	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("Ais greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater");
		
		}
		else{
			System.out.println("c is greater");
		}
	}

}
