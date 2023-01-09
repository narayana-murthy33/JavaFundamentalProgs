package com.objetclassmethods;

public class Tostring {
	int id=123;
	String name=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tostring c=new Tostring();
		System.out.println(c);
		try {
		System.out.println(c.name.length());

	}
		catch(NullPointerException e) {
			System.out.println("you have nullpoint exception");
		}
			
		}

	@Override
	public String toString() {
		return "Student details[id=" + id + ", name=" + name + "]";
	}

}
