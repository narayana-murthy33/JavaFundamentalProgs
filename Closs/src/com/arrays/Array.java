package com.arrays;
import java.util.Scanner;

public class Array {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]names= {"ganesh","rajesh","subash","chanti"};
        System.out.println(names[1]);
        arrays();
        sumofnumbers();
        Array uk=new Array();
        uk.arrais();
        foreach();
	}
	public static void arrays() {
		int i;
		int[]a=new int [4];
		for(i=0;i<a.length;i++) {
			System.out.println("enter the "+i+"value");
			a[i]=sc.nextInt();
			
		}
		System.out.println(a[2]);
		
		
		
	}
	private static void sumofnumbers() {
		// TODO Auto-generated method stub
		int i;
		int sum=0;
		int[]b= {34,67,89,79,44};
		for(i=0;i<b.length;i++) {
			sum=sum+b[i];
		}
		
		System.out.println("sumofnumbers"+sum);
		
		
	}
	public void arrais() {
		String[]c = {"naniganesh","raju","krishna","venkat","naresh"};
		int i;
		for(i=0;i<c.length;i++) {
			System.out.println(c[i]);
			
		}
		
	}
	public static void foreach() {
		int []d= {2,4,6,7,8,9};
		for(int temp : d) {
			System.out.println(temp);
		}
	}

}
