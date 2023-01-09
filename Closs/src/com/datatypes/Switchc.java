package com.datatypes;
import java.util.Scanner;

public class Switchc {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter your input");
		int num=sc.nextInt();
		switch(num) {
		
		case 1:{
			System.out.println("hello");
			break;
		}
		case 2:{
			System.out.println("hiiii");
			break;
		}
		case 3:{
			System.out.println("how");
			break;
		}
		default:{System.out.println(num);}
		}
	}

}
