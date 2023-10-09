package com.tns.staticprg;

public class EmployeeDemo {
 public static void main(String[] args) {
	 Employee ob=new Employee("adi",123);
	 System.out.println(ob); 
	 Employee companyName;
	 //accessing the static using classname 
	 ob=new Employee("triveni",345);
	 System.out.println(ob); 
	 
 }
}
