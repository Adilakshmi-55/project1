package com.tns.abstract1;


import java.util.Scanner;

public class Amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int amt;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter amount");
      amt=sc.nextInt();
      Accounts a;
      a=new NonPrime(amt);
      a.deliveryCharges(amt);
	}

}