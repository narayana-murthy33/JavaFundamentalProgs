package com.loops;
import java.util.Scanner;

public class Tables {
	static Scanner sc=new Scanner(System.in);
 public static void main(String[] args) {
	 System.out.println("enter the starting value:");
	 int startingvalue=sc.nextInt();
	 System.out.println("enter the ending value:");
	 int endingvalue=sc.nextInt();
	 System.out.println("which table you want:");
	 int tablenumber=sc.nextInt();
	 
	 while(startingvalue<=endingvalue) {
		 System.out.println(tablenumber+"*"+startingvalue+"="+tablenumber*startingvalue);
		 startingvalue++;
	 }
 	
}
}
