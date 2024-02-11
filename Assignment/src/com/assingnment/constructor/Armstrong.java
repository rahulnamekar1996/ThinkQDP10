package com.assingnment.constructor;

public class Armstrong {
	
	int num;
	public Armstrong() 
	{
		
	}
	public Armstrong(int num) 
	{
		this.num=num;
	}
	
	public boolean checkArmstrong() 
	{
		int ori=num;
		int rem,sum=0;
		while(num!=0) 
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
			
		}
		if (sum==ori)
		{
			return true;
		}
		else 
		
		{
			return false;
		}
	}

}
