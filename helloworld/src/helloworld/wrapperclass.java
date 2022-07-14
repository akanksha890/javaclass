package helloworld;

public class wrapperclass {

	public static void main(String[] args) {
		//auto boxing from int to integer
		int y = 1;
		Integer x = 2;
		Integer z = new Integer(5);
		
		//auto boxing
		int myint = z; //automaticlly
		myint =z.intValue();  //convert explicitlt from wrapper to primitivw
		
		short b = 3276;
		Short newshort = b;
	}
}
