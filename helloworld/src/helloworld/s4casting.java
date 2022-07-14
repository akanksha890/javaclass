package helloworld;

public class s4casting {

	public static void main(String[] args) {
		int i=10;
		byte b=12;
		System.out.println(i);
		i=b;
		System.out.println(i);
		i=17;
		System.out.println(b);
		b=(byte)i;
		System.out.println(b);
	}
}
