package com.demo.merge;

import java.util.Arrays;

public class MergeArray1 {

	static int[] mergeAll(int a1[],int a2[])
	{
		int len1= a1.length;
		int len2= a2.length;
		int mar[]= new int[len1+len2];
		int index=0; // for the mar
		
		for(int i=0;i<a1.length;i++)
		{
			mar[index++]= a1[i];
		}
		
		for(int i=0;i<a2.length;i++)
		{
			mar[index++]= a2[i];
		}
		
		
		return mar;
	}
	
	static int[] mergeAlternate(int a1[],int a2[])
	{
		int len1= a1.length;
		int len2= a2.length;
		int mar[]= new int[len1+len2];
		
		int i, j,index;
		index=0;
		for(i=0,j=0;i<len1&&j<len2;i++,j++)
		{
			mar[index++]= a1[i];
			mar[index++]=a2[j];
		}
		
		while(i<len1)
		{
			mar[index++]= a1[i++];
		}
		while(j<len2)
		{
			mar[index++]= a2[j++];
		}
		
		return mar;
	}
	
	static int[] mergeAlternateSkip(int a1[],int a2[])
	{
		int len1= a1.length;
		int len2= a2.length;
		int maxLength= Math.max(len1, len2);
		int mar[]= new int[maxLength];
		int index=0;
		int i=0;
		while(index<maxLength)
		{
			if(i<a1.length)
			{
				mar[index++]= a1[i++];
			}
			if(i<a2.length)
			{
				mar[index++]=a2[i++];
			}
		}
		
		return mar;
	}

	public static void main(String[] args) {

		int arr1[] = { 6, 7, 12, 5 };
		int arr2[] = { 10, 20, 30, 40, 90, 100 };
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int m[]= mergeAll(arr1, arr2);
		System.out.println("After complete merge:");
		System.out.println(Arrays.toString(m));
		
		System.out.println("------------------------------");
		
		int m1[]= mergeAlternate(arr1, arr2);
		System.out.println("After complete merge alternate:");
		System.out.println(Arrays.toString(m1));
		
         System.out.println("------------------------------");
		
		int m2[]= mergeAlternateSkip(arr1, arr2);
		System.out.println("After complete merge alternate:");
		System.out.println(Arrays.toString(m2));
		
		

	}
}
