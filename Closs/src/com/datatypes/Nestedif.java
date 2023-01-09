package com.datatypes;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
        int a=sc.nextInt();
         if(a%2==0) {
        	 
			if(a%4==0) {
        		System.out.println("even number"+a); 
        	 }
         }
         else {
        	 System.out.println("odd number"+a);
         }
	}

}
