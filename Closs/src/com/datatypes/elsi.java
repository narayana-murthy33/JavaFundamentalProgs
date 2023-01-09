package com.datatypes;

import java.util.Scanner;
public class elsi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to bvc engineering  college");
		System.out.println("enter student name:");
		String studentname=sc.next();
		System.out.println("enter student marks");
		int studentmarks = sc.nextInt();
		char result='F';
		
		 if(studentmarks >= 80 &&studentmarks <= 100  ) {
		 result='A';
		 System.out.println(studentname+ "  got this grade:"+result);
		 }
		 else if (studentmarks>=60 && studentmarks<80) {
			 result='B';
			 System.out.println(studentname+"got this marks"+result);
		 }
		 else if(studentmarks>=40 && studentmarks<60) {
			 result='c';
			 System.out.println(studentname+"got this grade");
		 }
		 else {
			 System.out.println(studentname+"student fail /abesnt for exam");
		 }
		
	}

}
