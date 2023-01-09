package com.Interview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {2,6,7,3,2,6,7};
		int []arr2= {7,4,5,2,8,6};
		Arrays1 arr3=new Arrays1();
		arr3.arr(arr1, arr2);

	}
	public void arr(int []arr1,int[]arr2) {
		Set<Integer> set=new HashSet();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				System.out.println("this number is same in both arrays:"+arr2[i]);
			}
		}
	}

}
