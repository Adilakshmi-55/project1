package com.tns.staticprg;
//program to demonstrate static method and block
public class Myclass {
	private int section;
	private static int srNo;
	 
	
	static {
	System.out.println("-----staticblock-----");
	srNo=1000;
	
	}
	//default constructor
	//nonstatic can access the both static and nonstatic
	Myclass() {
		System.out.println("-----default constructor-----");
		srNo++;
		section++;
	}

	static void display() {

		//System.out.println("section"+section);
		System.out.println("serialNo"+srNo);
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
		
	}

