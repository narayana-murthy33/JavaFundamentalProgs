package com.arguments;
import java.util.Scanner;

public class Methodarguments {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumoftwo(10,20));
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println(sumoftwoo(c,d));
		

	}
	static int sumoftwo(int a,int b) {
		return a+b;
		
	}
	static int sumoftwoo(int c,int d) {
		return c*d;
		
	}

}
