public class Reversenum {

	
	public static void main(String[] args) {
		int a=12345,b=0;
		while(a!=0)
		{
			b=b*10;
			b=b+a%10;
			a=a/10;
		}
		System.out.println(b);
	}


}
