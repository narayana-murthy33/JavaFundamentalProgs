package com.arrays;

public class Minimumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {12,5,6,4,9,7,8};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);
		

	}

}
