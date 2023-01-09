package com.nani;

public class Nonstaticmethod {
	public void glass() {
		int a=20;
		int b=40;
		int c=a+b;
		System.out.println(c);
		System.out.println("glass clor is white");
	}
	public static void main(String[]args) {
		Nonstaticmethod color=new Nonstaticmethod();
		color.glass();
	}

}
