package com.arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {6,2,7,8,9,5};
		System.out.println("BEFORE SWAPPING");
		for(int i=0;i<a.length;i++) {
		
			System.out.println(a[i]);
		}
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[j-1]>a[j]) {
					 temp=a[j-1];
					 a[j-1]=a[j];
					 a[j]=temp;
					
				}
			}
		}
		System.out.println("AFTER SWAPING");
		for(int h=0;h<a.length;h++) {
			
			System.out.println(a[h]);
		}

	}

}
