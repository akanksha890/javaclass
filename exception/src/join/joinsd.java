package join;
import java.util.Scanner;

public class joinsd extends Thread {

	private static int n,sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("sum of first n number ");
		System.out.println("enter a value");
		Scanner sc =new Scanner(System.in);
		joinsd.n=sc.nextInt();
		
		joinsd jd=new joinsd();
		jd.start();
		
		try {
			jd.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sum of first "+ joinsd.n+"numbers= "+joinsd.sum);
	}	
		//@Override
		public void run()
		{
			for (int i=0;i<joinsd.n;i++) {
				joinsd.sum+=i;
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

