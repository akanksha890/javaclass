package helloworld;

public class s11condintion {
	public static void main(String[] args) {
		boolean isAlien = false;

		if (isAlien) {
			System.out.println("Its an alien");
		}
		if (!isAlien) {
			System.out.println("Its not an alien");
		}

		String name = "joey";
		if (name == "joey") {
			System.out.println("correct name");
		}

		boolean x = true;
		boolean y = false;
		if (x && y) {
			System.out.println("both are true");
		} else if (x) {
			System.out.println("only x is ture");
		} else {
			System.out.println("only y is true");
		}

		int a = 10;
		int b = 5;
		int c = 20;

		System.out.println("a<b=" + (a < b));
		System.out.println("a<b and a<c=  " + (a < b && a < c));
		System.out.println("a<b and a<c=  " + (a < b & a < c));

		System.out.println("a<b and a<c= " + (a < b && ++a < c));
		System.out.println("A after logical ans = " + a);
		System.out.println("a<b and a<c=" + (a < b & a < c));

		System.out.println("A after bitwise ans = " + a);

		// == cpmparison
		// = assignment
		boolean mybool = false;
		if (mybool = false) {
			System.out.println("x");
		} else {
			System.out.println("y");
		}

		System.out.println("whats the value?" + (mybool = false));
	}

}
