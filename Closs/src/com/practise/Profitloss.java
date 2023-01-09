package com.practise;
import java.util.Scanner;

public class Profitloss {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter cost price:");
		int costprice=sc.nextInt();
		System.out.println("enter selling price:");
		int sellingprice=sc.nextInt();
		if(costprice<sellingprice) {
			System.out.println("he got profit");
		}
		else if (costprice==sellingprice) {
			System.out.println("he does not get loss and profit");
		}
		else {
			System.out.println("he got loss");
		}

	}

}
