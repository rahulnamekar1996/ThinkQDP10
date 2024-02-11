package com.arrayassignmentday1;

import java.util.Scanner;

public class ReverseArray {

	
	public static void reverseArray(int ar[]) 
	{
		for (int i=ar.length-1;i>=0;i--) 
		{
			System.out.println(ar[i]+" ");
		}
		
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
		 System.out.println("Array in reverse ");
		 reverseArray(arr1);
	}

}
