package com.tns.exception;

public class NestedTry {
	public static void check() {
	String str="tns";
	int slength=str.length();
	System.out.println("the length is"+ slength);
	String anotherString="null";
	int s1=anotherString.length();
	System.out.println("the length is"+s1);
	int y=6;
	try {//outer try
		int z=y/0;//exception occured 
		try {//inner try
			System.out.println("the length is"+s1);//exception arises
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("Indexout of bound"+ex.getMessage());
					
		}
		
		catch(NullPointerException ex) {
			System.out.println("Indexout of bound"+ex.getMessage());
					
		}
	}
		
		catch(ArithmeticException ex) {
			System.out.println("ArithmeticException"+ex.getMessage());
					
			
		}
			
			
		}
	}
