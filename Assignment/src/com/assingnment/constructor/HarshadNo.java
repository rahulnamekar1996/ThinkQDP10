package com.assingnment.constructor;

public class HarshadNo {
	
	int num;
	
	public HarshadNo() 
	{
		
		
	}
	public HarshadNo(int num)
	{
		this.num=num;
		
	}
    public boolean checkHarshad()
    {
    	int org=num;
    	int rem=0,sum=0;
    	while(num!=0) 
    	{
    		rem=num%10;
    		sum=sum+rem;
    		num=num/10;
    		
    	}
    	if(org % sum==0) 
    	
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
}
