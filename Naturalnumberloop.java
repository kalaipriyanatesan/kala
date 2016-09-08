import java.util.Scanner;


public class Naturalnumberloop {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=0;
		for(int i=1;i<=n;i++)
		{
		r= n*(n+1)/2;
		}
	System.out.println(r);
	}

}
