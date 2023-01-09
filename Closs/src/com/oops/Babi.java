package com.oops;

public class Babi extends Nani {
	int g=10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Babi.getNumber());
		int c=20+getNumber();
		System.out.println(c);
		n1();
		
		

	}
	public static void n1() {
		Babi u=new Babi();
		int c=u.g;
		System.out.println(c);
	}

}
