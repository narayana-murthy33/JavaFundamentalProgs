package com.switchcalculator;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="narayana murthy sundaraneedi";
		String []names=name.split(" ");
		for(int i=names.length-1;i>=0;i--) {
		  System.out.print(names[i]+" ");
		}

	}

}
