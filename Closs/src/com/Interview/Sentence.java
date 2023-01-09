package com.Interview;
import java.util.*;

public class Sentence {
	public static void sentence(String name,int number) {
		String[]name1=name.split(" ");
		for(int i=0;i<number;i++) {
			System.out.print(name1[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter name");
		String name=sc.nextLine();
		System.out.println("please enter number");
		int number=sc.nextInt();
		Sentence.sentence(name, number);

	}

}
