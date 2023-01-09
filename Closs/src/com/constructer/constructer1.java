package com.constructer;

public class constructer1 {
	int a;
	int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructer1 g=new constructer1(2,3);
		constructer1 g1=new  constructer1(4,5);
		System.out.println(g);
		System.out.println(g1);

	}
	 public constructer1(int c,int d) {
		 this.a=c;
		 this.b=d;
		 System.out.println(a);
		 System.out.println(b);
	 }

}
