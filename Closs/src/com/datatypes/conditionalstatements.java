package com.datatypes;
 import java.util.Scanner;

public class conditionalstatements {
	static Scanner sc=new Scanner(System.in);
	 
	public static void main(String[]args) {
		System.out.println("your age is not enough:");
		int age=sc.nextInt();
		
		if (age>18) {
			System.out.println("hey please vote");
		}
		else {
			System.out.println("your age is not enough");
		}
	}

}
