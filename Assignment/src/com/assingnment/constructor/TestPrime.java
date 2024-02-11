package com.assingnment.constructor;

public class TestPrime {

	public static void main(String[] args) {
		Prime p=new Prime(19);

		if(p.checkPrime()) 
		
		{
			System.out.println("prime number");
		}
		else 
		{
			System.out.println( "not prime");
		}
		

	}

}
