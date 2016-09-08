import java.util.Scanner;


public class palindrome {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	int rem=0,sum=0;
	int temp=n;
	while(n!=0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			
		}
	if(temp==sum)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	}

}
