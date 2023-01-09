package com.loops;
import java.util.Scanner;
public class Reverseanumber {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		int num=sc.nextInt();
		int temp=num;
		int reverse=0;
		for(;num>0;num=num/10) {
		
			reverse=reverse*10+num%10;
		}	
		
		System.out.println(reverse);
		
			
		if(reverse==temp) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
        
	}

}
