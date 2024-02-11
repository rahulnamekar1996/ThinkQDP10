package com.demo.basicofarray;

import java.util.Arrays;

public class HalfSort {
	
	public static void halfSort(int ar[] )
	{
		
		for (int i=1;i<ar.length/2;i++) 
		{
			for (int j=i+1;j<ar.length/2;j++) 
			{
				if(ar[i]>ar[j]) 
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]= temp;
				}
			}
		}
		for (int i=(ar.length/2)+1;i<ar.length-1;i++) 
		{
			for (int j=i+1;j<ar.length-1;j++) 
			{
				if(ar[i]<ar[j]) 
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]= temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {11,5,2,6,20,8,9,4,19};
		halfSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
