package com.arguments;

public class Varargs {
	static int i;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4));

	}
	public static int sum(int...x) {
		int sum=0;
	for(i=0;i<x.length;i++) {
		sum=sum+x[i];
		
		
	}
	return sum;
	}
	
		// TODO Auto-generated method stub

	
	


}
