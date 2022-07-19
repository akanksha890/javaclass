package staticcontext;

public class bankacc {

	// TODO Auto-generated method stub

	int accno;
	int blnctot;
	static String bankname = "SBI";
	static double interesRate = 7.2;

	public bankacc(int accnum, int tot) {
		this.accno = accnum;
		this.blnctot = tot;
	}

	public void printAcc() {
		System.out.println("welcome to " + bankacc.bankname);
		System.out.println("current loan interest  " + bankacc.interesRate);
		System.out.println("Account number:  " + this.accno);
		System.out.println("Account blnc:  " + this.blnctot);

	}

}
