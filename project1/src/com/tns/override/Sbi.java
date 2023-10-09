package com.tns.override;

public class Sbi extends Rbi {

	public float getRateofInterest()
	{
		System.out.println(super.getrateofInterest());
		return 4.4f;
		
	}
}
