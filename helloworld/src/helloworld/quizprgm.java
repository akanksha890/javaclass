package helloworld;

import java.util.Scanner;

public class quizprgm {

	public static void main(String[] args) {
		//varailbe
		int n;
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		while(true) {
		//asking question
		System.out.println("who is founder of blue origin");
		System.out.println("1.bill gates \n 2.jeff bezos \n3.exit");
		
		//asking value
		System.out.println("enter the choice");
		n = sc.nextInt();
		if (n == 2) {
			System.out.println("coorect");
		}else if(n==3){
			break;
		}
		else {
			System.out.println("incorrect");
		}
	}
	}
}
