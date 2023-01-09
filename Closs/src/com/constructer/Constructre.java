package com.constructer;

public class Constructre {
    int a;
    int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructre ct= new Constructre(20,30);
		System.out.println(ct);
		ct.m2();

	}
	  Constructre(int c, int d){
		  this.a=c;
		  this.b=d;
		  int g=a+b;
		  System.out.println(g);
		  
	  }
	  void m2() {
		  
		  System.out.println(a);
	  }

}
