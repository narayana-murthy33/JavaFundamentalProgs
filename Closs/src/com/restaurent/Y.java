package com.restaurent;
import java.util.Scanner;

public class Y {
	static int a=20;
	int d=30;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello();
		Scanner sc=new Scanner(System.in);
		int e=sc.nextInt();
		Y u=new Y();
		
		int b=30;
		int c=a+b;
		System.out.println(c);
		
		System.out.println(a);
		System.out.println(u.d);

	}
	public static void hello() {
		Y v= new Y();
		System.out.println(v.d);
		v.d=340;
		System.out.println(v.d);
	}

}
