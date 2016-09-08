import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Romenletter {

	
	public static void main(String[] args) throws IOException {
		BufferedReader str=new BufferedReader(new InputStreamReader(System.in));
	    char n=(char)str.readLine().charAt(0);	 
		int num;
		    switch(n){
		        case 'I':
		            num = 1;
		            System.out.println(num);
		            break;
		        case 'V':
		            num = 5;
		            System.out.println(num);
		            break;
		         case 'X':
		            num = 10;
		            System.out.println(num);
		            break;
		         case 'L':
		             num = 50;
		             System.out.println(num);
		             break;
		         case 'C':
		             num = 100;
		             System.out.println(num);
		             break;
		         case 'D':
		             num = 500;
		             System.out.println(num);
		             break;
		         case 'M':
		             num = 1000;
		             System.out.println(num);
		             break;
		         default:
		             num = 0;
		             System.out.println(num);
		             break;

	}

}
}
