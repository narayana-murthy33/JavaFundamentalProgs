package com.multithreading;

public class Multithreading {
	public static void main(String[] args) {
		
			
		
			T1 t1=new T1();
			t1.start();
			
			T2 h=new T2();
			h.start();
			Multithreading.t2();

			

 			

     }
			
			

	
	static void t2() {
		int a=7;
		int b=8;
		for (int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getPriority());
			System.out.println(a+b);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}
	}
}
class T1 extends Thread {
	@override
	public void run() {
		int a=16;
		int b=8;
		for (int i=0;i<10;i++) {
			System.out.println(Thread.currentThread());
		
			System.out.println(a-b);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}
	
}
}
class T2 extends Thread{
	@override
	public void run() {
		int a=2;
		int b=4;
		for(int i=0;i<10;i++) {
			System.out.println(a+b);
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


	

		
	





	
