package com.practise;
import java.util.Scanner;

public class Maximumnumber {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maximumnumberinthree();
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a+"this is the maximum value"+a);
		}
		else {
			System.out.println(b+"this is the maximum number"+b);
		}

	}
	public static void maximumnumberinthree() {
		System.out.println("enter c value");
		int c=sc.nextInt();
		System.out.println("enter d value");
		int d=sc.nextInt();
		System.out.println("eter e value");
		int e=sc.nextInt();
		
		if(c>=d && c>=e) {   
			System.out.println(c+"is the maximum between three");
		}
		else if(d>=c && d>=e) {
			System.out.println(d+"is maximum between three numbers");
		}
		
		else {
			System.out.println(e+"is maximum beteen three numbers");
		}
	}

}
