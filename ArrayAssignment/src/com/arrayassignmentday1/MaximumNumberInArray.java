package com.arrayassignmentday1;

import java.util.Scanner;

public class MaximumNumberInArray {
	
	public static void maximumNumber(int ar[]) 
	{
		int max=ar[0];
		for(int i =0;i<ar.length;i++) 
		{
			if (max<ar[i]) 
			{
				max=ar[i];
			}
		}
		System.out.println("maximum number in an array ="+max);
	}
	public static void minimumNumber(int ar[]) 
	{
		int min=ar[0];
		for(int i =0;i<ar.length;i++) 
		{
			if (min>ar[i]) 
			{
				min=ar[i];
			}
		}
		System.out.println("minimum element in an array ="+min);
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
		 maximumNumber(arr1);
		 minimumNumber(arr1);
	}

}
