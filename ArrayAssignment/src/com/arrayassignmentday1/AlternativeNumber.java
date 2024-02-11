package com.arrayassignmentday1;

import java.util.Scanner;

public class AlternativeNumber {
	
	public static void alternativeNumber(int ar[]) 
	{
		for(int i=0;i<ar.length;i+=2) 
		{
			System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 ={1,2,3,4,5,6,7,8,9};
				
		
		 alternativeNumber(arr1);

	}

}
