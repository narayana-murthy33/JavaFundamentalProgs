package com.loops;
import java.util.Scanner;

public class Sumofnumber {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		
		int number=sc.nextInt();
		int sumofdigits=0;
		do {
			sumofdigits=sumofdigits+number%10;
			number=number/10;
		}while(number>0);
		
		System.out.println(sumofdigits);

	}

}
