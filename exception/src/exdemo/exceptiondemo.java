package exdemo;

public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exceptiondemo obj=new exceptiondemo();
		try {
			int withDrawamt = 5000;
			System.out.println("withdrawing: "+withDrawamt);
			obj.withDrawFromATM(withDrawamt,4532);
			System.out.println("amt withdraw");
	}catch(RuntimeException ex) {
		System.out.println("Exception occured "+ex.getMessage());
		
	}

}


void withDrawFromATM(int withDrawamt,int accno){
	int blnc=getblnc(accno);
	if(withDrawamt>blnc) {
		throw new RuntimeException("division by zero");
	}
}
int getblnc(int accno) {
	return 1000;
}

}