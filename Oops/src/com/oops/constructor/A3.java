package com.oops.constructor;

public class A3 {
	int i;
	{
		System.out.println("IIB_1");
		i=100;
	}
	{
		System.out.println("IIB_2");
		System.out.println(i);
		i=200;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("main");
         A3 a= new A3();
         System.out.println(a.i);
	}

}
