package com.assingnment.constructor;

public class Prime {
	
	 
	 int count;
	 int num;
	 public Prime() 
	 {
		 num=11;
	 }
	 
	 public Prime(int num) 
	 
	 {
		 this.num=num;	
		 
	 }
	
	
	public boolean checkPrime() 
	{
		
		for (int i=2;i<=num/2;i++) 
		{
			if(num%i==0) 
			{
				count++;
				break;
			}
		}
		if(count ==0) 
		{
			return true;
		}
		else
		{
		return false;
		}
	}

}
