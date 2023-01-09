package com.arrays;

public class Arrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,5,6,8,5,9};
		int temp=arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
