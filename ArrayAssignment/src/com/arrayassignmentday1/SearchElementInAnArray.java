package com.arrayassignmentday1;

import java.util.Scanner;

public class SearchElementInAnArray {
	
	static boolean searchElement(int ar[],int ele)
	{
		for (int i=0;i<ar.length;i++) 
		{
			if(ar[i]==ele) 
			{
				return true;
			}
		}
		return false;
	}
	static int findFrequancy(int ar[],int ele) 
	{
		int count =0;
		for(int i=0; i<ar.length;i++) 
		{
			if(ar[i]==ele) 
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size");
		int size =sc.nextInt();
		int[] arr1 =new int[size];
		System.out.println("Enter elements");
		 for(int i =0; i<arr1.length;i++)
		 {
			 arr1[i]=sc.nextInt();
		 }
		 
		if(searchElement(arr1,5))
		{
			System.out.println("element present in array");
		}
		else
		{
			System.out.println("element not present in array");
		}
		
        System.out.println( findFrequancy(arr1,2));

	}

}
