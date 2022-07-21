package capsul;

public class bnkaccc {

	private String accname;
	private int accno;
	private int blnc;
	
	public void setaccname(String name) {
		this.accname=name;
	}
	public void setaccno(int num) {
		this.accno=num;
	}
	public void setbln(int tblnc) {
		this.blnc=tblnc;
	}
	
	void show() {
		System.out.println("accname: "+accname+" accno: "+accno+" bln: "+blnc);
	}
}
