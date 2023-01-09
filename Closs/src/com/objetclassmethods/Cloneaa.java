
package com.objetclassmethods;

public class Cloneaa implements Cloneable {
	int id;
	String name;

	@Override
	public String toString() {
		return "Cloneaa [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cloneaa c1=new Cloneaa(124,"nani");
		System.out.println(c1);
		Cloneaa c2=(Cloneaa)c1.clone();
		System.out.println(c2);
		
	
		

	}

	public Cloneaa(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
