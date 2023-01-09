package com.java8features;

public class Lambdademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()-> {
			for(int i=0;i<10;i++)
		System.out.println("hii how are you");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}};
		
		
		
		Runnable h=()-> {
			for(int i=0;i<10;i++)
		System.out.println("hii how are you swathi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}};
			Thread y=new Thread(h);
			y.start();
			Thread t=new Thread(r);
			t.start();
		
		
		

		
		
		
		}
	}

	

