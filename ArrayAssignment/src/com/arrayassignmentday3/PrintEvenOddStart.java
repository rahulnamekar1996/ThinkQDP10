package com.arrayassignmentday3;

import java.util.Arrays;

public class PrintEvenOddStart {
	
	public static void printEvenStart(int []ar) 
	{
		for (int i=0;i<ar.length;i++) 
		{
			for(int j=i+1;j<ar.length;i++) 
			{
				if(ar[j]%2==0)
				{
					if(ar[i]%2==1) 
					{
						int temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}

				}
			}
		}
		
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int []arr= {1,2,3,4,5,6};
		printEvenStart(arr);

	}

}
