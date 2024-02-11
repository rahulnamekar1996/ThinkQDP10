package com.arrayassngnmentday2;

import java.util.Arrays;

public class AdditionInArray {
	
	static void additionOfArray(int []ar,int ar1[]) 
	{
		int sum;
		int sum1[]=new int[ar.length];
		for(int i=0;i<ar.length;i++) 
		{
			sum=ar[i]+ar1[i];
			sum1[i]=sum;
			System.out.println(sum);
		}
		System.out.println(Arrays.toString(sum1));
		
	}
	

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5};
		int arr1[]= {6,7,8,9,10};
		additionOfArray(arr,arr1);

	}

}
