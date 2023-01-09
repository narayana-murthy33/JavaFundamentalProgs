package com.Exceptionhandling1;

public class U1 extends Thread{
 U2 supportvarible;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		System.out.println(a*b);
		

	}

}
}
