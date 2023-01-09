package com.datatypes;

import java.util.Scanner;

public class Calculator {
  static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the two values");
		int a=sc.nextInt();
		 int b=sc.nextInt();
		 System.out.println("the sum of two numbers is"+a+b);
		 System.out.println("multiplication of two numbers"+  a*b);
		 System.out.println("division of two numbers"+a/b);
		 System.out.println("remainder of two numbers"+a%b);
		 System.out.println(a-b);
		
		

	}

}
