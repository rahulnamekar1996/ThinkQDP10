package com.demo.methodpractice;

public class CheckPalindrome {
	
	public static void checkPalindrome(int num) 
	{
		int temp =num;
		int rem=0,rev=0;
		while (temp!=0)
		{
			rem=temp %10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(rev==num) 
		{
			System.out.println(" is palindrome");	
			
		}
		else {}
	
		
	}

	public static void main(String[] args) {
		

	}

}
