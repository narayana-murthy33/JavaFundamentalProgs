package com.restaurent;
import java.util.Scanner;

public class Ifoelso {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter your number");
		int num=sc.nextInt();
		
		if(num==2) {
			num=3;
			System.out.println(num);
		}
		else {
			num=4;
			System.out.println(num);
		}
	}


}
