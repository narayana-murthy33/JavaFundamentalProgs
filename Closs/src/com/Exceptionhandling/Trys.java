package com.Exceptionhandling;
import java.util.*;

public class Trys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		try {
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		}
		catch(InputMismatchException e) {
			System.out.println(("please enter valid input"));
			
		}
		catch(Exception e) {
			System.out.println("enter correct input");
			
		}
		System.out.println("hello");

	}

}
