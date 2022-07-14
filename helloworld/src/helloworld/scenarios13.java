package helloworld;

public class scenarios13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 15;
		boolean hasloan = false;

		boolean buyhouse = (age > 18) ? true : false;
		boolean renthouse = buyhouse ? (hasloan ? true : false) : false;

		System.out.println("age" + age);
		System.out.println("has laon= " + hasloan);
		System.out.println("buy house ? " + buyhouse);
		System.out.println("can rent a house? " + renthouse);

		String result = buyhouse ? (hasloan ? "has loan can buy house" : "no loan cant buy house") : "cannot buy house";
		System.out.println(result);
	}
}


