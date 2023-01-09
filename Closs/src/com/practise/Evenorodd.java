package com.practise;
import java.util.Scanner;

public class Evenorodd {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		int number=sc.nextInt();
		
		if(number<=0) {
			System.out.println("enter valid number");
		}
		else if(number%2==0) {
			System.out.println("it is even number");
			
		}
		else {
			System.out.println("it is odd number");
		}
			

	}

}
