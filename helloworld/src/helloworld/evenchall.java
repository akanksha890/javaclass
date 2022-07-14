package helloworld;

public class evenchall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		for (int i = 22; i <= 98; i++) {
//			if(i%2==0) {
//			System.out.println("even numbers " + i);
//		}
//	}
		
		//find sum of all number divided by 3 and 5 between 1 to 100
		int sum=0,count=0;
		for(int i=1;i<=100;i++) {
			if((i%3==0)&&(i%5==0)) {
				sum+=i;
				count++;
			}
			if(count==5) {
				break;
			}
		}
	System.out.println("sum of numbers"+sum);
	System.out.println("count of numbers"+count);

	}
}
