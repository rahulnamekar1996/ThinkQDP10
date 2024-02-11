package com.demo.basicofarray;

public class MaxAndMinArray {
	
	public static void findMax(int ar[],int n) 
	{
		int min=0,max=0;
		if(n==1)
		{
			min=max=ar[0];
		}
		if (ar[0]>ar[1]) 
		{
			max=ar[0];
			min=ar[1];
		}
		for(int i=1;i<n;i++) 
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
			else if(ar[i]<min) 
			{
				min=ar[i];
			}
		}
		System.out.println("Minimun element = "+min);
		System.out.println("Maimun element = "+max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {10,190,100,151,141};
		int n=5;
		findMax(arr,n);

	}

}
