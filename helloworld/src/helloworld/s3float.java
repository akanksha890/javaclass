package helloworld;

public class s3float {

	public static void main(String[] args) {
		
		System.out.println("min float value" + Float.MIN_VALUE);
		System.out.println("max float value" + Float.MAX_VALUE);
		
		int val=5;
		
		float val2 = 5.23f;
		
		double val3 = 2.45;
		
		val=6;
		val2=6f;
		val3=6d;
		System.out.println(val);
		System.out.println(val2);
		System.out.println(val3);
		
		int intval =7/2;
		System.out.println(intval);
		float flval = 7f/2f;
		System.out.println(flval);
		
		double dval=7.0/2.0;
		System.out.println(dval);
		
		System.out.println("intval:"+intval+" float value:"+flval);
}
}