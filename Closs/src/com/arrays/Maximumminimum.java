package com.arrays;

public class Maximumminimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,5,4,9,7,8};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
		
		
	}
}