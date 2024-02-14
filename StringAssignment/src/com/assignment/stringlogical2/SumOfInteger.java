package com.assignment.stringlogical2;

public class SumOfInteger {
	static void findSum(String s)
	{
		int sum=0;
		char arr[]=s.toCharArray();	
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(arr[i]))
			{
				int x=Character.getNumericValue(arr[i]);
				sum=sum+x;
			}
		}
		System.out.println("sum is..."+sum);
	}

	

	
	
	public static void SumOfIntegerString(String s)
	{
		int sum =0;
		int avg=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++) 
		{
			if(arr[i]>48&&arr[i]<56) 
			{
				int x=arr[i]-48;
				sum=sum+x;
				avg++;
				
			}
		
		}
		
		System.out.println("Sum is = "+sum);
		System.out.println("Average is = "+sum/avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Sachin score is 567 runs in test match";
        SumOfIntegerString(s);
        String s1="Sachin scores 567 runs in test match";
        findSum(s1 );
	}

}
