package com.loops;
import java.util.Scanner;
public class Primenumber {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		
		int num=sc.nextInt();
	
		int factorcount=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
			  factorcount++;
				
			}
			
		}
		
    	if(factorcount==2) {
    		System.out.println("it is prime");
    	}
    	else {
    		System.out.println("it is not prime");
    	}
	}

}
