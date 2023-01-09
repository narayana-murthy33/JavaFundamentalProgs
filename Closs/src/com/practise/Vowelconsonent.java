package com.practise;
import java.util.Scanner;

public class Vowelconsonent {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter alpahbet value:");
		
	    char name=sc.next().charAt(0);
	    if(name=='e' || name=='a' || name=='i' || name=='o' || name=='u') {
	    	System.out.println(name+":it is vowel");
	    }
	    else {
	    	System.out.println(name+":it is consonent");
	    }
	    
	    
       

	}

}
