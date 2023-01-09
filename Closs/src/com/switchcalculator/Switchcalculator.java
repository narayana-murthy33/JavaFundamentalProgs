package com.switchcalculator;

import java.util.Scanner;


public class Switchcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
			System.out.println("selectoptions:"
					           +'\r'+"1.addition"
					           +'\r'+"2.subraction"
					           +'\r'+"3.multplication"
					           +'\r'+"4.division"
					           +'\r'+"5.modulus"
					           +'r'+"6.exit");
			System.out.println("enter the option:");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter  a value");
				int a=sc.nextInt();
				System.out.println("enter the b vALUE");
				int b=sc.nextInt();
				System.out.println("addition of two numbers"+(a+b));
				break;
			case 2:
				System.out.println("enter c value");
				int c=sc.nextInt();
				System.out.println("enter d value");
				int d=sc.nextInt();
				System.out.println("subraction of two numbere"+(c-d));
				break;
			case 3:
				System.out.println("enter e value");
				int e=sc.nextInt();
				System.out.println("enter f value");
				int f=sc.nextInt();
				System.out.println("multiplication of two numbers"+e*f);
				break;
			case 4:
				System.out.println("enter g value");
				int g=sc.nextInt();
				System.out.println("enter h value");
				int h=sc.nextInt();
				System.out.println("division of two numbers"+g/h);
				break;
			case 5:
				System.out.println("enter i value");
				int i=sc.nextInt();
				System.out.println("enter j value");
				int j=sc.nextInt();
				System.out.println("modula of two numbers"+i%j);
				break;
			case 6:
				System.out.println("exit");
				break;
			default:
				System.out.println("invalid");
				
			}
		
		
      
	}

}
