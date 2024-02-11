package com.demo.whileloop;

public class PrintNumbers {

	public static void main(String[] args) {
		int i=1;
		while(i<=50) 
		{
			if(i%5==0)
			{
				System.out .println(i+"= is divisible by 5");
				
			
			}
			
			else 
			
			{
				System.out.println(i+"= is not divisible by 5");
			}
			i++;
		}
		

	}

}
