package com.practise;
import java.util.Scanner;
public class Mprog {
	static Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter m value:");
		int m=sc.nextInt();
		int n=0;
		if(m>0) {
			n=1;
			System.out.println("the value of n is"+n);
		}
		else if(m==0) {
		n=0;
		System.out.println("value of n is"+n);
		}
		else if(m<0) {
			n=-1;
			System.out.println("the value of n is"+n);
		}

	}

}
