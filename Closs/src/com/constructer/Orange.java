package com.constructer;

public class Orange {
	String company="tcs";
	int  id=45;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange swathi=new Orange();
		System.out.println("swathi company:"+swathi.company);
		System.out.println("swathi id:"+swathi.id);
		Orange navya =new Orange();
		navya.company="infosys";
		navya.id=34;
		System.out.println("navya company:"+navya.company);
		System.out.println("navya id:"+navya.id);

	}

}
