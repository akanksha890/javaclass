package helloworld;

public class s6string {
	public static void main(String[] args) {
		String s2 = new String("Something");

		// String literal
		String name = "Max Willam";

		// char array
		char[] c = { 'h', 'a', 'g' };
		String s3 = new String(c);

		// byte array
		byte[] b = { 65, 66, 67 };
		String s4 = new String(b);

		System.out.println("name" + name);
		System.out.println("length" + name.length());

		System.out.println(s3);
		System.out.println(s4);
	}

}
