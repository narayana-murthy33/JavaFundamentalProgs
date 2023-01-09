package com.Interface;

public  interface Sim {
	void calling1();
	void messeage();
	void data();
	void calling();
    int a=20;
    static void m1() {
    	System.out.println("hello");
    }
    void m2();
    public static void main(String[] args) {
		m1();
		
		
	}
    default  void m3() {
    	System.out.println("nani");
    }
}
