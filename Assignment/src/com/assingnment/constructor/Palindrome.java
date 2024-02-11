package com.assingnment.constructor;

public class Palindrome {
	
	int num;
	
	public Palindrome() 
	{
		num=121;
	}
	public Palindrome(int num) 
	{
		this .num=num;
	}
    public boolean checkPalindrome() 
    {
    	int org=num;
    	int rev =0,rem;
    	while(num!=0)
    	{
    		rem=num%10;
    		rev=(rev*10)+rem;
    		num=num/10;
    	}
    	if(org==rev)
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
}
