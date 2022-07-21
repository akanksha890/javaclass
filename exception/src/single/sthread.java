package single;

public class sthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sthread st=new sthread();
		st.start();
		for(int j=1;j<=3;j++) {
			System.out.println("j: "+j+"\t");
		}
	}
	//@Override
	public void start() {
		for(int i=1;i<3;i++) {
			System.out.println("i: "+i+"\t");
		}
	}

}
