package com.loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting value:");
		int n=sc.nextInt();
		System.out.println("enter ending value:");
		int m=sc.nextInt();
		
		while(n<=m) {
			System.out.println("good morning");
			n++;
		}

	}

}
