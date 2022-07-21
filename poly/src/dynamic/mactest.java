package dynamic;

public class mactest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Macbook mac=new Macbook();
		mac.start();
		mac.stop();
		
		macbookpro mac1=new macbookpro();
		mac1.start();
		mac1.stop();
	}
	static void operatemac(Macbook mac) {
		mac.start();
		mac.stop();
	}

}
