package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filteromapo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> jj=Arrays.asList(2,4,3,6,8);
		System.out.println(jj);
		
	List<Integer> hh=jj.stream().filter(n-> n%2==0).map(n-> n*100). collect(Collectors.toList());
		System.out.println(hh);

	}

}
