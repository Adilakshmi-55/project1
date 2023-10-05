
package com.tns.interface1;

public class Demo implements ChildInterface, InterfaceOne {
	

	@Override
	public void print() {
		System.out.println("print method");
	}
	
	
	

	@Override
	public void show() {
		System.out.println("show method");
	
	}
}