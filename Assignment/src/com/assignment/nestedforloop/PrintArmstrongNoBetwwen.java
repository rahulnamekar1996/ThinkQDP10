package com.assignment.nestedforloop;

public class PrintArmstrongNoBetwwen 
 {
	public static int power(int base,int pow) {
 
		int i;
		int ans=1;
		
		for(i=1;i<=pow;i++) {
			ans=ans*base;
		}
		return ans;
	}
	
	public static int countDigitsOfNum(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	public static boolean checkArmstrong(int num) {
		
		int sum=0,rem;
		int original=num;
		int pow=countDigitsOfNum(num);
		
		while(num!=0) {
			rem=num%10;
			sum=sum+power(rem,pow); 
			num/=10; 
		}
		
		if(sum==original) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
		public static void printArmstrong(int range)
		{
			int i;
			for (i=1; i<=range;i++) 
			{
				boolean test=checkArmstrong(i);
				if(test)
				{
					System.out.println(i);
				
			}
		}
		
	}
	public static void main(String[] args) {

		printArmstrong(5000);

	}

}

	

