package com.chella.practice.java.abstrac;

public class AbstractExample   {
	
	public static void main(String arg[])
	
	{
		Employee emp = new Salary("selva" , 1, 5000);
		Salary s= new Salary("chella",2, 6000);
		emp.display();
		s.display();
		emp.showData();
		s.showData();
		
		Employee1 emp1= new Gift("selva", 1, "sanjose", "voucher for 6000");
		emp1.display();

		
	
	}
	
	

}
