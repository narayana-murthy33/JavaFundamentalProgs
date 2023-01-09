package com.practise;
import java.util.Scanner;

public class Divisible {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=sc.nextInt();
		if(number%4==0 && number%100==0) {
			System.out.println(number+"is divisible by both"+4+ "and"+100);
		}
		else {
			System.out.println("it is not divisible by both4 and 100");
		}
	}

}
