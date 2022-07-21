package poly;

public class compiletyppoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		compiletyppoly obj= new compiletyppoly();
		obj.add(2,4);
		obj.add(3,4,5);
	}
	void add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}

}
