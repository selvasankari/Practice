package com.chella.practice.java.abstrac;

public class Gift extends Employee1{
	private String gift;
	
	Gift(String name, int n, String add, String gift)
	{
		super("chella", 3,"sanjose");
		this.gift=gift;
	
	}
	
	public void giftdisplay()
	{
		System.out.println("Gift voucher");
	}

}
