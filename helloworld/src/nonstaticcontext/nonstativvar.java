package nonstaticcontext;

public class nonstativvar {
		
		int y = 10;
		
		// non-static variable
		// instance variable
		int num;
		
		static {
			System.out.println("Inside static block");
		}
		
		{
			System.out.println("Inside non static block");
		}
		
		nonstativvar(int x) {
			System.out.println("Inside the constructor");
			this.num = x;
		}
		
		public static void main(String[] args) {
			System.out.println("inside main method");
			
			nonstativvar nsvd1 = new nonstativvar(20);
			nsvd1.num = 7;
			
			nonstativvar nsvd2 = new nonstativvar(21);
			nonstativvar nsvd3 = new nonstativvar(22);
			
			System.out.println(nsvd1.num);
			System.out.println(nsvd1.y);
			
			System.out.println(nsvd2.num);
			System.out.println(nsvd2.y);
			
			System.out.println(nsvd3.num);
			System.out.println(nsvd3.y);
		}

	}

