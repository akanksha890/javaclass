package helloworld;

public class s13ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 18;
		boolean haslicense = true;

		boolean candrive = (age > 18) ? true : false;
		boolean canrentacar = candrive ? (haslicense ? true : false) : false;

		System.out.println("age" + age);
		System.out.println("has license= " + haslicense);
		System.out.println("can drive?" + candrive);
		System.out.println("can rent a car? " + canrentacar);

		String result = candrive ? (haslicense ? "has license can drive" : "no license cant drive") : "cannot drive";
		System.out.println(result);
	}

}
