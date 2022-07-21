package exhandling;
import java.util.Scanner;

public class dividebyzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,d;
		System.out.println("Enter two integers: ");
		try {
			Scanner scanner=new Scanner(System.in);
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a/b;
		d=b/a;
		System.out.println(c);
		System.out.println(d);
		}catch(ArithmeticException e) {
			System.out.println("dividion error");
		}
		System.out.println("Program continues");
		
		}

}
