package com.Exceptionhandling;
import java.util.Scanner;

public class Voter extends Exception{
	Voter(String msg){
		super(msg);
	}

	public static void main(String[] args) throws Voter {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		try {
		if(age<18) {
			throw new Voter("invalid time,please check");
		}
		

	}
		catch(Exception e) {
			System.out.println(e);
		}
		
			
		
			
		
		
		
		}
	}


