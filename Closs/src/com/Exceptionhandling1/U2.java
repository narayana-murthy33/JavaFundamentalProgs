package com.Exceptionhandling1;

public class U2 extends Thread {
	U1 extravarible;
	@Override
	public void run() {
		int a=4;
		int b=5;
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				extravarible.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(a*b);
			
		}
	}

}
