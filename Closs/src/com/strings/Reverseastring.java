package com.strings;
import java.util.Scanner;

public class Reverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name:");
		 String reverse="";
		String name=sc.nextLine();
		System.out.println(name);
	    char letters[]=name.toCharArray();
	    System.out.println(letters);
	    for(int i=letters.length-1;i>=0;i--) {
	    	
	    	reverse=reverse+letters[i];
	    	
	    }
	    System.out.println(reverse);
	    
	    if(name.equals(reverse)) {
	    	System.out.println("it is palindrome");
	    }
	    else{
	    	System.out.println("it is not palindrome");
	    }
		
	

	}

}
