package nonstaticcontext;
import staticcontext.bankacc;

public class defaultconsttest {

		// TODO Auto-generated method stub
			
			public static void main(String[] args) {
				
				bankacc account1 = new bankacc(1001, 5000);
				
				bankacc account2 = new bankacc(1002, 6500);
				
				account1.printAcc();
				account2.printAcc();
					
			}		
	}


