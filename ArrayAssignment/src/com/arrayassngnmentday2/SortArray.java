package com.arrayassngnmentday2;

import java.util.Arrays;

public class SortArray {

	public static void sortArray(int[]ar)
	{
       Arrays.sort(ar);
		
		for (int i=0; i<ar.length;i++) 
		{
		  System.out.println(ar[i]);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,10,9,8,13};
		sortArray(arr);
		

		 

	}

}
