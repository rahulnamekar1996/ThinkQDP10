package com.demo.basicofarray;

import java.util.Arrays;

public class EvenOrOdd {

	public static void findEvenorOdd(int ar[]) 
	{
		int evenno[]=new int[ar.length];
		int oddno[]=new int[ar.length];
		int indexeven=0,indexodd=0;
		
	   for (int i=0;i<ar.length;i++)
	   {
		   if(ar[i]%2==0) {
			   
			   evenno[indexeven]=ar[i];
			   indexeven++;
		   
		   }
		   else 
		   {
			   oddno[indexodd]=ar[i];
			   indexodd++;
			 
		   }
		   
		   
	   }
	   System.out.println("Even nomber in array = "+Arrays.toString(evenno));
	   System.out.println("odd elements in arrays = "+ Arrays.toString(oddno));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int []arr= {55,54,53,59,58,12,84,81};
	findEvenorOdd(arr);

	}

}
