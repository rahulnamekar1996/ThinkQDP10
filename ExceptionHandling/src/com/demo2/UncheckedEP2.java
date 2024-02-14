package com.demo2;

//Exception Propagation

public class UncheckedEP2 {
	
	void method3()
	{
		int data=50/0;
	}
	
	void method2()
	{
		method3();
	}
	
	void method1()
	{
		try
		{
		method2();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		UncheckedEP2 obj= new UncheckedEP2();
		obj.method1();
		
	}
	

}


