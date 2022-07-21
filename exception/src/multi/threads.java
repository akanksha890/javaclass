package multi;

import single.sthread;

public class threads extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		threads mt=new threads();
		mt.start();
		
		for(int j=1;j<=3;j++) {
			System.out.print("j: "+j+"\t");
			threads.sleep(1000);
		}
	}
	//@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("i: "+i+"\t");
			try {
				threads.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	}


