package exhandling;

public class multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String input=args[0];
			System.out.println("input: "+input);
			int op=Integer.parseInt(input);
			System.out.println("output: "+op);
		}catch(RuntimeException e) {
			System.out.println("Exception occured");
		}
		System.out.println("prgm continues...");
		
	}

}
