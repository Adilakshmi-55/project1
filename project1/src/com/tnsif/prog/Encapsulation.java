package com.tnsif.prog;

public class Encapsulation {
	protected int serialno;//datamembers
	public String name;
	public int age;
	
		//memberfunction
	
	public void show() {
		System.out.println("serialno"+ serialno+ "\t"+ "name"+ "\t"+ "age"+age);

	}
	public Encapsulation() {// explicit default constructor
		System.out.println("hello");
	}

}