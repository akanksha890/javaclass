package helloworld;

public class s12prendpost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 3;
		int a = ++i;
		System.out.println("i=" + i);
		System.out.println("a=" + a);

		String x = null;
		if (x != null) {
			System.out.println("x has value");
		} else {
			System.out.println("x doesnt has value");
		}

		int c = 6;
		int b = 7;
		System.out.println("a<b or a<c= " + (a < b || ++a < c));
		System.out.println("a<b or a<c= " + (a < b | ++a < c));
	}
}
