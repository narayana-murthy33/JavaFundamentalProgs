package com.datatypes;
import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		byte value1=sc.nextByte();
		System.out.println("this is the byte value"+value1);
		short value2=sc.nextShort();
		System.out.println("this is the short value");
		int value3=sc.nextInt();
		System.out.println("this is the int value"+value3);
		long value4=sc.nextLong();
		System.out.println("this is the long value"+value4);
		String name=sc.next();
		System.out.println("name"+name);
	    char name1=sc.next().charAt(0);
		System.out.println("character name"+name1);

	}

}
