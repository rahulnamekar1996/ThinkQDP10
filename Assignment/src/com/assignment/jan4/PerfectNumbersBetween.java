package com.assignment.jan4;

import java.util.Scanner;

public class PerfectNumbersBetween {
	
	public static boolean checkPeffect(int num)
	{
		int i;
		int sum=0;
		
		for(i=1;i<num;i++) 
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num) 
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.println(" enter number");
		num=sc.nextInt();
     
       for(int i=1;i<=num;i++) 
       {
    	   if(checkPeffect(i)) 
    	   {
    		   System.out.println(i);
    	   }
       }

	}

}
