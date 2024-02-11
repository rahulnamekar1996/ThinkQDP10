package com.oops.constructor;

public class Bank {
	private double balance =5000;
	
	public Bank() 
	{
		this (10);
		System .out.println(" default constructor");
	}
	public Bank(double balance)
	{
		this ("Abhay");
		
		System.out.println("Parametresd constructor");
	}
	public Bank(String name) 
	{
		
		System.out.println("string ");
	}

}
