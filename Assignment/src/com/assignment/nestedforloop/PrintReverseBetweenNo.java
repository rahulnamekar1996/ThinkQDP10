package com.assignment.nestedforloop;

public class PrintReverseBetweenNo {
	public static int findReverse(int num) {
		int rev=0,rem;
		while(num!=0) {
		
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
	
	public static void printRevrse(int range)
	{
		int i;
		
		for(i=501;i<=range;i++)
		{
			System.out.println(i+"="+ findReverse(i))	;	
		}
			
		}
		
	

	public static void main(String[] args)
	{
		
		printRevrse(509);
	}
	
}