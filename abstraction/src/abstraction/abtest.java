package abstraction;

public class abtest {
	public static void main(String args[]) {
		//System.out.println("common functionality");
	
		bmw3series th=new bmw3series();
		th.accelerate();
		th.cmnfunc();
		bmw5series fiv=new bmw5series();
		fiv.accelerate();
		fiv.cmnfunc();
	}

}
