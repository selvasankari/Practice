package com.chella.practice.java;

 class  thisclass  {

	  int a,b;
	  
	public void setData(int a ,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void showData()
	{
		System.out.println("value of a" +a);
		System.out.println("value of b" +b);
		
	}
	/**
	 * @param args
	 */
	
}

 class student
{
	public static void main(String[] args) {
		thisclass obj = new thisclass();
		obj.setData(8, 2);
		obj.showData();
		student a= new student();
		a.showData(6);

	}

	
	public void showData( int a)
	{
		System.out.println(a);
	}
}


