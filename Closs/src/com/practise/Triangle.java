package com.practise;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter angle a value:");
		int a=sc.nextInt();
		System.out.println("enter the angle b value:");
		int b=sc.nextInt();
		System.out.println("enter angle c value:");
		int c=sc.nextInt();
		int sum=a+b+c;
		if(sum==180) {
			System.out.println("triangle formaton is correct");
		}
		else {
			System.out.println("triangle formation is incorrect");
		}
				

	}

}
